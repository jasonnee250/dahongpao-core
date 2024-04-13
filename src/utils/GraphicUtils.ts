import { GraphicNode } from "@/graphic";
import { GraphicNodeType, Point, RectNode } from "@/basic";
import { AffineMatrix } from "@/math";

/**
 * 基本utils类
 */
export class GraphicUtils {
  /**
   * 获取中心点
   */
  static centerPoint(node: GraphicNode): Point {
    return {
      x: node.x + 0.5 * node.w,
      y: node.y + 0.5 * node.h,
    };
  }
  /**
   * 获取矩形上方中点
   */
  static topPoint(node: GraphicNode): Point {
    return {
      x: node.x + 0.5 * node.w,
      y: node.y,
    };
  }
  /**
   * 获取图形右方中点
   */
  static rightPoint(node: GraphicNode): Point {
    if (node.type === GraphicNodeType.Parallelogram) {
      const delta = 0.2 * node.w;
      return {
        x: node.x + node.w - 0.5 * delta,
        y: node.y + 0.5 * node.h,
      };
    }
    if (node.type === GraphicNodeType.Triangle) {
      return {
        x: node.x + node.w - 0.25 * node.w,
        y: node.y + 0.5 * node.h,
      };
    }
    if (node.type === GraphicNodeType.Trapezoid) {
      const delta = 0.2 * node.w;
      return {
        x: node.x + node.w - 0.5 * delta,
        y: node.y + 0.5 * node.h,
      };
    }
    return {
      x: node.x + node.w,
      y: node.y + 0.5 * node.h,
    };
  }
  /**
   * 获取图形下方中点
   */
  static bottomPoint(node: GraphicNode): Point {
    return {
      x: node.x + 0.5 * node.w,
      y: node.y + node.h,
    };
  }
  /**
   * 获取图形左方中点
   */
  static leftPoint(node: GraphicNode): Point {
    if (node.type === GraphicNodeType.Parallelogram) {
      const delta = 0.2 * node.w;
      return {
        x: node.x + 0.5 * delta,
        y: node.y + 0.5 * node.h,
      };
    }
    if (node.type === GraphicNodeType.Triangle) {
      return {
        x: node.x + 0.25 * node.w,
        y: node.y + 0.5 * node.h,
      };
    }
    if (node.type === GraphicNodeType.Trapezoid) {
      const delta = 0.2 * node.w;
      return {
        x: node.x + 0.5 * delta,
        y: node.y + 0.5 * node.h,
      };
    }
    return {
      x: node.x,
      y: node.y + 0.5 * node.h,
    };
  }
  /**
   * 获取外接矩形形上方左角点
   */
  static topLeft(node: GraphicNode): Point {
    return {
      x: node.x,
      y: node.y,
    };
  }
  /**
   * 获取外接矩形形上方右角点
   */
  static topRight(node: GraphicNode): Point {
    return {
      x: node.x + node.w,
      y: node.y,
    };
  }
  /**
   * 获取外接矩形形下方左角点
   */
  static bottomLeft(node: GraphicNode): Point {
    return {
      x: node.x,
      y: node.y + node.h,
    };
  }
  /**
   * 获取外接矩形形下方右角点
   */
  static bottomRight(node: GraphicNode): Point {
    return {
      x: node.x + node.w,
      y: node.y + node.h,
    };
  }
  /**
   * 计算折线中间路径点方法
   * 折线只折一次情况
   * A----
   *     ｜
   *     ｜
   *     B
   */
  static middleInsertPoint(start: Point, end: Point, points: Point[]) {
    const p1 = new Point(start.x, end.y);
    points.push(start, p1, end);
  }
  /**
   * 计算折线中间路径点方法
   * 折线只折2次情况
   * A----
   *     ｜
   *     ｜
   *      -----B
   */
  static doubleMiddleInsertPoint(start: Point, end: Point, points: Point[]) {
    const p1 = new Point(0.5 * (start.x + end.x), start.y);
    const p2 = new Point(0.5 * (start.x + end.x), end.y);
    points.push(start, p1, p2, end);
  }
  /**
   * 判断点在矩形中的方法
   */
  static rectContains(point: Point, node: GraphicNode): boolean {
    return (
      point.x > node.x &&
      point.x < node.x + node.w &&
      point.y > node.y &&
      point.y < node.y + node.h
    );
  }
  /**
   * 计算亮点之间距离
   */
  static distance(a: Point, b: Point): number {
    return Math.sqrt((a.x - b.x) * (a.x - b.x) + (a.y - b.y) * (a.y - b.y));
  }
  /**
   * 计算两点连接的直线的角度
   */
  static lineAngle(a: Point, b: Point): number {
    if (Math.abs(a.x - b.x) < 1e-3) {
      return b.y > a.y ? Math.PI * 0.5 : -Math.PI * 0.5;
    }
    const k = (b.y - a.y) / (b.x - a.x);
    let rad = Math.atan(k);
    if (b.x < a.x) {
      rad += Math.PI;
    }
    return rad;
  }
  /**
   * 计算箭头坐标
   */
  static basicGetArrowPoint(start: Point, end: Point, p1: Point, p2: Point) {
    const lineAngle = GraphicUtils.lineAngle(start, end);
    const m = AffineMatrix.generateMatrix()
      .translate(start.x, start.y)
      .rotate2(lineAngle);
    const a = m.crossPoint(p1);
    const b = m.crossPoint(p2);
    return { a, b };
  }
  /**
   * 获取左边箭头坐标点
   */
  static getLArrowPoint(start: Point, end: Point, l: number = 5) {
    const p1 = new Point(Math.sqrt(3) * 0.5 * l, 0.5 * l);
    const p2 = new Point(Math.sqrt(3) * 0.5 * l, -0.5 * l);
    return GraphicUtils.basicGetArrowPoint(start, end, p1, p2);
  }
  /**
   * 获取右边箭头点
   */
  static getRArrowPoint(start: Point, end: Point, l: number = 5) {
    const distance = GraphicUtils.distance(start, end);
    const p1 = new Point(distance - Math.sqrt(3) * 0.5 * l, 0.5 * l);
    const p2 = new Point(distance - Math.sqrt(3) * 0.5 * l, -0.5 * l);
    return GraphicUtils.basicGetArrowPoint(start, end, p1, p2);
  }
  /**
   * 获取外接矩形
   */
  static getBounds(nodes: RectNode[], id: string = "getBounds"): RectNode {
    const xList = [];
    const yList = [];
    for (const node of nodes) {
      xList.push(node.maxX, node.minX);
      yList.push(node.maxY, node.minY);
    }
    return {
      id,
      minX: Math.min(...xList),
      maxX: Math.max(...xList),
      minY: Math.min(...yList),
      maxY: Math.max(...yList),
    };
  }
  /**
   * 根据传入点获取外接矩形
   */
  static getBoundsByPoints(points: Point[]): RectNode {
    const xList = [];
    const yList = [];
    for (const node of points) {
      xList.push(node.x);
      yList.push(node.y);
    }
    return {
      id: "getBounds",
      minX: Math.min(...xList),
      maxX: Math.max(...xList),
      minY: Math.min(...yList),
      maxY: Math.max(...yList),
    };
  }
}

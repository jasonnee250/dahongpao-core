import { IGraphicLine } from "@/graphic/IGraphicLine";
import { GraphicNode } from "@/graphic/GraphicNode";
import { GraphLinkLine } from "@/graphic/GraphicLinkLine";
import { Point, RectNode } from "@/basic";
import { IGraphicElement } from "@/graphic";
import { AffineMatrix } from "@/math";
import { GMLData } from "@/render/GMLData.ts";

/**
 * 渲染引擎
 */
export interface GMLRender {
  /**
   * 绘制画布
   */
  canvas: HTMLCanvasElement | null;
  /**
   * 全局仿射矩阵，记录缩放平移旋转等视图变换信息
   */
  globalTransform: AffineMatrix;

  /**
   * 初始化方法，需要传入canvas
   * @param element
   */
  init(element: HTMLCanvasElement): void;

  /**
   * 重置方法
   */
  reset(): void;

  /**
   * 将文本转化为结构化数据方法
   * @param text
   */
  parse2GMLData(text: string): GMLData;

  /**
   * 绘制方法
   * @param text
   */
  draw(text: string): void;

  /**
   * 根据节点信息绘制
   * @param nodeMap
   * @param lineMap
   */
  drawData(
    nodeMap: Map<string, GraphicNode>,
    lineMap: Map<string, IGraphicLine>,
  ): void;

  /**
   * 根据连接关系计算连线位置信息
   * @param nodeMap
   * @param linkLine
   */
  layoutLine(
    nodeMap: Map<string, GraphicNode>,
    linkLine: GraphLinkLine,
  ): IGraphicLine | null;

  /**
   * 画布整体缩放变化
   * @param sx
   * @param sy
   */
  scale(sx: number, sy: number): void;

  /**
   * 画布整体平移变换
   * @param dx
   * @param dy
   */
  translation(dx: number, dy: number): void;

  /**
   * 画布视图重置
   */
  resetTransform(): void;

  /**
   * 脏区渲染
   * @param bounds 脏区bounds
   * @param graphicList 需重绘的节点
   */
  dirtyDraw(bounds: RectNode, graphicList: IGraphicElement[]): void;

  /**
   * 获取画布视图bounds
   */
  getViewPortBounds(): RectNode;

  /**
   * 坐标变换，根据鼠标点获取画布坐标
   * 该event通常为挂载在document上的
   * @param event
   */
  getGlobalPoint(event: PointerEvent): Point;

  /**
   * 坐标变换，将点坐标转化为画布全局坐标
   * @param point
   */
  transformToGlobal(point: Point): Point;

  /**
   * 获取当前渲染引擎scale
   */
  getScale(): number;
}

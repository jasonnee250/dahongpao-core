//折线
import { IGraphicLine } from "./IGraphicLine";
import { Point } from "@/basic/Point";
import { RectNode } from "@/basic/RectNode";
import { GraphicUtils } from "@/utils";

/**
 * 折线基本类
 */
export class PolyLine extends IGraphicLine {
  /**
   * 折线连接点
   */
  points: Point[] = [];

  /**
   * 绘制方法
   */
  draw(): void {}

  /**
   * 返回外接矩形
   */
  getRectNode(): RectNode {
    const bounds = GraphicUtils.getBoundsByPoints(this.points);
    bounds.minX = bounds.minX - this.width;
    bounds.minY = bounds.minY - this.width;
    bounds.maxX = bounds.maxX + 2 * this.width;
    bounds.maxY = bounds.maxY + 2 * this.width;
    bounds.id = this.id;
    return bounds;
  }
}

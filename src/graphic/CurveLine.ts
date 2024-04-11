import { Point } from "@/basic/Point.ts";
import { IGraphicLine } from "@/graphic/IGraphicLine.ts";
import { RectNode } from "src/basic/RectNode";
import { GraphicUtils } from "@/utils";

export class CurveLine extends IGraphicLine {
  points: Point[] = [];

  draw() {}

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

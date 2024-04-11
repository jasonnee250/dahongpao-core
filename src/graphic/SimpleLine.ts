//直线
import { Point, RectNode } from "@/basic";
import { IGraphicLine } from "./IGraphicLine.ts";
import { GraphicUtils } from "@/utils";

export class SimpleLine extends IGraphicLine {
  start: Point = new Point(0, 0);
  end: Point = new Point(0, 0);

  draw() {}

  getRectNode(): RectNode {
    const bounds = GraphicUtils.getBoundsByPoints([this.start, this.end]);
    bounds.minX = bounds.minX - this.width;
    bounds.minY = bounds.minY - this.width;
    bounds.maxX = bounds.maxX + 2 * this.width;
    bounds.maxY = bounds.maxY + 2 * this.width;
    bounds.id = this.id;
    return bounds;
  }
}

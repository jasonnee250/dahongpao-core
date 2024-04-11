import { RectNode } from "@/basic/RectNode.ts";
import { IGraphicElement } from "./IGraphicElement.ts";
import { GraphicNodeType } from "@/basic/GraphicNodeType.ts";

export class GraphicNode implements IGraphicElement {
  type: GraphicNodeType = GraphicNodeType.Rect;
  id: string;
  x: number = 0;
  y: number = 0;
  w: number = 100;
  h: number = 50;
  angle: number = 0;
  color: number = 0xfbfbfb;
  text: string = "";
  alpha: number = 1;
  borderWidth: number = 1;
  borderColor: number = 0x000000;
  borderAlpha: number = 1;
  fontColor: number = 0x000000;
  fontSize: number = 14;
  zIndex: number = 0; //用于层级排序

  constructor(id: string) {
    this.id = id;
  }

  draw(): void {}

  getRectNode(): RectNode {
    return {
      id: this.id,
      minX: this.x - this.borderWidth,
      minY: this.y - this.borderWidth,
      maxX: this.x + this.w + 2 * this.borderWidth,
      maxY: this.y + this.h + 2 * this.borderWidth,
    };
  }
}

import { RectNode } from "@/basic";

export interface IGraphicElement {
  zIndex: number;

  draw(): void;

  getRectNode(): RectNode;
}

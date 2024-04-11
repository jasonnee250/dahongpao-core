import { IGraphicLine } from "@/graphic/IGraphicLine";
import { GraphicNode } from "@/graphic/GraphicNode";
import { GraphLinkLine } from "@/graphic/GraphicLinkLine";
import { RectNode } from "@/basic";
import { IGraphicElement } from "@/graphic";

export interface GMLData {
  lineMap: Map<string, IGraphicLine>;
  linkMap: Map<string, GraphLinkLine>;
  nodeMap: Map<string, GraphicNode>;
}

export interface GMLRender {
  canvas: HTMLElement | null;
  init(element: HTMLCanvasElement): void;
  reset(): void;
  parse2GMLData(text: string): GMLData;
  draw(text: string): void;
  drawData(
    nodeMap: Map<string, GraphicNode>,
    lineMap: Map<string, IGraphicLine>,
  ): void;
  layoutLine(
    nodeMap: Map<string, GraphicNode>,
    linkLine: GraphLinkLine,
  ): IGraphicLine | null;

  scale(sx: number, sy: number): void;
  translation(dx: number, dy: number): void;
  resetTransform(): void;
  dirtyDraw(bounds: RectNode, graphicList: IGraphicElement[]): void;
}

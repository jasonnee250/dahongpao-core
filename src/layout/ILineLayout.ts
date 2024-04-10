import {GraphLineType} from "@/basic";
import {GraphicNode, GraphLinkLine, IGraphicLine} from "@/graphic";

export abstract class ILineLayout {
    abstract type: GraphLineType;

    abstract layout(nodeMap: Map<string, GraphicNode>, linkLine: GraphLinkLine): IGraphicLine | null;
}
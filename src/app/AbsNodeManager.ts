import {GraphicNode, GraphLinkLine, IGraphicLine} from "src/graphic";

export abstract class AbsNodeManager {

    abstract nodeMap: Map<string, GraphicNode>;
    abstract linkMap: Map<string, GraphLinkLine>;
    abstract lineMap: Map<string, IGraphicLine>;
}
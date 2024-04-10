import {LineArrowType} from "@/basic/LineArrowType.ts";
import {GraphLineType} from "@/basic/GraphLineType.ts";

export class GraphLinkLine {
    id: string;
    start: string = "";
    end: string = "";
    lArrow: LineArrowType = LineArrowType.None;
    rArrow: LineArrowType = LineArrowType.None;
    type: GraphLineType = GraphLineType.PolyLine;
    zIndex:number=0;

    constructor(id: string) {
        this.id = id;
    }
}

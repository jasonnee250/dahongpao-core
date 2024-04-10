import {IGraphicElement} from "@/graphic/IGraphicElement.ts";
import {LineArrowType} from "@/basic/LineArrowType.ts";
import {RectNode} from "@/basic/RectNode.ts";

export abstract class IGraphicLine implements IGraphicElement {
    id: string;
    color: number = 0x000000;
    alpha: number = 1;
    width: number = 1;
    fontColor: number = 0x000000;
    fontSize: number = 14;
    lArrow: LineArrowType = LineArrowType.None;
    rArrow: LineArrowType = LineArrowType.None;
    zIndex: number = 0;//用于层级排序

    constructor(id: string) {
        this.id = id;
    }

    abstract draw(): void;

    abstract getTreeNode(): RectNode;

}
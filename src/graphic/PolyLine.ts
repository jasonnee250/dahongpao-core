
//折线
import {IGraphicLine} from "src/graphic/IGraphicLine";
import {Point} from "src/basic/Point";
import {RectNode} from "src/basic/RectNode";
import {GraphicUtils} from "@/utils";

export class PolyLine extends IGraphicLine {
    points: Point[] = [];

    draw(): void {
    };

    getTreeNode(): RectNode {
        const bounds = GraphicUtils.getBoundsByPoints(this.points);
        bounds.minX = bounds.minX - this.width;
        bounds.minY = bounds.minY - this.width;
        bounds.maxX = bounds.maxX + 2 * this.width;
        bounds.maxY = bounds.maxY + 2 * this.width;
        bounds.id = this.id;
        return bounds;
    }
}
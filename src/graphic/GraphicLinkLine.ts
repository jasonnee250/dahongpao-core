import { LineArrowType } from "@/basic/LineArrowType.ts";
import { GraphLineType } from "@/basic/GraphLineType.ts";

/**
 * 连接线定义，表示节点之间的连接关系
 */
export class GraphLinkLine {
  /**
   * id
   */
  id: string;
  /**
   * 起点
   */
  start: string = "";
  /**
   * 终点
   */
  end: string = "";
  /**
   * 左箭头类型
   */
  lArrow: LineArrowType = LineArrowType.None;
  /**
   * 右箭头类型
   */
  rArrow: LineArrowType = LineArrowType.None;
  /**
   * 连线类型，折线，直线，曲线等
   */
  type: GraphLineType = GraphLineType.PolyLine;
  /**
   * 图形zIndex，表示层级关系
   */
  zIndex: number = 0;

  constructor(id: string) {
    this.id = id;
  }
}

import { GraphLineType } from "@/basic";
import { GraphicNode, GraphLinkLine, IGraphicLine } from "@/graphic";

/**
 * 连线计算的布局规则
 */
export abstract class ILineLayout {
  /**
   * 类型
   */
  abstract type: GraphLineType;

  /**
   * 布局计算接口
   * @param nodeMap
   * @param linkLine
   */
  abstract layout(
    nodeMap: Map<string, GraphicNode>,
    linkLine: GraphLinkLine,
  ): IGraphicLine | null;
}

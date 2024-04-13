import { GraphicNode, GraphLinkLine, IGraphicLine } from "@/graphic";

/**
 * 画布所需渲染数据定义
 * lineMap是画布实际绘制的连线
 * linkMap是辅助数据，记载了画布中节点的连接关系，
 * 在根据节点位置自动计算连线路径时会用到
 * nodeMap为节点信息
 */
export interface GMLData {
  lineMap: Map<string, IGraphicLine>;
  linkMap: Map<string, GraphLinkLine>;
  nodeMap: Map<string, GraphicNode>;
}

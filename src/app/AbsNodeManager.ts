import { GraphicNode, GraphLinkLine, IGraphicLine } from "@/graphic";
import { GMLData } from "@/render";
import { RectNode } from "@/basic";

/**
 * 节点管理器基类
 */
export abstract class AbsNodeManager {
  /**
   * 节点map
   */
  abstract nodeMap: Map<string, GraphicNode>;
  /**
   * 连线关系map
   */
  abstract linkMap: Map<string, GraphLinkLine>;
  /**
   * 存储线信息
   */
  abstract lineMap: Map<string, IGraphicLine>;

  /**
   * 清空方法
   */
  abstract clear(): void;

  /**
   * 设置数据
   * @param data 给node manager加载节点及连线等信息
   */
  abstract setData(data: GMLData): void;

  /**
   * 返回给定矩形区域节点列表
   * @param minX 矩形区域最小x
   * @param minY 矩形区域最小y
   * @param maxX 矩形区域最大x
   * @param maxY 矩形区域最大y
   */
  abstract searchNodes(
    minX: number,
    minY: number,
    maxX: number,
    maxY: number,
  ): GraphicNode[];

  /**
   * 在索引树中删除节点
   * @param node
   */
  abstract removeIndexNode(node: RectNode): void;

  /**
   * 在索引树中新增节点
   * @param node
   */
  abstract addIndexNode(node: RectNode): void;

  /**
   * 计算节点node的关联连线
   * @param node
   */
  abstract relatedLinkLine(node: GraphicNode): Set<string>;
}

import {Point, RectNode} from "@/basic";

/**
 * 基本绘制单元接口
 */
export interface IGraphicElement {
  /**
   * 表示id
   */
  id:string;
  /**
   * 表示节点层级关系
   */
  zIndex: number;

  /**
   * 绘制方法
   */
  draw(): void;

  /**
   * 返回外接矩形大小
   */
  getRectNode(): RectNode;

  /**
   * judge point is in graphic
   */
  contains(point:Point):boolean;
}

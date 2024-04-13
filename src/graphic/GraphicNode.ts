import { RectNode } from "@/basic/RectNode.ts";
import { IGraphicElement } from "./IGraphicElement.ts";
import { GraphicNodeType } from "@/basic/GraphicNodeType.ts";

/**
 * 图形绘制节点基本数据类型
 */
export class GraphicNode implements IGraphicElement {
  /**
   * 图形节点类型
   */
  type: GraphicNodeType = GraphicNodeType.Rect;
  /**
   * 节点id
   */
  id: string;
  /**
   * x坐标
   */
  x: number = 0;
  /**
   * y坐标
   */
  y: number = 0;
  /**
   * 节点外接矩形宽度
   */
  w: number = 100;
  /**
   * 节点外接矩形高度
   */
  h: number = 50;
  /**
   * 节点角度
   */
  angle: number = 0;
  /**
   * 节点颜色信息
   */
  color: number = 0xfbfbfb;
  /**
   * 节点文本信息
   */
  text: string = "";
  /**
   * 节点透明度
   */
  alpha: number = 1;
  /**
   * 节点描边宽度
   */
  borderWidth: number = 1;
  /**
   * 节点描边颜色
   */
  borderColor: number = 0x000000;
  /**
   * 节点描边透明度
   */
  borderAlpha: number = 1;
  /**
   * 节点文字颜色
   */
  fontColor: number = 0x000000;
  /**
   * 节点文字字号大小
   */
  fontSize: number = 14;
  /**
   * 节点z-index,表示层级
   */
  zIndex: number = 0; //用于层级排序

  constructor(id: string) {
    this.id = id;
  }

  /**
   * 节点绘制方法，默认空实现
   */
  draw(): void {}

  /**
   * 返回节点外接矩形
   */
  getRectNode(): RectNode {
    return {
      id: this.id,
      minX: this.x - this.borderWidth,
      minY: this.y - this.borderWidth,
      maxX: this.x + this.w + 2 * this.borderWidth,
      maxY: this.y + this.h + 2 * this.borderWidth,
    };
  }
}

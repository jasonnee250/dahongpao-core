import { IGraphicElement } from "./IGraphicElement.ts";
import { LineArrowType } from "@/basic/LineArrowType.ts";
import { RectNode } from "@/basic/RectNode.ts";

/**
 * 画布中绘制线基类
 */
export abstract class IGraphicLine implements IGraphicElement {
  /**
   * id
   */
  id: string;
  /**
   * 颜色
   */
  color: number = 0x000000;
  /**
   * 透明度
   */
  alpha: number = 1;
  /**
   * 线宽度
   */
  width: number = 1;
  /**
   * 字体颜色
   */
  fontColor: number = 0x000000;
  /**
   * 字体字号大小
   */
  fontSize: number = 14;
  /**
   * 连线左箭头类型
   */
  lArrow: LineArrowType = LineArrowType.None;
  /**
   * 连线右箭头类型
   */
  rArrow: LineArrowType = LineArrowType.None;
  /**
   * 层级关系
   */
  zIndex: number = 0; //用于层级排序

  constructor(id: string) {
    this.id = id;
  }

  /**
   * 绘制方法
   */
  abstract draw(): void;

  /**
   * 返回外接矩形
   */
  abstract getRectNode(): RectNode;
}

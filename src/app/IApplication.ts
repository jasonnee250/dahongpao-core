import { IPlugin } from "./IPlugin.ts";
import { AbsNodeManager } from "./AbsNodeManager.ts";
import { GMLRender } from "@/render/GMLRender.ts";

/**
 * 应用基类，可由用户自定义该应用能力，类型等
 */
export interface IApplication {
  /**
   * 渲染引擎
   */
  gmlRender: GMLRender;
  /**
   * 节点管理
   */
  nodeManager: AbsNodeManager;
  /**
   * 插件
   */
  plugins: IPlugin[];

  /**
   * App启动方法回调
   */
  start(): void;

  /**
   * App停止方法回调
   */
  stop(): void;

  /**
   * 通过GML文本生成图
   * @param text GML文本
   */
  parse(text: string): void;

  /**
   * 重绘制当前所有节点的方法
   */
  redraw(): void;

  /**
   * 注册插件方法
   * @param plugin 插件
   */
  registerPlugin(plugin: IPlugin): void;

  /**
   * 重绘屏幕范围内的节点
   */
  redrawWithinViewBounds(): void;
}

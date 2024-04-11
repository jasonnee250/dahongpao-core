import { GMLRender } from "@/render";
import { IPlugin } from "./IPlugin.ts";
import { AbsNodeManager } from "./AbsNodeManager.ts";

export interface IApplication {
  //渲染
  gmlRender: GMLRender;
  //节点管理
  nodeManager: AbsNodeManager;
  //插件
  plugins: IPlugin[];

  start(): void;

  stop(): void;

  parse(text: string): void;

  redraw(): void;

  registerPlugin(plugin: IPlugin): void;
}

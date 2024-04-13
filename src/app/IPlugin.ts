/**
 * 插件类
 */
export interface IPlugin {
  /**
   * 插件启动回调
   */
  start(): void;

  /**
   * 插件关闭回调
   */
  stop(): void;
}

import { RMGLParserListenerImpl } from "@/parser/RMGLParserListenerImpl";
import RMGLLexer from "@/parser/grammar/basic/RMGLLexer";
import { CharStream, CommonTokenStream, ParseTreeWalker } from "antlr4";
import RMGLParser from "@/parser/grammar/basic/RMGLParser";

/**
 * GML语言解析器
 */
export class GraphicLanguageParser {
  /**
   * 语法树遍历时的监听器
   */
  listener: RMGLParserListenerImpl = new RMGLParserListenerImpl();

  /**
   * 解析。将文本转换为结构化数据
   * @param text
   */
  public parseString(text: string): void {
    const inputStream = new CharStream(text);
    const lexer = new RMGLLexer(inputStream);
    const tokens = new CommonTokenStream(lexer);
    const parser = new RMGLParser(tokens);
    ParseTreeWalker.DEFAULT.walk(this.listener, parser.statement());
  }
}

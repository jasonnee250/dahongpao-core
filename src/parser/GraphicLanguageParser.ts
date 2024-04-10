import {RMGLParserListenerImpl} from "@/parser/RMGLParserListenerImpl";
import RMGLLexer from "@/parser/grammar/basic/RMGLLexer";
// @ts-ignore
import {CharStream, CommonTokenStream, ParseTreeWalker} from "antlr4";
import RMGLParser from "@/parser/grammar/basic/RMGLParser";


export class GraphicLanguageParser{

    listener:RMGLParserListenerImpl=new RMGLParserListenerImpl();

    public parseString(text:string):void{
        const inputStream = new CharStream(text);
        const lexer = new RMGLLexer(inputStream);
        const tokens=new CommonTokenStream(lexer);
        const parser=new RMGLParser(tokens);
        ParseTreeWalker.DEFAULT.walk(this.listener, parser.statement());
    }
}

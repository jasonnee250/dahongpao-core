parser grammar RMGLParser;

options {
    tokenVocab = RMGLLExer;
}

statement:NL* (lineGraphicDefine|annotationDefine|linkDefine)+;

//common
variableName: TokenChar;
charText: TokenChar;
annotationText:AnnotationChar*;
lineAnnotationText:LineAnnotationChar*;
//line graphic define
lineGraphicDefine: graphicType (variableName Comma)* variableName  (propertyDefine|textDefine)* NL*;
graphicType: Rect|Circle|Diamond|Parallelogram|Trapezoid|Triangle|TextType;
propertyDefine:(X|Y|W|H|Angle|Color|Alpha|BorderColor|BorderWidth|BorderAlpha|FontSize|FontColor|HorizonAlign|VerticalAlign) charText (Comma|Semicolon);
textDefine:Text Quotation annotationText AnnotationQuotation  (Comma|Semicolon);
annotationDefine: Slash lineAnnotationText LineAnnotationNL NL*;
//linkDefine
linkDefine: TokenChar LArrow? (Line|SimpleLine|PolyLine|CurveLine) RArrow? TokenChar (Comma|Semicolon) NL*;
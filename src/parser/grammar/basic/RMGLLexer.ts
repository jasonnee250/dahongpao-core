// Generated from RMGLLexer.g4 by ANTLR 4.13.1
// noinspection ES6UnusedImports,JSUnusedGlobalSymbols,JSUnusedLocalSymbols
import {
	ATN,
	ATNDeserializer,
	CharStream,
	DecisionState, DFA,
	Lexer,
	LexerATNSimulator,
	RuleContext,
	PredictionContextCache,
	Token
} from "antlr4";
export default class RMGLLexer extends Lexer {
	public static readonly Rect = 1;
	public static readonly Circle = 2;
	public static readonly Diamond = 3;
	public static readonly Parallelogram = 4;
	public static readonly Trapezoid = 5;
	public static readonly Triangle = 6;
	public static readonly TextType = 7;
	public static readonly Line = 8;
	public static readonly SimpleLine = 9;
	public static readonly PolyLine = 10;
	public static readonly CurveLine = 11;
	public static readonly LArrow = 12;
	public static readonly RArrow = 13;
	public static readonly X = 14;
	public static readonly Y = 15;
	public static readonly W = 16;
	public static readonly H = 17;
	public static readonly Angle = 18;
	public static readonly Color = 19;
	public static readonly Text = 20;
	public static readonly Alpha = 21;
	public static readonly BorderWidth = 22;
	public static readonly BorderColor = 23;
	public static readonly BorderAlpha = 24;
	public static readonly FontSize = 25;
	public static readonly FontColor = 26;
	public static readonly Comma = 27;
	public static readonly Semicolon = 28;
	public static readonly Quotation = 29;
	public static readonly Slash = 30;
	public static readonly TokenChar = 31;
	public static readonly NL = 32;
	public static readonly Space = 33;
	public static readonly Char = 34;
	public static readonly AnnotationQuotation = 35;
	public static readonly AnnotationChar = 36;
	public static readonly LineAnnotationNL = 37;
	public static readonly LineAnnotationChar = 38;
	public static readonly EOF = Token.EOF;
	public static readonly ANNOTATION_MODE = 1;
	public static readonly LINE_ANNOTATION_MODE = 2;

	public static readonly channelNames: string[] = [ "DEFAULT_TOKEN_CHANNEL", "HIDDEN" ];
	public static readonly literalNames: (string | null)[] = [ null, "'Rect'", 
                                                            "'Circle'", 
                                                            "'Diamond'", 
                                                            "'Parallelogram'", 
                                                            "'Trapezoid'", 
                                                            "'Triangle'", 
                                                            "'Text'", "'--'", 
                                                            "'-line-'", 
                                                            "'-poly-'", 
                                                            "'-curve-'", 
                                                            "'<'", "'>'", 
                                                            "'x'", "'y'", 
                                                            "'w'", "'h'", 
                                                            "'angle'", "'color'", 
                                                            "'text'", "'alpha'", 
                                                            "'borderWidth'", 
                                                            "'borderColor'", 
                                                            "'borderAlpha'", 
                                                            "'fontSize'", 
                                                            "'fontColor'", 
                                                            "','", "';'", 
                                                            null, "'//'" ];
	public static readonly symbolicNames: (string | null)[] = [ null, "Rect", 
                                                             "Circle", "Diamond", 
                                                             "Parallelogram", 
                                                             "Trapezoid", 
                                                             "Triangle", 
                                                             "TextType", 
                                                             "Line", "SimpleLine", 
                                                             "PolyLine", 
                                                             "CurveLine", 
                                                             "LArrow", "RArrow", 
                                                             "X", "Y", "W", 
                                                             "H", "Angle", 
                                                             "Color", "Text", 
                                                             "Alpha", "BorderWidth", 
                                                             "BorderColor", 
                                                             "BorderAlpha", 
                                                             "FontSize", 
                                                             "FontColor", 
                                                             "Comma", "Semicolon", 
                                                             "Quotation", 
                                                             "Slash", "TokenChar", 
                                                             "NL", "Space", 
                                                             "Char", "AnnotationQuotation", 
                                                             "AnnotationChar", 
                                                             "LineAnnotationNL", 
                                                             "LineAnnotationChar" ];
	public static readonly modeNames: string[] = [ "DEFAULT_MODE", "ANNOTATION_MODE", 
                                                "LINE_ANNOTATION_MODE", ];

	public static readonly ruleNames: string[] = [
		"Rect", "Circle", "Diamond", "Parallelogram", "Trapezoid", "Triangle", 
		"TextType", "Line", "SimpleLine", "PolyLine", "CurveLine", "LArrow", "RArrow", 
		"X", "Y", "W", "H", "Angle", "Color", "Text", "Alpha", "BorderWidth", 
		"BorderColor", "BorderAlpha", "FontSize", "FontColor", "Comma", "Semicolon", 
		"Quotation", "Slash", "TokenChar", "NL", "Space", "Char", "AnnotationQuotation", 
		"AnnotationChar", "LineAnnotationNL", "LineAnnotationChar",
	];


	constructor(input: CharStream) {
		super(input);
		this._interp = new LexerATNSimulator(this, RMGLLexer._ATN, RMGLLexer.DecisionsToDFA, new PredictionContextCache());
	}

	public get grammarFileName(): string { return "RMGLLexer.g4"; }

	public get literalNames(): (string | null)[] { return RMGLLexer.literalNames; }
	public get symbolicNames(): (string | null)[] { return RMGLLexer.symbolicNames; }
	public get ruleNames(): string[] { return RMGLLexer.ruleNames; }

	public get serializedATN(): number[] { return RMGLLexer._serializedATN; }

	public get channelNames(): string[] { return RMGLLexer.channelNames; }

	public get modeNames(): string[] { return RMGLLexer.modeNames; }

	public static readonly _serializedATN: number[] = [4,0,38,290,6,-1,6,-1,
	6,-1,2,0,7,0,2,1,7,1,2,2,7,2,2,3,7,3,2,4,7,4,2,5,7,5,2,6,7,6,2,7,7,7,2,
	8,7,8,2,9,7,9,2,10,7,10,2,11,7,11,2,12,7,12,2,13,7,13,2,14,7,14,2,15,7,
	15,2,16,7,16,2,17,7,17,2,18,7,18,2,19,7,19,2,20,7,20,2,21,7,21,2,22,7,22,
	2,23,7,23,2,24,7,24,2,25,7,25,2,26,7,26,2,27,7,27,2,28,7,28,2,29,7,29,2,
	30,7,30,2,31,7,31,2,32,7,32,2,33,7,33,2,34,7,34,2,35,7,35,2,36,7,36,2,37,
	7,37,1,0,1,0,1,0,1,0,1,0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,2,1,2,1,2,1,2,1,
	2,1,2,1,2,1,2,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,3,1,
	4,1,4,1,4,1,4,1,4,1,4,1,4,1,4,1,4,1,4,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,5,1,
	5,1,6,1,6,1,6,1,6,1,6,1,7,1,7,1,7,1,8,1,8,1,8,1,8,1,8,1,8,1,8,1,9,1,9,1,
	9,1,9,1,9,1,9,1,9,1,10,1,10,1,10,1,10,1,10,1,10,1,10,1,10,1,11,1,11,1,12,
	1,12,1,13,1,13,1,14,1,14,1,15,1,15,1,16,1,16,1,17,1,17,1,17,1,17,1,17,1,
	17,1,18,1,18,1,18,1,18,1,18,1,18,1,19,1,19,1,19,1,19,1,19,1,20,1,20,1,20,
	1,20,1,20,1,20,1,21,1,21,1,21,1,21,1,21,1,21,1,21,1,21,1,21,1,21,1,21,1,
	21,1,22,1,22,1,22,1,22,1,22,1,22,1,22,1,22,1,22,1,22,1,22,1,22,1,23,1,23,
	1,23,1,23,1,23,1,23,1,23,1,23,1,23,1,23,1,23,1,23,1,24,1,24,1,24,1,24,1,
	24,1,24,1,24,1,24,1,24,1,25,1,25,1,25,1,25,1,25,1,25,1,25,1,25,1,25,1,25,
	1,26,1,26,1,27,1,27,1,28,1,28,1,28,1,28,1,29,1,29,1,29,1,29,1,29,1,30,4,
	30,267,8,30,11,30,12,30,268,1,31,1,31,1,32,1,32,1,32,1,32,1,33,1,33,1,34,
	1,34,1,34,1,34,1,35,1,35,1,36,1,36,1,36,1,36,1,37,1,37,0,0,38,3,1,5,2,7,
	3,9,4,11,5,13,6,15,7,17,8,19,9,21,10,23,11,25,12,27,13,29,14,31,15,33,16,
	35,17,37,18,39,19,41,20,43,21,45,22,47,23,49,24,51,25,53,26,55,27,57,28,
	59,29,61,30,63,31,65,32,67,33,69,34,71,35,73,36,75,37,77,38,3,0,1,2,3,6,
	0,45,46,48,57,65,90,95,95,97,122,19968,40869,2,0,10,10,13,13,2,0,9,9,32,
	32,288,0,3,1,0,0,0,0,5,1,0,0,0,0,7,1,0,0,0,0,9,1,0,0,0,0,11,1,0,0,0,0,13,
	1,0,0,0,0,15,1,0,0,0,0,17,1,0,0,0,0,19,1,0,0,0,0,21,1,0,0,0,0,23,1,0,0,
	0,0,25,1,0,0,0,0,27,1,0,0,0,0,29,1,0,0,0,0,31,1,0,0,0,0,33,1,0,0,0,0,35,
	1,0,0,0,0,37,1,0,0,0,0,39,1,0,0,0,0,41,1,0,0,0,0,43,1,0,0,0,0,45,1,0,0,
	0,0,47,1,0,0,0,0,49,1,0,0,0,0,51,1,0,0,0,0,53,1,0,0,0,0,55,1,0,0,0,0,57,
	1,0,0,0,0,59,1,0,0,0,0,61,1,0,0,0,0,63,1,0,0,0,0,65,1,0,0,0,0,67,1,0,0,
	0,0,69,1,0,0,0,1,71,1,0,0,0,1,73,1,0,0,0,2,75,1,0,0,0,2,77,1,0,0,0,3,79,
	1,0,0,0,5,84,1,0,0,0,7,91,1,0,0,0,9,99,1,0,0,0,11,113,1,0,0,0,13,123,1,
	0,0,0,15,132,1,0,0,0,17,137,1,0,0,0,19,140,1,0,0,0,21,147,1,0,0,0,23,154,
	1,0,0,0,25,162,1,0,0,0,27,164,1,0,0,0,29,166,1,0,0,0,31,168,1,0,0,0,33,
	170,1,0,0,0,35,172,1,0,0,0,37,174,1,0,0,0,39,180,1,0,0,0,41,186,1,0,0,0,
	43,191,1,0,0,0,45,197,1,0,0,0,47,209,1,0,0,0,49,221,1,0,0,0,51,233,1,0,
	0,0,53,242,1,0,0,0,55,252,1,0,0,0,57,254,1,0,0,0,59,256,1,0,0,0,61,260,
	1,0,0,0,63,266,1,0,0,0,65,270,1,0,0,0,67,272,1,0,0,0,69,276,1,0,0,0,71,
	278,1,0,0,0,73,282,1,0,0,0,75,284,1,0,0,0,77,288,1,0,0,0,79,80,5,82,0,0,
	80,81,5,101,0,0,81,82,5,99,0,0,82,83,5,116,0,0,83,4,1,0,0,0,84,85,5,67,
	0,0,85,86,5,105,0,0,86,87,5,114,0,0,87,88,5,99,0,0,88,89,5,108,0,0,89,90,
	5,101,0,0,90,6,1,0,0,0,91,92,5,68,0,0,92,93,5,105,0,0,93,94,5,97,0,0,94,
	95,5,109,0,0,95,96,5,111,0,0,96,97,5,110,0,0,97,98,5,100,0,0,98,8,1,0,0,
	0,99,100,5,80,0,0,100,101,5,97,0,0,101,102,5,114,0,0,102,103,5,97,0,0,103,
	104,5,108,0,0,104,105,5,108,0,0,105,106,5,101,0,0,106,107,5,108,0,0,107,
	108,5,111,0,0,108,109,5,103,0,0,109,110,5,114,0,0,110,111,5,97,0,0,111,
	112,5,109,0,0,112,10,1,0,0,0,113,114,5,84,0,0,114,115,5,114,0,0,115,116,
	5,97,0,0,116,117,5,112,0,0,117,118,5,101,0,0,118,119,5,122,0,0,119,120,
	5,111,0,0,120,121,5,105,0,0,121,122,5,100,0,0,122,12,1,0,0,0,123,124,5,
	84,0,0,124,125,5,114,0,0,125,126,5,105,0,0,126,127,5,97,0,0,127,128,5,110,
	0,0,128,129,5,103,0,0,129,130,5,108,0,0,130,131,5,101,0,0,131,14,1,0,0,
	0,132,133,5,84,0,0,133,134,5,101,0,0,134,135,5,120,0,0,135,136,5,116,0,
	0,136,16,1,0,0,0,137,138,5,45,0,0,138,139,5,45,0,0,139,18,1,0,0,0,140,141,
	5,45,0,0,141,142,5,108,0,0,142,143,5,105,0,0,143,144,5,110,0,0,144,145,
	5,101,0,0,145,146,5,45,0,0,146,20,1,0,0,0,147,148,5,45,0,0,148,149,5,112,
	0,0,149,150,5,111,0,0,150,151,5,108,0,0,151,152,5,121,0,0,152,153,5,45,
	0,0,153,22,1,0,0,0,154,155,5,45,0,0,155,156,5,99,0,0,156,157,5,117,0,0,
	157,158,5,114,0,0,158,159,5,118,0,0,159,160,5,101,0,0,160,161,5,45,0,0,
	161,24,1,0,0,0,162,163,5,60,0,0,163,26,1,0,0,0,164,165,5,62,0,0,165,28,
	1,0,0,0,166,167,5,120,0,0,167,30,1,0,0,0,168,169,5,121,0,0,169,32,1,0,0,
	0,170,171,5,119,0,0,171,34,1,0,0,0,172,173,5,104,0,0,173,36,1,0,0,0,174,
	175,5,97,0,0,175,176,5,110,0,0,176,177,5,103,0,0,177,178,5,108,0,0,178,
	179,5,101,0,0,179,38,1,0,0,0,180,181,5,99,0,0,181,182,5,111,0,0,182,183,
	5,108,0,0,183,184,5,111,0,0,184,185,5,114,0,0,185,40,1,0,0,0,186,187,5,
	116,0,0,187,188,5,101,0,0,188,189,5,120,0,0,189,190,5,116,0,0,190,42,1,
	0,0,0,191,192,5,97,0,0,192,193,5,108,0,0,193,194,5,112,0,0,194,195,5,104,
	0,0,195,196,5,97,0,0,196,44,1,0,0,0,197,198,5,98,0,0,198,199,5,111,0,0,
	199,200,5,114,0,0,200,201,5,100,0,0,201,202,5,101,0,0,202,203,5,114,0,0,
	203,204,5,87,0,0,204,205,5,105,0,0,205,206,5,100,0,0,206,207,5,116,0,0,
	207,208,5,104,0,0,208,46,1,0,0,0,209,210,5,98,0,0,210,211,5,111,0,0,211,
	212,5,114,0,0,212,213,5,100,0,0,213,214,5,101,0,0,214,215,5,114,0,0,215,
	216,5,67,0,0,216,217,5,111,0,0,217,218,5,108,0,0,218,219,5,111,0,0,219,
	220,5,114,0,0,220,48,1,0,0,0,221,222,5,98,0,0,222,223,5,111,0,0,223,224,
	5,114,0,0,224,225,5,100,0,0,225,226,5,101,0,0,226,227,5,114,0,0,227,228,
	5,65,0,0,228,229,5,108,0,0,229,230,5,112,0,0,230,231,5,104,0,0,231,232,
	5,97,0,0,232,50,1,0,0,0,233,234,5,102,0,0,234,235,5,111,0,0,235,236,5,110,
	0,0,236,237,5,116,0,0,237,238,5,83,0,0,238,239,5,105,0,0,239,240,5,122,
	0,0,240,241,5,101,0,0,241,52,1,0,0,0,242,243,5,102,0,0,243,244,5,111,0,
	0,244,245,5,110,0,0,245,246,5,116,0,0,246,247,5,67,0,0,247,248,5,111,0,
	0,248,249,5,108,0,0,249,250,5,111,0,0,250,251,5,114,0,0,251,54,1,0,0,0,
	252,253,5,44,0,0,253,56,1,0,0,0,254,255,5,59,0,0,255,58,1,0,0,0,256,257,
	5,34,0,0,257,258,1,0,0,0,258,259,6,28,0,0,259,60,1,0,0,0,260,261,5,47,0,
	0,261,262,5,47,0,0,262,263,1,0,0,0,263,264,6,29,1,0,264,62,1,0,0,0,265,
	267,7,0,0,0,266,265,1,0,0,0,267,268,1,0,0,0,268,266,1,0,0,0,268,269,1,0,
	0,0,269,64,1,0,0,0,270,271,7,1,0,0,271,66,1,0,0,0,272,273,7,2,0,0,273,274,
	1,0,0,0,274,275,6,32,2,0,275,68,1,0,0,0,276,277,9,0,0,0,277,70,1,0,0,0,
	278,279,5,34,0,0,279,280,1,0,0,0,280,281,6,34,3,0,281,72,1,0,0,0,282,283,
	9,0,0,0,283,74,1,0,0,0,284,285,7,1,0,0,285,286,1,0,0,0,286,287,6,36,3,0,
	287,76,1,0,0,0,288,289,9,0,0,0,289,78,1,0,0,0,5,0,1,2,266,268,4,5,1,0,5,
	2,0,6,0,0,4,0,0];

	private static __ATN: ATN;
	public static get _ATN(): ATN {
		if (!RMGLLexer.__ATN) {
			RMGLLexer.__ATN = new ATNDeserializer().deserialize(RMGLLexer._serializedATN);
		}

		return RMGLLexer.__ATN;
	}


	static DecisionsToDFA = RMGLLexer._ATN.decisionToState.map( (ds: DecisionState, index: number) => new DFA(ds, index) );
}
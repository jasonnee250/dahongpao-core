# shellcheck disable=SC2164
cd src/parser/grammar
antlr4 *.g4 -Dlanguage=TypeScript -o ./basic
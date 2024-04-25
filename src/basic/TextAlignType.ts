/**
 * 文字对齐方式
 */
export enum TextAlignType {
    /**
     * top或left对齐
     */
    TOP_OR_LEFT,
    /**
     * 居中对齐
     */
    CENTER,
    /**
     * bottom或right对齐
     */
    BOTTOM_OR_RIGHT,
}

export function convert2TextAlignType(type: number):TextAlignType {
    if (type === 0) {
        return TextAlignType.TOP_OR_LEFT;
    } else if (type === 1) {
        return TextAlignType.CENTER;
    } else if (type === 2){
        return TextAlignType.BOTTOM_OR_RIGHT;
    } else {
        return TextAlignType.CENTER;
    }
}
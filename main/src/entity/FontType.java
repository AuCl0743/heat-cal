package entity;

import java.awt.*;

public enum FontType {

    // 预设字体类型
    H1("宋体", Font.PLAIN, 16);

    // 声明成员变量
    private final String fontName;
    private final int fontStyle;
    private final int fontSize;

    // 构造函数
    FontType(String fontName, int fontStyle, int fontSize) {
        this.fontName = fontName;
        this.fontStyle = fontStyle;
        this.fontSize = fontSize;
    }

    // 提供返回Font类的方法
    public Font toFont() {
        return new Font(fontName, fontStyle, fontSize);
    }
}

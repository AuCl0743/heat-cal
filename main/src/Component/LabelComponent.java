package Component;

import entity.FontType;

import javax.swing.*;

public class LabelComponent extends JLabel {
    public LabelComponent(String name, FontType fontType) {

        // 设置标签文本，字体，对齐方式
        setText(name);
        setFont(fontType.toFont());
        setHorizontalAlignment(JLabel.CENTER);
        setVerticalAlignment(JLabel.CENTER);

    }
}

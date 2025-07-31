package Component;

import entity.ComponentSize;

import javax.swing.*;

public class ButtonComponent extends JButton {
    public ButtonComponent(String name, ComponentSize componentSize) {

        // 设置按钮文本
        this.setText(name);

        // 设置按钮大小
        this.setPreferredSize(componentSize.toDimension());

        // 设置按钮中文本的对齐位置
        setHorizontalAlignment(SwingConstants.CENTER);
        setVerticalAlignment(SwingConstants.CENTER);

    }
}

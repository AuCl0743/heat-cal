package Component;

import entity.ComponentSize;

import javax.swing.*;
import java.awt.*;

public class PanelComponent extends JPanel {

    public PanelComponent(ComponentSize componentSize) {

        // 设置面板尺寸，调用entity中预设尺寸
        this.setPreferredSize(componentSize.toDimension());

    }

    public PanelComponent() {

        //
        this.setPreferredSize(ComponentSize.SIZE_1080_60.toDimension());

    }
}

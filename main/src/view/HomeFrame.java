package view;

import javax.swing.*;
import Component.ButtonComponent;
import Component.LabelComponent;
import Component.PanelComponent;
import entity.ComponentSize;
import entity.FontType;

import java.awt.*;

/**
 * 创建Home窗口
 */
public class HomeFrame extends JFrame {
    public HomeFrame() {
        initLayout();
    };

    public void initLayout() {

        // 基础窗口信息
        setTitle("缺氧中的热量模拟");
        setSize(800, 600);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // 主面板，设置布局
        PanelComponent startPanel = new PanelComponent(ComponentSize.SIZE_640_360);
        startPanel.setLayout(new BorderLayout());

        // 标签组件 标题
        PanelComponent titlePanel = new PanelComponent(ComponentSize.SIZE_280_140);
        titlePanel.setLayout(new FlowLayout());
        LabelComponent titleLabel = new LabelComponent("创建初始化网格", FontType.H1);
        titlePanel.add(titleLabel);

        // 按钮组件 “创建空间”
        PanelComponent buttonPanel = new PanelComponent(ComponentSize.SIZE_280_140);
        buttonPanel.setLayout(new FlowLayout());
        ButtonComponent createDimension = new ButtonComponent("创建空间", ComponentSize.SIZE_140_70);
        buttonPanel.add(createDimension);

        // 添加面板
        startPanel.add(titlePanel, BorderLayout.NORTH);
        startPanel.add(buttonPanel, BorderLayout.CENTER);
        add(startPanel, BorderLayout.CENTER);

        // 窗口设置
        pack();
        setLocationRelativeTo(null);
        setVisible(true);

    }
}

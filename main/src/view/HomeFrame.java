package view;

import javax.swing.*;
import component.ButtonComponent;
import component.LabelComponent;
import component.PanelComponent;
import component.TextFieldComponent;
import entity.AssetType;
import entity.ComponentSize;
import entity.FontType;
import util.AssetsLoader;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * 创建Home窗口
 */
public class HomeFrame extends JFrame {
    public HomeFrame() {
        initLayout();
        //setIconImage(new ImageIcon("/icon.png")).getImage());
    };

    public void initLayout() {

        // 基础窗口信息
        setTitle("缺氧中的热量模拟");
        setSize(640, 360);
        setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        // 设置icon
        ImageIcon icon = new ImageIcon(AssetsLoader.getFullUrl("icon-frame-squirrel.png", AssetType.ICON));
        setIconImage(icon.getImage());
        // 检测是否为mac，是则设置duck栏icon
        if (System.getProperty("os.name").toLowerCase().contains("mac")) {

            Taskbar taskbar = Taskbar.getTaskbar();
            taskbar.setIconImage(icon.getImage());
        }

        // 主面板，设置布局 Border
        PanelComponent homePanel = new PanelComponent(ComponentSize.SIZE_640_360);
        homePanel.setLayout(new BorderLayout());

        // 设置失焦的glassPane
//        JPanel glassPane = new JPanel();
//        glassPane.setOpaque(false);
//        glassPane.addMouseListener(new MouseAdapter() {
//            @Override
//            public void mouseClicked(MouseEvent e) {
//                getContentPane().requestFocusInWindow();
//            }
//        });
//        setGlassPane(glassPane);
//        glassPane.setVisible(true);


        // 标题 次面板｜标签 flow
        PanelComponent titlePanel = new PanelComponent(ComponentSize.SIZE_280_140);
        titlePanel.setLayout(new FlowLayout());
        homePanel.add(titlePanel, BorderLayout.NORTH);

        LabelComponent titleLabel = new LabelComponent("创建初始化网格", FontType.H1);
        titlePanel.add(titleLabel);

        // 输入 次面板｜文本框-文本框 flow
        PanelComponent textInPanel = new PanelComponent(ComponentSize.SIZE_280_140);
        textInPanel.setLayout(new FlowLayout());
        homePanel.add(textInPanel, BorderLayout.WEST);

        TextFieldComponent row = new TextFieldComponent("1", 5);
        TextFieldComponent column = new TextFieldComponent("1", 5);
        textInPanel.add(row);
        textInPanel.add(column);

        // 按钮组件 “创建空间”
        PanelComponent buttonPanel = new PanelComponent(ComponentSize.SIZE_280_140);
        buttonPanel.setLayout(new FlowLayout());
        homePanel.add(buttonPanel, BorderLayout.CENTER);

        ButtonComponent createDimension = new ButtonComponent("创建空间", ComponentSize.SIZE_140_70);
        buttonPanel.add(createDimension);

        // 添加面板
        add(homePanel, BorderLayout.CENTER);

        // 窗口设置
        pack();
        setLocationRelativeTo(null);
        setVisible(true);

        System.out.println(AssetsLoader.getFullUrl("icon-frame-squirrel.png", AssetType.ICON));
        System.out.println(1);
    }
}

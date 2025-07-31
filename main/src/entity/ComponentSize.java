package entity;

import java.awt.*;

public enum ComponentSize {

    // 预设组件尺寸
    SIZE_1080_60(720, 480),
    SIZE_720_35(720, 35),
    SIZE_640_360(640, 360),
    SIZE_280_140(280, 140),
    SIZE_140_70(140, 70),;

    // 声明成员变量
    private final int width;
    private final int height;

    // 枚举量构造函数
    ComponentSize(int  width, int height) {
        this.width = width;
        this.height = height;
    }

    // 提供返回Dimension类的方法
    public Dimension toDimension() {
        return new Dimension(width, height);
    }
}

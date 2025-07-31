package entity;

import java.awt.*;

public enum LayoutType {

    DEFAULT(50, 50);

    private int hgap;
    private int vgap;

    LayoutType(int hgap, int vgap) {
        this.hgap = hgap;
        this.vgap = vgap;
    }

    public BorderLayout toBorderLayout() {
        return new BorderLayout(hgap, vgap);
    }

    public FlowLayout toFlowLayout() {
        return new FlowLayout();
    }
}

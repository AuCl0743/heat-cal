package entity;

public enum AssetType {
    ICON("images/icons");

    private final String path;

    AssetType(String path) {
        this.path = path;
    }

    public String getPath() {
        return path;
    }
}

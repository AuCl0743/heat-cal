package util;

import entity.AssetType;

import java.net.URL;

public class AssetsLoader {

    // 防止实例化
    private AssetsLoader(){}


    public static URL getFullUrl(String fileName, AssetType type) {

        String path = String.format("assets/%s/%s", type.getPath(), fileName);
        //return path;
        return AssetsLoader.class.getClassLoader().getResource(path);
    }
}

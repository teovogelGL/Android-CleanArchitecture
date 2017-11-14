package com.globant.equattrocchio.domain;

public class ImageMapper {

    public static Image map (int id, String url) {
        Image image = new Image();
        image.setId(id);
        image.setUrl(url);
        return image;
    }

}

package com.globant.equattrocchio.domain;

public class Image {

    private int id;
    private String url;

    public void setId (int id) {
        this.id = id;
    }

    public void setUrl (String url) {
        this.url = url;
    }

    public int getId () {
        return id;
    }

    public String getUrl () {
        return url;
    }

}

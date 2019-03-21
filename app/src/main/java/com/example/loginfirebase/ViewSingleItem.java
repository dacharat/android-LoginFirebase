package com.example.loginfirebase;

public class ViewSingleItem {

    private String Image_url, Image_title;

    public ViewSingleItem(String image_url, String image_title) {
        Image_url = image_url;
        Image_title = image_title;
    }

    public ViewSingleItem() {

    }

    public String getImage_url() {
        return Image_url;
    }

    public void setImage_url(String image_url) {
        Image_url = image_url;
    }

    public String getImage_title() {
        return Image_title;
    }

    public void setImage_title(String image_title) {
        Image_title = image_title;
    }
}

package com.mainacad.model;

public class Item {

    private String itemId;
    private String name;
    private String url;
    private String imageUrl;
    private Integer initialPrice;
    private Integer price;

    public String getItemId() {
        return itemId;
    }

    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Integer getInitialPrice() {
        return initialPrice;
    }

    public void setInitialPrice(Integer initialPrice) {
        this.initialPrice = initialPrice;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Item(String itemId, String name, String url, String imageUrl, Integer initialPrice, Integer price) {
        this.itemId = itemId;
        this.name = name;
        this.url = url;
        this.imageUrl = imageUrl;
        this.initialPrice = initialPrice;
        this.price = price;
    }

    public Item() {
    }
}





package com.jad.product;

public interface IProduct{
    String getName();

    int getHeight();

    void setHeight(int height);

    int getWidth();

    void setWidth(int width);

    char getPixel(int row, int column);

    void setPixel(int row, int column, char pixel);

    String getDescription();

    void setDescription(String description);

    String getImage();

    void draw();
}

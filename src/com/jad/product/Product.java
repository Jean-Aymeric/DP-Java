package com.jad.product;

public abstract class Product implements IProduct {
    private final String name;
    private int height;
    private int width;
    private String description;
    private char[][] image;
    public static final char EmptyPixel = '-';

    protected Product(final String name, final int height, final int width, final String description) {
        this.name = name;
        this.height = height;
        this.width = width;
        this.description = description;
        this.resetImage();
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int getHeight() {
        return this.height;
    }

    @Override
    public void setHeight(final int height) {
        if ((height >= 0) && (height != this.height)) {
            this.height = height;
            this.resetImage();
        }
    }

    @Override
    public int getWidth() {
        return this.width;
    }

    @Override
    public void setWidth(final int width) {
        if ((width >= 0) && (width != this.width)) {
            this.width = width;
            this.resetImage();
        }
    }

    private void resetImage() {
        this.image = new char[height][width];
    }

    @Override
    public char getPixel(int row, int column) {
        if ((row >= 0) && (row < this.height) && (column >= 0) && (column < this.width)) {
            return this.image[row][column];
        }
        return Product.EmptyPixel;
    }

    @Override
    public void setPixel(int row, int column, char pixel) {
        if ((row >= 0) && (row < this.height) && (column >= 0) && (column < this.width)) {
            this.image[row][column] = pixel;
        }
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public void setDescription(final String description) {
        this.description = description;
    }

    @Override
    public String getImage() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < this.height; i++) {
            for (int j = 0; j < this.width; j++) {
                result.append(this.image[i][j]);
            }
            result.append("\n");
        }
        return result.toString();
    }

    @Override
    public void draw() {
        System.out.println(this.getImage());
    }

}

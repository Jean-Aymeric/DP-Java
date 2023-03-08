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
        this.image = new char[height][width];
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getHeight() {
        return height;
    }

    @Override
    public void setHeight(final int height) {
        this.height = height;
    }

    @Override
    public int getWidth() {
        return width;
    }

    @Override
    public void setWidth(final int width) {
        this.width = width;
    }

    @Override
    public char getPixel(int row, int column) {
        return image[row][column];
    }

    @Override
    public void setPixel(int row, int column, char pixel) {
        image[row][column] = pixel;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(final String description) {
        this.description = description;
    }

    @Override
    public String getImage() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < height; i++) {
            for (int j = 0; j < width; j++) {
                sb.append(image[i][j]);
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    @Override
    public void draw() {
        System.out.println(getImage());
    }
}

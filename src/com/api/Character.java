package com.api;

public class Character implements Glyph {

    private char c;

    @Override
    public void draw(Window window, Context context) {

    }

    @Override
    public boolean intersects(Point point, Context context) {
        return true;
    }
}

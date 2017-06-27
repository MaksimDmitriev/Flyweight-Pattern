package com.api;

public interface Glyph {

    void draw(Window window, Context context);

    boolean intersects(Point point, Context context);
}

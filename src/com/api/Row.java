package com.api;

import java.util.List;

public class Row implements Glyph {

    private List<Glyph> children;

    @Override
    public void draw(Window window, Context context) {
        for (Glyph child : children) {
            child.draw(window, context);
        }
    }

    @Override
    public boolean intersects(Point point, Context context) {
        return false;
    }
}

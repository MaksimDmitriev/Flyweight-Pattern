package com.api;

import java.util.ArrayList;
import java.util.List;

public class Column implements Glyph {

    private final List<Glyph> children = new ArrayList<>();

    @Override
    public void draw(Window window, Context context) {
        for (Glyph child : children) {
            child.draw(window, context);
        }
    }

    @Override
    public boolean intersects(Point point, Context context) {
        return true;
    }
}

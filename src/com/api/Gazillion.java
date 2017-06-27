package com.api;

public class Gazillion {

    private int row;

    public Gazillion(int row) {
        this.row = row;
        System.out.println("ctor: " + this.row);
    }

    public void report(int col) {
        System.out.print(" " + row + col);
    }
}

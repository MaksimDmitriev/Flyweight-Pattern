package com.client;

import com.api.Factory;

class Main {

    public static final int ROWS = 6, COLS = 10;

//    In this refactoring, the "row" state is considered shareable (within each row anyways),
// and the "col" state has been externalized (it is supplied by the client when report() is called).


    public static void main(String[] args) {
        Factory theFactory = new Factory(ROWS);
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++)
                theFactory.getFlyweight(i).report(j);
            System.out.println();
        }

    }
}

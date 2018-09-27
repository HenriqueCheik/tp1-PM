package com.henriquecheik.model;

public class Pos2D {
    private int x;
    private int y;

    public Pos2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public void incrementPosition(int x, int y){
        this.x += x;
        this.y += y;
    }
}
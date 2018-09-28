package com.henriquecheik.model;

public class Pos2D {
    private int x;
    private int y;

    public Pos2D(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Pos2D(Pos2D position){
        this.x = position.getX();
        this.y = position.getY();
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

    @Override
    public String toString() {
        return "x= " + this.x + " y= " + this.y;
    }
}

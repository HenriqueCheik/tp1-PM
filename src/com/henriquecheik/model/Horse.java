package com.henriquecheik.model;

public class Horse{

    private Pos2D position;


    public Horse(int x, int y){
        this.position = new Pos2D(x, y);
    }

    public Horse(Pos2D position) {
        this.position = position;
    }


    public Pos2D getPosition() {
        return position;
    }

    public void setPosition(Pos2D position) {
        this.position = position;
    }

    public void move(HorseMovement movement) {
        switch (movement) {
            case UP_RIGHT:
                position.incrementPosition(-2,1);
                break;
            case UP_LEFT:
                position.incrementPosition(-2, -1);
                break;
            case LEFT_UP:
                position.incrementPosition(-1, -2);
                break;
            case LEFT_DOWN:
                position.incrementPosition(-1, 2);
                break;
            case DOWN_LEFT:
                position.incrementPosition(-2, 1);
                break;
            case DOWN_RIGHT:
                position.incrementPosition(2, 1);
                break;
            case RIGHT_DOWN:
                position.incrementPosition(1, 2);
                break;
            case RIGHT_UP:
                position.incrementPosition(1, -2);
                break;
        }
    }


}

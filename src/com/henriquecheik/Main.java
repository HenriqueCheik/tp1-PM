package com.henriquecheik;

import com.henriquecheik.model.ChessBoard;
import com.henriquecheik.model.Horse;
import com.henriquecheik.model.HorseMovement;

public class Main {

    public static void main(String[] args) {
        int rows = 8;
        int columns = 8;

        ChessBoard board = new ChessBoard(8,8);
        Horse knight = new Horse(8,8);
        knight.move(HorseMovement.UP_LEFT);
        System.out.println("Knight at position: " + knight.getPosition());
        System.out.println(board.checkPosition(knight.getPosition()));
        board.occupyPosition(knight.getPosition());
        board.printBoard();
    }
}

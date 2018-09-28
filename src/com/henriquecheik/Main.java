package com.henriquecheik;

import com.henriquecheik.model.ChessBoard;
import com.henriquecheik.model.Horse;
import com.henriquecheik.model.Pos2D;
import com.henriquecheik.solver.Solver;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        int rows = 8;
        int columns = 8;

        ChessBoard board = new ChessBoard(rows, columns);
        Horse knight = new Horse(0,0);


//        knight.move(HorseMovement.UP_RIGHT);
//        System.out.println("Knight at position: " + knight.getPosition());
//        System.out.println(board.checkPosition(knight.getPosition()));
//        board.occupyPosition(knight.getPosition());
//        board.printBoard();
//        knight.undoMove(HorseMovement.UP_RIGHT);
//        System.out.println("Knight at position: " + knight.getPosition());
//        System.out.println(board.checkPosition(knight.getPosition()));
//        board.occupyPosition(knight.getPosition());
//        board.printBoard();

        Solver solver = new Solver(board, knight);
        solver.knightTour();
        List<Pos2D> solution = solver.getHighestSolution();
        System.out.println("Number of positions visited: " + solution.size());
        ChessBoard tempBoard = new ChessBoard(rows, columns);
        int i = 1;
        for(Pos2D position : solution) {
            tempBoard.occupyPosition(position, i++);
            System.out.println(position);
        }
        tempBoard.printBoard();
    }
}

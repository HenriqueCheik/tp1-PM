package com.henriquecheik.solver;

import com.henriquecheik.model.ChessBoard;
import com.henriquecheik.model.Horse;
import com.henriquecheik.model.HorseMovement;
import com.henriquecheik.model.Pos2D;

import java.util.ArrayList;
import java.util.List;

public class Solver {

    private List<Pos2D> solution;
    private List<Pos2D> highestSolution;
    private ChessBoard board;
    private Horse knight;
    private Boolean solutionFound;

    public Solver(ChessBoard board, Horse knight) {
        this.board = board;
        this.knight = knight;
        solutionFound = false;
        solution = new ArrayList<>();
        board.occupyPosition(knight.getPosition());
        solution.add(new Pos2D(knight.getPosition()));
        highestSolution = new ArrayList<>(solution);
    }

    public void knightTour(){
//        if(solution.size() == board.getRows()*board.getColumns()){
//            return;
//        }
        for(HorseMovement movement : HorseMovement.values()){
            if(solutionFound){
                return;
            }
//            Pos2D lastPosition = new Pos2D(knight.getPosition());
            knight.move(movement);
            if(board.checkPosition(knight.getPosition())){
                board.occupyPosition(knight.getPosition());

                solution.add(new Pos2D(knight.getPosition()));
                if(solution.size() == board.getRows()*board.getColumns()){
                    highestSolution = new ArrayList<>(solution);
                    solutionFound = true;
                    return;
                }
                knightTour();
                if(solutionFound){
                    return;
                }
                if(solution.size() > highestSolution.size()){
                    highestSolution = new ArrayList<>(solution);
                    System.out.println("Nova solução! Numero de posições visitadas: " + highestSolution.size());
//                    if(highestSolution.size() == board.getRows()*board.getColumns()){
//
//                        return;
//                    }
                }

//                board.freePosition(knight.getPosition());

                board.freePosition(solution.remove(solution.size()-1));

//                solution.remove(solution.size()-1);

            }
            knight.undoMove(movement);
        }
    }

    public List<Pos2D> getHighestSolution(){
        return highestSolution;
    }


}

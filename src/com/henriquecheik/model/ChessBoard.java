package com.henriquecheik.model;

public class ChessBoard {
    private int[][] board;
    private int rows;
    private int columns;

    public ChessBoard(int rows, int columns){
        this.rows = rows;
        this.columns = columns;
        this.board = new int[rows][columns];
    }

    public void occupyPosition(int x, int y){
        board[x][y] = 1;
    }

    public void occupyPosition(Pos2D position){
        occupyPosition(position.getX(), position.getY());
    }

    public void occupyPosition(Pos2D position, int index){
        board[position.getX()][position.getY()] = index;
    }

    public void freePosition(int x, int y){
        board[x][y] = 0;
    }

    public void freePosition(Pos2D position) {
        freePosition(position.getX(), position.getY());
    }

    public boolean checkPosition(int x, int y) {
        return !(x<0 || x>= rows || y<0 || y>=columns || board[x][y] == 1);
    }

    public boolean checkPosition(Pos2D position) {
        return checkPosition(position.getX(), position.getY());
    }

    public void printBoard(){
        for(int i = 0; i<rows; i++) {
            for(int j = 0; j<columns; j++) {
                System.out.printf("| %3d | ", board[i][j]);
            }
            System.out.println();
        }
        System.out.println("**********************************************");
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }
}

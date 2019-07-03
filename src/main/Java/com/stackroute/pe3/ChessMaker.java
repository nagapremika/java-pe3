package com.stackroute.pe3;

public class ChessMaker {       //Prints chess board
    public String chessBoard(int row,int column)
    {
        String chess="";
        if(row!=column) {
            chess = "rows not equal to columns";
        }
      else   if(row<1||column<1) {
            chess = "Invalid";
        }else {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < column; j++) {
                    if (j % 2 == 0 && i % 2 == 0) {
                        chess = chess + "WW|";
                    }else {
                        chess = chess + "BB|";
                    }
                }
                chess = chess + "\n";
            }
        }
        return chess;
    }
}

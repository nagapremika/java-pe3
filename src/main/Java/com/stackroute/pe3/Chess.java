package com.stackroute.pe3;

public class Chess {
    public String chessBoard(int row,int col)
    {
        String chess="";
        if(row!=col)
            chess= "Error";
         if(row<1||col<1)
            chess="Error";
       else {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    if (j % 2 == 0 && i % 2 == 0)
                        chess = chess + "WW|";
                    else
                        chess = chess + "BB|";

                }
                chess = chess + "\n";
            }
        }
        return chess;
    }
}

package com.stackroute.pe3;

public class MatrixAdder {    //MatrixSum class adds two matrices
    String sum="";
    public String addition(int row,int col,int[][] matrix1,int[][] matrix2)
    {
        if(row<0||col<0)
            sum="Sum not allowed";

        else {
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    sum = sum + ((matrix1[i][j] + matrix2[i][j])) + " ";
                }
            }
        }
        return sum;
    }
}

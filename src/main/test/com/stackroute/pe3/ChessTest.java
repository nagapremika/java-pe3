package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessTest {
    ChessMaker chess;
    @Before
    public void setUp()
    {

        chess=new ChessMaker();
    }
    @After
    public void tearDown()
    {

        chess=null;
    }
    @Test
    public void givenRowColShouldReturnChess()
    {
//        act
        String result=chess.chessBoard(8,8);
//        assert
        assertEquals("WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                "BB|BB|BB|BB|BB|BB|BB|BB|\n" +
                "WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                "BB|BB|BB|BB|BB|BB|BB|BB|\n" +
                "WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                "BB|BB|BB|BB|BB|BB|BB|BB|\n" +
                "WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                "BB|BB|BB|BB|BB|BB|BB|BB|\n" ,result);
    }
    @Test
    public void givenRowNotEqualsToColShouldReturnError()
    {
//        act
        String result=chess.chessBoard(7,8);
//        assert
        assertEquals("rows not equal to columns" ,result);
    }
    @Test
    public void givenRowAndColZeroShouldReturnError()
    {
//        act
        String result=chess.chessBoard(0,0);
//        assert
        assertEquals("Invalid" ,result);
    }

}
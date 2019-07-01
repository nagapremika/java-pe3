package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessTest {
    Chess chess;
    @Before
    public void setUp()
    {
        System.out.println("Before");
        chess=new Chess();
    }
    @After
    public void tearDown()
    {
        System.out.println("After");
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
        assertEquals("Error" ,result);
    }
    @Test
    public void givenRowAndColZeroShouldReturnError()
    {
//        act
        String result=chess.chessBoard(0,0);
//        assert
        assertEquals("Error" ,result);
    }

}
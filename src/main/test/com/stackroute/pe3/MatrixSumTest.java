package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class MatrixSumTest {
    MatrixAdder matrix;
    @Before
    public void setUp()
    {

        matrix=new MatrixAdder();
    }
    @After
    public void tearDown()
    {

        matrix=null;
    }
    @Test
    public void givenTwoMatricesShouldReturnMatrixSum()
    {
//        act
        String result=matrix.addition(2,2, new int[][]{{1, 2},{ 3, 4}}, new int[][]{{2, 3},{ 4, 5}});
//        assert
        assertEquals("3 5 7 9 ",result);
    }


    @Test
    public void givenRowNegativeShouldReturnError()
    {
//        act
        String result=matrix.addition(-2,2, new int[][]{{1, 2},{ 3, 4}}, new int[][]{{2, 3},{ 4, 5}});
//        assert
        assertEquals("Sum not allowed",result);
    }
    @Test
    public void givenThreeByTwoMatrixShouldReturnMatrixSum()
    {
//        act
        String result=matrix.addition(3,2, new int[][]{{1, 2},{ 3,4},{1,6}}, new int[][]{{2, 3},{ 4,3},{2,4}});
//        assert
        assertEquals("3 5 7 7 3 10 ",result);
    }



}
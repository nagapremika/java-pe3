package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RemoveVowelsTest {
    VowelsRemover removevowels;
    @Before
    public void setUp()
    {
        System.out.println("Before");
        removevowels=new VowelsRemover();
    }
    @After
    public void tearDown()
    {
        System.out.println("After");
        removevowels=null;
    }
    @Test
    public void givenLocationsShouldReturnWithOutVowels()
    {
//        act
        String[] result=removevowels.vowels(new String[]{"America", "India"});
//        assert
        assertArrayEquals(new String[]{"Amrc", "Ind"},result);
    }
    @Test
    public void givenNullShouldReturnNull()
    {
//        act
        String[] result=removevowels.vowels(null);
//        assert
        assertArrayEquals(null,result);
    }
    @Test
    public void givenLocationsAndNumbersShouldReturnWithOutVowels()
    {
//        act
        String[] result=removevowels.vowels(new String[]{"America", "456"});
//        assert
        assertArrayEquals(new String[]{"Amrc", "456"},result);
    }
    @Test
    public void givenLocationWithShouldReturnWithOutVowels()
    {
//        act
        String[] result=removevowels.vowels(new String[]{null, "India"});
//        assert
        assertArrayEquals(new String[]{null, "Ind"},result);
    }



}
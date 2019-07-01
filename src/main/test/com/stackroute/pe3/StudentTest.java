package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.*;

public class StudentTest {
    Student student;
    @Before
    public void setUp()
    {
        System.out.println("Before");
        student=new Student();
    }
    @After
    public void tearDown()
    {
        System.out.println("After");
        student=null;
    }
    @Test
    public void givenGradesShouldReturnSuccess()
    {
//        act
        String result=student.grades(new int[]{67, 23, 87, 89},4);
//        assert
        assertEquals("success",result);
    }
    @Test
    public void givenGradesShouldReturnError()
    {
//        act
        String result=student.grades(new int[]{67, 23, 900, 89},4);
//        assert
        assertEquals("Error",result);
    }
    @Test
    public void givenGradesLessThanSizeShouldReturnError() throws ArrayIndexOutOfBoundsException
    {
//        act
        String result=student.grades(new int[]{67, 23, 90},4);
//        assert
        assertEquals("Error",result);
    }



}
package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static com.stackroute.pe3.UserDefinedException.main;
import static org.junit.Assert.*;

public class UserDefinedExceptionTest {
    public Exception exc;
    @Before
    public void setUp()
    {
        System.out.println("Before");
        exc=new Exception("Premika");

    }
    @After
    public void tearDown()
    {
        System.out.println("After");
        exc=null;
    }
    @Test
    public void givenclassShouldThrowException(){
        String result=main("string");
        assertEquals("string This is finally clause.",result);
    }
    @Test
    public void givenClassShouldNotReachToFinallyStatement(){
        String result=main(null);
        assertEquals("Error",result);
    }
}


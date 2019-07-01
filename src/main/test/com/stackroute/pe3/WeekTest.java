package com.stackroute.pe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import static org.junit.Assert.*;

public class WeekTest {
   Week week;

    @Before
    public void setUp()
    {
        System.out.println("Before");
        week=new Week();
    }
    @After
    public void tearDown()
    {
        System.out.println("After");
        week=null;
    }
    @Test
    public void givenShouldReturnFirstAndLastDateOfWeek() {
//        act
        Week.Result result =week.date();
//        assert
        assertEquals("Mon 01/07/2019",result.firstday);
        assertEquals("Sun 07/07/2019",result.lastday);
    }

}
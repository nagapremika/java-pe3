package com.stackroute.pe3;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class WeekTester {   //Gives first and last day of week
 public class Result{
     String firstday,lastday;

 }
 public Result date()
 {
     Calendar c=Calendar.getInstance();
     Result result=new Result();
     c.set(Calendar.DAY_OF_WEEK,Calendar.MONDAY);
     DateFormat df=new SimpleDateFormat("EEE dd/MM/yyyy");
     result.firstday=df.format(c.getTime());
     c.add(Calendar.DATE,6);
     result.lastday=df.format(c.getTime());

     return result;
 }
    }




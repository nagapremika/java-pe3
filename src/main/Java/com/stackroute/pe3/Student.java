package com.stackroute.pe3;

    public class Student {      //Student class reads student grades and returns success if  grades are between 0 and 100 else Error
    String result;
    public String grades(int[] stugrades,int numofstudents)

    {
        if(stugrades.length!=numofstudents)
            result="Invalid size";
        else {
            for (int i = 0; i < numofstudents; i++) {
                if (stugrades[i] >= 0 && stugrades[i] <= 100) {
                    result = "success";
                } else {
                    result = "Invalid grades";
                    break;
                }
            }
        }
        return result;
    }
}

package com.stackroute.pe3;


    public class UserDefinedException  {  //Raises userdefined exception
        public UserDefinedException(String str) {
        }
        public static String main(int number) {
            String display;
            try{
               display="Exception is raised when number is less than 0";
                if(number<0){
                    throw new Exception(display);
                }
            }
            catch (Exception e)
            {
                display="catch block";
            }
        finally {
                display="Finally block";
            }
            return display;
        }
    }


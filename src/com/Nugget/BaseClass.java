package com.Nugget;

import java.util.Random;

public class BaseClass {

    public static int rand50(){
        Random rand = new Random();
        int n = rand.nextInt(50) + 1;
       return n;
    }


}

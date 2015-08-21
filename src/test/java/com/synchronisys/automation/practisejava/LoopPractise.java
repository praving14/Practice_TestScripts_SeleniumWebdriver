package com.synchronisys.automation.practisejava;

/**
 * Created by Pravin on 8/20/2015.
 */
public class LoopPractise{

    public static void loopOverNumbersDivisibleBy2(){
        System.out.println("These are the number from 0 to 100 without the numbers that are divisible by 2");
        int i;
        for (i=0; i<101 ; i++){
            if (i % 2 == 0 ) continue;
            System.out.println(i);
        }
    }


    public  static void  main(String[] args){
        loopOverNumbersDivisibleBy2();
    }

}

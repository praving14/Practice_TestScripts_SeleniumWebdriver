package com.synchronisys.automation.practisejava;

import javax.lang.model.element.Name;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Pravin on 8/16/2015.
 */
public class PractiseJava {

    public static void main(String[] args) {



        int i = intValue(args[0]);
        System.out.println(" The i value is " + i );
        if (i>=5){
            System.out.println("It is greater than or equal 5");
        }
        else{
            System.out.println("It is less than 5");
        }


    }
    private static int intValue(String data) {
        return Integer.parseInt(data);
    }
}


package org.example;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
//  var num = 5;
//  int num = 5;


public class Main {



    public static void main(String[] args) {
        // LVTI - Local Variable type Interference
        var inputStreamReader = new InputStreamReader(System.in);
        var reader = new BufferedReader(inputStreamReader);
        var obj = new MyWelcomeScreenImageForTheHomePage();
        var list = new ArrayList<>();

        int num;

        var num2 = "Hyder";
        num2 = "Navin";



        System.out.println("Hello world!");
    }
}

class MyWelcomeScreenImageForTheHomePage
{

}

// var
// sealed
// records
// text block




package com.diego;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        if(args.length==1){
            Counter fwc = new FileWordCounter();
            fwc.count(args[0]);
        }else{
            System.out.println("Incorrect argument number.\nWord Counter is a command-line application that takes a " +
                    "path to a file as an argument and prints a word count of its contents.");
        }


    }
}

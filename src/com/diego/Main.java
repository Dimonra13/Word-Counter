package com.diego;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
	    System.out.println("==> Welcome to Word Counter, this program is design to count how many times each word appears in a file.\n" +
                "==> Write 'EXIT' to close Word Counter");
        Scanner input = new Scanner(System.in);
        Counter fwc = new FileWordCounter();
        boolean exit = false;
        while(!exit){
            System.out.print("==> File path: ");
            String path = input.nextLine();
            exit = path.equalsIgnoreCase("EXIT");
            if(!exit){
                fwc.count(path);
            }
        }
    }
}

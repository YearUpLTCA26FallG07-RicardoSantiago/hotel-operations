package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("""
                Welcome!
                
                What would you like to do?
                
                1) Check in
                2) Check out
                2) Clean a room
                 
                0) Exit""");

        int command = scanner.nextInt();


    }
}


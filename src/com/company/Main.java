package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        String[] grid = new String[10];
        for (int i = 0; i >= 10; i++)
            grid[i] = "1";
        Scanner playerOne = new Scanner(System.in);
        Scanner playerTwo = new Scanner(System.in);
        int input, winCheck;
        String checkLine = null;
        while (true) {
            System.out.println("Player One input the space you would like to select (0-8)");
            input = playerOne.nextInt();
            grid[input] = "X";
            System.out.println(" " + grid[0] + " | " + grid[1] + " | " + grid[2] + " ");
            System.out.println("-----------------");
            System.out.println(" " + grid[3] + " | " + grid[4] + " | " + grid[5] + " ");
            System.out.println("-----------------");
            System.out.println(" " + grid[6] + " | " + grid[7] + " | " + grid[8] + " ");
            System.out.println("-----------------");

            System.out.println("Player Two input the space you would like to select (0-8)");
            input = playerTwo.nextInt();
            grid[input] = "O";
            System.out.println(" " + grid[0] + " | " + grid[1] + " | " + grid[2] + " ");
            System.out.println("-----------------");
            System.out.println(" " + grid[3] + " | " + grid[4] + " | " + grid[5] + " ");
            System.out.println("-----------------");
            System.out.println(" " + grid[6] + " | " + grid[7] + " | " + grid[8] + " ");
            System.out.println("-----------------");

        }


    }

}
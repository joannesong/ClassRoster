package com.company;
import java.util.Scanner;
import java.lang.String;


public class Main {

    public static void main(String[] args) {
        System.out.println("How well do you know your Android classmates? \n (press any key and enter to continue)");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if(!input.isEmpty()){
            System.out.println("Can you name all 37 of your classmates? Type 'hint' to get a hint and 'i give up' if you'd like to leave the game \n (enter your name to play!)");
        }
        BeginGame beginGame = new BeginGame();
        beginGame.game();


    }

}

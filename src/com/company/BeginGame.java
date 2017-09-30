package com.company;
import java.util.ArrayList;
import java.util.Scanner;
import java.lang.String;

public class BeginGame {


    BeginGame(){

    }

    public static void game(){
        String[] roster = {"amar", "lelucksamee", "fransisco", "jervon", "boubacor", "anas", "laquana", "daniel", "elle",  "nikunjan", "melina", "ashley", "volha", "wayne", "anne", "vivian", "yoke", "victoria", "siran", "yisandy", "mustafizur", "muaadh", "tatiana","mohammad","tariqua", "muhaimen", "darnell", "amirah", "murodjon", "bryant", "amy", "oleg", "joanne", "shantal", "kevin", "niema", "taishawn"};
        System.out.println(roster.length);
        ArrayList<String> classmates = new ArrayList<>();
        for(int j = 0; j <roster.length; j++){
            classmates.add(roster[j]);
        }

        boolean continueUntil36 = true;
        Scanner scanner = new Scanner(System.in);
        int counter = 0;
        String giveUp = "i give up";
        String hint = "hint";
        int helper = 0;



        while(counter < 37){
            String userInput = scanner.nextLine();
            for(int i = 0; i<classmates.size();i++) {
                userInput = userInput.toLowerCase();
                if(userInput.equals(classmates.get(i))){
                    counter++;
                    System.out.println(counter);
                    classmates.remove(userInput);
                }

            }

            if(userInput.equals(giveUp)){
                helper = 1;
            }
            else if(userInput.equals(hint)){
                helper = 2;
            }

            switch(helper){
                case 1:
                    System.out.println("Nice try! You got " + counter + " classmates!" + " You missed: " + classmates + " Lets get to know them!");
                    helper = 0;
                    break;
                case 2:
                    System.out.println(classmates.get(0));
                    helper = 0;
                    break;
            }
        }
        System.out.println("Awesome! You really know your class!");

    }
}

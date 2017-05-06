package com.Nugget;

import java.util.Scanner;

public class BuildUser {
    public BuildUser() {
    }

    public static void main(String[] args) {
        String userName = "";
        String thing = "";
        String question= "";

        Scanner input = new Scanner(System.in);
        System.out.println("Who the hell are you?");
        userName = input.nextLine();
        if(userName.equals("")) {
            System.out.println("Fine I will call you Bob");
            userName = "Bob";

            try {Thread.sleep(4000L);
            } catch (InterruptedException var7) {
                var7.printStackTrace();
            }
        }

        System.out.println("Well " + userName + " what the hell are you?");
        thing = input.nextLine();
        if(thing.equals("")) {
            System.out.println("You look like a simple human to me.");
            thing = "human";
            try {Thread.sleep(4000L);
            } catch (InterruptedException var6) {
                var6.printStackTrace();
            }
        }
        System.out.println("Ok " + thing + " " + userName + " what do you want?");
        question = input.nextLine();
        while(question.equals("")){
            System.out.println("What do you want?");
            question = input.nextLine();
        }
        question = question.toLowerCase();
        if (question.startsWith("i want a")){
            System.out.println("Good luck with that!");
        }
        else if (question.startsWith("i want to play a game")){
            System.out.println("You have come to the right place");
        }
        //TODO handle other questions
    }
}

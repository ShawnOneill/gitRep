package com.Nugget;

import java.util.Scanner;

public class Random {




        public static void main(String[] args){
            String sentence = "";

            try (Scanner input = new Scanner(System.in)) {

                System.out.println("Enter your sentence: ");
                sentence = input.nextLine();
            }
            for (int i =0; i < sentence.length(); ++i){

                if(isVowel(sentence.charAt(i))) {
                    System.out.print(sentence.charAt(i));
                }
            }

        }
        public static boolean isVowel(char letter){
            if(letter == 'a' || letter == 'A' || letter == 'e' || letter == 'E' || letter == 'i' || letter == 'I'
                    || letter == 'o' || letter == 'O' || letter ==  'u' || letter == 'U' || letter == 'y'|| letter == 'Y')
                return true;
            else return false;
        }


}

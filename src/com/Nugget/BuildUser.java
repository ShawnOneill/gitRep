package com.Nugget;

import java.util.Scanner;

public class BuildUser{

    public void main(String args){
        String sentence = "";
        String ltr= "";
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your sentence: ");
        sentence = input.nextLine();
        for (int i =0; i < sentence.length(); ++i){
            ltr.charAt(i);
           if(isVowel(ltr.charAt(i)) == true)
                System.out.print(ltr);
        }

    }
    public boolean isVowel(char letter){
        if(letter == 'a' || letter == 'A' || letter == 'e' || letter == 'E' || letter == 'i' || letter == 'I'
                || letter == 'o' || letter == 'O' || letter ==  'u' || letter == 'U' || letter == 'y'|| letter == 'Y')
            return true;
        else return false;
    }

}
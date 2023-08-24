package org.example;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        HashMap<Character, Integer> charactersMap = new HashMap<>();
        String inputText;


        System.out.println("Enter a text to count the characters");
        inputText = input.nextLine();
        char[] charactersInString = inputText.toCharArray();

        for ( Character c_Object : charactersInString){

            if (!charactersMap.containsKey(c_Object)) {
                charactersMap.put(c_Object,1);
            } else {
                Integer countC = charactersMap.get(c_Object);
                charactersMap.put(c_Object, countC + 1);
            }


        }
        for (Map.Entry<Character, Integer> character : charactersMap.entrySet()){
            System.out.println(character.getKey() + " : " + character.getValue());
        }
    }
}
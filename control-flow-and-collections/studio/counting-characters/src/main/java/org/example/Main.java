package org.example;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.nio.file.*;


public class Main {
    public static void main(String[] args) throws Exception{

//        Scanner input = new Scanner(System.in);

        String inputText= new String(Files.readAllBytes(Paths.get("/Users/ronaldgutierrezjaramillo/Documents/example.java")));
        System.out.println(inputText);
//        HashMap<Character, Integer> charactersMap = new HashMap<>();

//        System.out.println("Enter a text to count the characters");
//        inputText = input.nextLine();
//        String inputTextLowerCase = inputText.toLowerCase().replaceAll("[^a-zA-Z]", "");
//
//        char[] charactersInString = inputTextLowerCase.toCharArray();
//
//        for ( Character c_Object : charactersInString){
//
//            if (!charactersMap.containsKey(c_Object)) {
//                charactersMap.put(c_Object,1);
//            } else {
//                Integer countC = charactersMap.get(c_Object);
//                charactersMap.put(c_Object, countC + 1);
//            }

//
//        }

        for (Map.Entry<Character, Integer> character : HashMapCreator.getHash(inputText).entrySet()){
            System.out.println(character.getKey() + " : " + character.getValue());
        }
//        input.close();
    }
}
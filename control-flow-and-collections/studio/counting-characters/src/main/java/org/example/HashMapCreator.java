package org.example;
import java.util.HashMap;
public class HashMapCreator {
    public static HashMap<Character,Integer> getHash (String inputText){

        String inputTextLowerCase = inputText.toLowerCase().replaceAll("[^a-zA-Z]", "");
        HashMap<Character, Integer> charactersMap = new java.util.HashMap<>();
        char[] charactersInString = inputTextLowerCase.toCharArray();

        for ( Character c_Object : charactersInString){

            if (!charactersMap.containsKey(c_Object)) {
                charactersMap.put(c_Object,1);
            } else {
                Integer countC = charactersMap.get(c_Object);
                charactersMap.put(c_Object, countC + 1);
            }


        }
        return charactersMap;
    }
}
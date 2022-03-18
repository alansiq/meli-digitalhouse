package com.mercadolivre.a1spring.model;

import java.util.TreeMap;

public class Morse {

    private final static TreeMap<String, Character> morse = new TreeMap<String, Character>();

    static {
        morse.put(".-", 'a');
        morse.put("-...", 'b');
        morse.put("-.-.", 'c');
        morse.put("-..", 'd');
        morse.put(".", 'e');
        morse.put("..-.", 'f');
        morse.put("--.", 'g');
        morse.put("....", 'h');
        morse.put("..", 'i');
        morse.put(".---", 'j');
        morse.put("-.-", 'k');
        morse.put(".-..", 'l');
        morse.put("--", 'm');
        morse.put("-.", 'n');
        morse.put("---", 'o');
        morse.put(".--.", 'p');
        morse.put("--.-", 'q');
        morse.put(".-.", 'r');
        morse.put("...", 's');
        morse.put("-", 't');
        morse.put("..-", 'u');
        morse.put("...-", 'v');
        morse.put(".--", 'w');
        morse.put("-..-", 'x');
        morse.put("-.--", 'y');
        morse.put("--..", 'z');
        morse.put(".----", '1');
        morse.put("..---", '2');
        morse.put("...--", '3');
        morse.put("....-", '4');
        morse.put(".....", '5');
        morse.put("-....", '6');
        morse.put("--...", '7');
        morse.put("---..", '8');
        morse.put("----.", '9');
        morse.put("-----", '0');
        morse.put(".-.-.-", '.');
        morse.put("--..--", ',');
        morse.put("..--..", '?');
        morse.put("-.-.--", '!');
    }


    public static String decode(String morsecode) {

        String[] wordsAsVector = morsecode.split("   ");
        String phrase = "";

        for (int i = 0; i < wordsAsVector.length; i++) {
            String[] morseCharacter = wordsAsVector[i].split(" ");
            String word = "";

            for (int j = 0; j < morseCharacter.length; j++) {

                word = word + morse.get(morseCharacter[j]);

            }

            phrase = phrase + word + " ";

        }


        return phrase;
    }

}

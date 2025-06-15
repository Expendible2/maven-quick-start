package com.example.mavendemo;
import org.apache.commons.lang3.StringUtils;
public class Application {
    public static int acountWords(String text) {
    String[] words = StringUtils.split(text);
    return words != null ? words.length : 0;
    }


    
    public Application() {
        System.out.println ("Inside Application");
    }

    // method main(): ALWAYS the APPLICATION entry point
    public static void main (String[] args) {
    	System.out.println ("Starting Application");
        Application app = new Application();
        String sentence = "I have four words";
        int wordCount = acountWords(sentence);
        System.out.println("Word count: " + wordCount);
    }
}
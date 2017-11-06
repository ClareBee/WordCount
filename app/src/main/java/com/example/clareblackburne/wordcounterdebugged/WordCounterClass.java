package com.example.clareblackburne.wordcounterdebugged;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Set;

/**
 * Created by clareblackburne on 06/11/2017.
 */

public class WordCounterClass {

    ArrayList<String> words;
    HashMap<String, Integer> results;


    public WordCounterClass(){
        this.words = new ArrayList<>();
        this.results = new HashMap<>();

    }

    public int countWords(){
        return words.size();

    }

    public void addWords(String text){
        String[] item = text.split(" ");
        for(String word : item)
            words.add(word);
    }

    public void clearWords(){
        this.words.clear();
    }

    public  String keepCount() {
        for (String word : words) {
            int freq = Collections.frequency(words, word);
            results.put(word, freq);
        }
        return results.toString();
    }


    public String reportResults(){
        Set set=results.entrySet();
        return "Results: " + set;
    }

}

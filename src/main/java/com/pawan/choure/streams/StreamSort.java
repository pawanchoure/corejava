package com.pawan.choure.streams;

import java.util.*;
import java.util.stream.Stream;

public class StreamSort {
    public static void main(String[] args) {
        List<String> words = new ArrayList<>(Arrays.asList("ABC", "DEF", "BCA", "CBA", "FED", "WAIT"));
        System.out.println(words);
        char[] chars = new char[]{'B', 'C', 'A'};
        String word = "BCA";
        Stream<Character> characterStream = word.chars().mapToObj(i -> (char) i);
        characterStream.sorted().forEach(x-> System.out.println(x.toString()));
        //String re = new String(((char[])characterStream.sorted().toArray(), 0, characterStream.sorted().toArray().length - 1);
        HashMap<String, List<String>> resultMap = new HashMap<>();
        words.stream().forEach(x -> groupSimilarWord(x, resultMap));
        for (Map.Entry<String, List<String>> entry : resultMap.entrySet()) {
            System.out.println("Item : " + entry.getKey() + " Count : " + entry.getValue());
        }
    }

    private static void groupSimilarWord(String x, HashMap<String, List<String>> result) {
        Stream<Character> characterStream = x.chars().mapToObj(i -> (char) i);
        //String key = characterStream.sorted().forEach(x->x.toString());
       // System.out.println(key);
        String key=null;
        if (result.containsKey(key)) {

            if (result.containsKey(key)) {
                List<String> words = result.get(key);
                words.add(x);
            }

        } else {
            List<String> words = new ArrayList<>();
            words.add(x);
            result.put(key, words);
        }
    }
}

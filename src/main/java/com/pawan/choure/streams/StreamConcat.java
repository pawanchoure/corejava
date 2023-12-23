package com.pawan.choure.streams;

import java.util.stream.Stream;

public class StreamConcat {
    public static void main(String[] args){
        String firstWord=new String("Pawan");
        String secondWord=new String(" Choure");
        Stream<Character> firstChar=firstWord.chars().mapToObj(x->(char)x);
        Stream<Character> secondChar=secondWord.chars().mapToObj(x->(char)x);
        Stream<Character> combined=Stream.concat(firstChar,secondChar);
        combined.forEach(System.out::println);
    }
}

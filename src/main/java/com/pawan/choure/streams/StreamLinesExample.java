package com.pawan.choure.streams;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class StreamLinesExample {
    public static void main(String[] args){
        try {
            Stream<String> lineStream=Files.lines(Paths.get("src/main/resources/names.txt"));
            lineStream.forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

package com.pawan.choure.streams;

import com.pawan.choure.basic.SystemOutExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamDistinctPeek {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Pawan", "Sunita", "Hrishi","Pawan"));
        System.out.println("Distinct Stream Example");
        names.stream().distinct().forEach(System.out::println);

        Stream.iterate(0,x->x+10).peek(e-> System.out.println(e)).limit(40);

    }
}

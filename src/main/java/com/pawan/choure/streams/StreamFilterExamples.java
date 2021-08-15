package com.pawan.choure.streams;

import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamFilterExamples {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(Arrays.asList("Pawan Choure", "SuniTA CHOURE", "HRISHIKESH CHOURE"));
        Stream<String> upperCaseNames = names.stream().map(String::toUpperCase);
        System.out.println("Upper Case");
        upperCaseNames.forEach(System.out::println);

        Stream<String> lowerCaseNames = names.stream().map(x -> StringUtils.lowerCase(x));
        System.out.println("Lower Case");
        lowerCaseNames.forEach(System.out::println);

/*        Stream<String> lowerCaseNamesFlatMap = names.stream().flatMap(x -> letters(x));  //Exception will be throw here
        lowerCaseNames.forEach(System.out::println);*/

        //Operating on Same Stream will throw below Exception
        //Exception in thread "main" java.lang.IllegalStateException: stream has already been operated upon or closed
        //Either create new Stream manually or use Supplier
        Supplier<Stream<String>> streamSupplier = () -> Stream.of("Pawan Choure", "SuniTA CHOURE", "HRISHIKESH CHOURE");
        streamSupplier.get();

        Stream<String> upperCaseNamesSupplier = streamSupplier.get().map(String::toUpperCase);
        System.out.println("Upper Case Stream Supplier");
        upperCaseNamesSupplier.forEach(System.out::println);

        Stream<String> lowerCaseNamesSupplier = streamSupplier.get().map(x -> StringUtils.lowerCase(x));
        System.out.println("Lower Case Stream Supplier");
        lowerCaseNamesSupplier.forEach(System.out::println);

        Stream<String> lowerCaseNamesFlatMapSupplier = streamSupplier.get().flatMap(x -> letters(x));  //Exception will be throw here
        System.out.println("Flat Map Example with Stream Supplier");
        lowerCaseNamesFlatMapSupplier.forEach(System.out::println);

    }

    public static Stream<String> letters(String s) {
        List<String> result = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            result.add(s.substring(i, i + 1));
        }
        return result.stream();
    }
}

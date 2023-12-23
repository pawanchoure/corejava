package com.pawan.choure.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class LambdaConstructorReference {
    public static void main(String[] args)
    {
        ArrayList<String> names=new ArrayList<>(Arrays.asList("Pawan Choure","Sachin Divyaveer","Aheendra Patil"));
        Stream<Person> stream=names.stream().map(Person::new);
        List<Person> personList=stream.collect(Collectors.toList());
        System.out.println(personList.toString());
    }
}

class Person{
String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                '}';
    }
}
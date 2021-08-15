package com.pawan.choure.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LambdaMultipleComparator {
    public static void main(String[] args)
    {
        People[] peopleList= new  People[3];
        peopleList[0]=new People("Pawan","Choure");
        peopleList[1]=new People("Pawan","Kalyani");
        peopleList[2]=new People("Pawan","Awasthi");

        Arrays.sort(peopleList, Comparator.comparing(People::getFirstName).thenComparing(People::getLastName));
        System.out.println(Arrays.toString(peopleList));
    }
}
class People{
    String firstName;
    String lastName;

    public People(String firstName, String lastname) {
        this.firstName=firstName;
        this.lastName=lastname;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "People{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                '}';
    }
}

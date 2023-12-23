package com.pawan.choure.lambda;

import java.util.Arrays;

public class LamdaMethodReference {
    public static void main(String[] args)
    {
        String[] planets = new String[] { "Mercury", "Venus", "Earth", "Mars",
                "Jupiter", "Saturn", "Uranus", "Neptune"};
        System.out.println(Arrays.toString(planets));
        Arrays.sort(planets,String::compareToIgnoreCase);

    }
}

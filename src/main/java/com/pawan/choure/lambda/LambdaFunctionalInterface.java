package com.pawan.choure.lambda;

import java.util.*;

import javax.swing.*;
import javax.swing.Timer;

/**
 * This program demonstrates the use of lambda expressions.
 * @version 1.0 2015-05-12
 * @author Cay Horstmann
 */
public class LambdaFunctionalInterface
{
   public static void main(String[] args)
   {

      // Arrays sort
      //Lambdas works with Functional Interface (Interface with one abstract method) , Here Comparable is Functional Interface
      String[] planets = new String[] { "Mercury", "Venus", "Earth", "Mars", 
            "Jupiter", "Saturn", "Uranus", "Neptune"};
      System.out.println(Arrays.toString(planets));
      System.out.println("Sorted in dictionary order:");
      Arrays.sort(planets);
      System.out.println(Arrays.toString(planets));
      System.out.println("Sorted by length:");
      Arrays.sort(planets, (first, second) -> first.length() - second.length());
      System.out.println(Arrays.toString(planets));

      System.out.println("Sorted by DESC Order:");
      Arrays.sort(planets, (firstParam,secondParam) -> secondParam.compareTo(firstParam));
      System.out.println(Arrays.toString(planets));
            
      //Example usage of Lambda with Predicate Functional Interface
      List<String> planetlist=new ArrayList<>(Arrays.asList(planets));
      System.out.println("PlanetList Size "+planetlist.size());

      //Adding Null with Predicate Functional Interface
      planetlist.add(null);
      System.out.println("PlanetList Size After Null "+planetlist.size());
      planetlist.removeIf(e->e==null);
      System.out.println("PlanetList Size After Null Removal "+planetlist.size());

   }
}

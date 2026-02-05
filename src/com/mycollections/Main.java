/**
 *  Java program to demonstrate work of Map interface deleting value by key.
 */

package com.mycollections;

import java.util.HashMap;
import java.util.Map;

/**
 *  Main class.
 */
public class Main {

    // Main method to run java program.
    public static void main(String[] args) {

        // Creating HashMap using Generics.
        Map<Integer, String> myMap = new HashMap<>();

        // Adding the elements.
        myMap.put(new Integer(1), "Portugal");
        myMap.put(new Integer(2), "Spain");
        myMap.put(new Integer(3), "England");
        myMap.put(new Integer(4), "Germany");
        myMap.put(new Integer(5), "Ireland");
        myMap.put(new Integer(6), "Scotland");
        myMap.put(new Integer(7), "Egypt");
        myMap.put(new Integer(8), "Argentina");

        // Printing initial map to console.
        System.out.println(myMap);

        // Removing element with key 2.
        myMap.remove(2);

        // Printing final map to console.
        System.out.println(myMap);

    }
}
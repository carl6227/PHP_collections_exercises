/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

import java.util.ArrayList;
import java.util.Collections;
import static java.util.Collections.*;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author 2ndyrGroupA
 */
public class javaExercise {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //1. Write a Java function to sort a given array list.

        int[] numberArray = {9, 5, 7, 8, 6, 1, 4, 2, 3};
        List<Integer> numberList = new ArrayList<Integer>();

        //add numbers to numberList.
        for (int numbers : numberArray) {
            numberList.add(numbers);
        }
        System.out.println("#1");
        System.out.println("Unsorterd List: "+numberList);
        sortList(numberList);
        System.out.println("Sorted List: "+numberList);
        System.out.println("----------------------------------------------------"+"\n");
        //2.Write a Java function to rearrange an array list in a random order every time the function is called.
        System.out.println("#2");
        listShuffle(numberList);
        System.out.println("first shuffle: " + numberList);
        listShuffle(numberList);
        System.out.println("second shuffle: " + numberList);
        System.out.println("----------------------------------------------------"+"\n");

        //3.Write a Java function that takes an ArrayList of integers as a parameter and moves the minimum value in the list to the front, while preserving the order of the elements.
        System.out.println("#3");
        System.out.println("numberList before moving the lowest number " + numberList);
        moveLowestNumber(numberList);
        System.out.println("numberList after moving the lowese number " + numberList);
         System.out.println("----------------------------------------------------"+"\n");

        //4.Why should we opt for isEmpty() over size?
            //We should use isEmpty over size because it enables our code to be more readble.
        //5. Compare and contrast the classic for loop versus foreach. What are the pros and cons of both sides?
           //classic for loop basically has a long query while foreach is much shorter, foreach is more suitable 
            //when you want to get all the items of an array or arraylist without modifying a specific index where as 
            // classic for loop is suitable when you want to do something on specific indexes.
        //6.Write a Java function that compares 2 sets. Return a set containing the 2 sets’ common values.
        int[] firstArray = {11, 12, 45, 85, 100, 47, 21, 54, 32};
        int[] secondArray = {12, 45, 48, 65, 32, 47, 21, 100};
        Set<Integer> firstNumberSet = new HashSet<Integer>();
        Set<Integer> secondNumberSet = new HashSet<Integer>();
        for (int firstSet : firstArray) {
            firstNumberSet.add(firstSet);
        }
        for (int secondSet : secondArray) {
            secondNumberSet.add(secondSet);
        }
        System.out.println("#6");
        System.out.println("This is the first Set of integers: " + firstNumberSet);
        System.out.println("This is the second Set of integers: " + firstNumberSet);
        commonValue(firstNumberSet, secondNumberSet);
        System.out.println("----------------------------------------------------"+"\n");

        //7. Write a Java function that compares 2 sets and returns a set containing the values that are unique between the 2 sets.
        int[] firstTempArray = {11, 12, 45, 85, 100, 47, 21, 54, 32};
        int[] secondTempArray = {12, 45, 48, 32, 47, 21, 100};
        Set<Integer> firstSetNumbers = new HashSet<Integer>();
        Set<Integer> secondSetNumbers = new HashSet<Integer>();
        for (int firstSet : firstTempArray) {
            firstNumberSet.add(firstSet);
        }
        for (int secondSet : secondTempArray) {
            secondNumberSet.add(secondSet);
        }
        System.out.println("#7");
        uniqueValue(firstNumberSet, secondNumberSet);//calling the uniqueValue
        System.out.println("----------------------------------------------------"+"\n");
        // 8. Write a Java function that counts the number of keys in a map that starts with “concordia”.
        System.out.println("#8");
        Map<String, Integer> myMap = new HashMap<String, Integer>();
        myMap.put("concordia1", 14);
        myMap.put("concordia2", 6);
        myMap.put("unconcordia", 16);
        myMap.put("concordia3", 17);
        //call the numberOfOccurence function.
        numberOfOccurence(myMap);
        System.out.println("----------------------------------------------------"+"\n");
    }
//function for number 1
    public static void sortList(List<Integer>myList){
      Collections.sort(myList);
    }
    
//function for number 2
    public static void listShuffle(List<Integer> numberList) {
        Collections.shuffle(numberList);
    }
//function for number 3

    public static void moveLowestNumber(List<Integer> numberList) {
        for (int index = 0; index < numberList.size(); index++) {
            if (numberList.get(0) > numberList.get(index)) {
                numberList.set(0, numberList.get(index));
            }

        }
    }
//function for number 6

    public static void commonValue(Set<Integer> firstSetNumbers, Set<Integer> secondSetNumbers) {
        firstSetNumbers.retainAll(secondSetNumbers);
        System.out.println("The common value between the firstNumberSet and secondNumberSet are " + firstSetNumbers);
    }

    //function for number 7 
    public static void uniqueValue(Set<Integer> firstSetNumbers, Set<Integer> secondSetNumbers) {
        firstSetNumbers.removeAll(secondSetNumbers);
        // secondSetNumbers.removeAll(firstSetNumbers);

        System.out.println("The unique value between the firstSetNumber and secondSetNumber are " + firstSetNumbers );
    }
    //function for number 8
    public static void numberOfOccurence(Map<String, Integer> myMap) {
        int keyCounter = 0;
        for (String key : myMap.keySet()) {
            if (key.startsWith("concordia")) {
                keyCounter++;
            }

        }

        System.out.println("Number of occurence of the key concordia: " + keyCounter);
    }
}

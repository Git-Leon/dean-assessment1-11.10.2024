package com.zipcodewilmington.assessment1.part2;

import java.util.*;

/**
 * Created by leon on 2/16/18.
 * // java fundamentals
 * // collections
 * // streams
 * // data: jdbc,jpa
 * // web: spring, apache
 */
public class ArrayUtils {
    /**
     * @param objectArray   an array of any type of Object
     * @param objectToCount any non-primitive value
     * @return the number of times the specified `value` occurs in the specified `objectArray`
     * Given an array of objects, named `objectArray`, and an object `objectToCount`, return the number of times the `objectToCount` appears in the `objectArray`
     */
    public static Integer getNumberOfOccurrences(Object[] objectArray, Object objectToCount) {
        return Collections.frequency(Arrays.asList(objectArray), objectToCount);
    }

    /**
     * @param objectArray    an array of any type of Object
     * @param objectToRemove a value to be removed from the `objectArray`
     * @return an array with identical content excluding the specified `objectToRemove`
     * Given an array of objects `objectArray`, and an object `objectToRemove`, return an array of objects with identical contents excluding `objectToRemove`
     */
    public static Object[] removeValue(Object[] objectArray, Object objectToRemove) {
        final List<Object> unmodifiableList = Arrays.asList(objectArray);
        final List<Object> modifiableList = new ArrayList<>(unmodifiableList);
        modifiableList.remove(objectToRemove);
        return modifiableList.toArray(new Integer[0]);
    }

    /**
     * @param objectArray an array of any type of Object
     * @return the most frequently occurring object in the array
     * given an array of objects, named `objectArray` return the most frequently occurring object in the array
     */
    public static Object getMostCommon(Object[] objectArray) {
        Map<Object, Integer> map = new TreeMap<>();

        for(Object currentElement : objectArray) { // element
            Integer numberOfOccurrences = getNumberOfOccurrences(objectArray, currentElement);
            map.put(currentElement, numberOfOccurrences);
        }
        Object mostFrequent = map.keySet().stream().findFirst().get();
        return mostFrequent;
    }


    /**
     * @param objectArray an array of any type of Object
     * @return the least frequently occurring object in the array
     * given an array of objects, named `objectArray` return the least frequently occuring object in the array
     */
    public static Object getLeastCommon(Object[] objectArray) {
        Map<Object, Integer> map = new HashMap<>();
        int minCount = Integer.MAX_VALUE;
        Object leastCommon = null;

        for(Object obj : objectArray) {
            if (map.containsKey(obj)) {
                map.put(obj, map.get(obj) + 1);
            } else {
                map.put(obj, 1);
            }
        }

        for(Map.Entry<Object, Integer> entry : map.entrySet()){
            if(entry.getValue() < minCount){
                minCount = entry.getValue();
                leastCommon = entry.getKey();
            }
        }
        return leastCommon;
    }

    /**
     * @param objectArray      an array of any type of Object
     * @param objectArrayToAdd an array of Objects to add to the first argument
     * @return an array containing all elements in `objectArray` and `objectArrayToAdd`
     * given two arrays `objectArray` and `objectArrayToAdd`, return an array containing all elements in `objectArray` and `objectArrayToAdd`
     */ // Liskov Substitution
    public static Object[] mergeArrays(Object[] objectArray, Object[] objectArrayToAdd) {
        Collection<Object> mergedArray = new ArrayList<>(Arrays.asList(objectArray));
        for(Object obj : objectArrayToAdd){
            mergedArray.add(obj);
        }
        return mergedArray.toArray(Arrays.copyOf(objectArray, 0));
    }
}

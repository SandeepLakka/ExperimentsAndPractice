package com.self.datastructures.sorting;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class InBuiltSortingMethodsInJava {

    /**
     * Arrays.sort method of primitives uses Dual Pivot QuickSort Algorithm.
     * It does not care about stability so it is faster compared to object sorting which used TimSort.
     */
    public int[] sortArrayPrimitives(int[] arr){
        Arrays.sort(arr);
        return arr;
    }

    public int[] sortPartOfArrayPrimitives(int[] arr, int start, int end){
        Arrays.sort(arr, start, end);
        return arr;
    }

    public Integer[] sortArrayOfObjects(Integer[] arr){
        Arrays.sort(arr);
        return arr;
        //Arrays.sort(arr, Collections.reverseOrder()) ; // to sort in reverse of natural sorting order.
        //Collections.sort(list, comparator); // custom comparator can also be specified.
    }

    public List<Integer> sortListOfObjects(List<Integer> list){
        Collections.sort(list);
        return list;
        //Collections.sort(list, Collections.reverseOrder()); // to sort in reverse of natural sorting order.
        //Collections.sort(list, comparator); // custom comparator can also be specified.
    }
}

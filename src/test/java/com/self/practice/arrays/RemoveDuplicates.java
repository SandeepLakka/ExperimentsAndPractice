package com.self.practice.arrays;

public class RemoveDuplicates {
    int removeDuplicates(int[] input){
        int current = 0;
        for(int i=1; i< input.length; i++){
            if(input[i] != input[current]){
                input[++current] = input[i];
            }
        }
        return current+1;
    }
}

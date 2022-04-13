package com.self.practice.arrays;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ModMax {

    //bruteforce
    public int solve(List<Integer> A) {
        int result = -1;
        for (int i = 0; i < A.size(); i++) {
            for (Integer integer : A) {
                result = Math.max(result, A.get(i) % integer);
            }
        }
        return result;
    }

    //better
    public int solveBetter(List<Integer> A) {
        Set<Integer> sortedA = A.stream().sorted().collect(Collectors.toCollection(LinkedHashSet::new));
        if (sortedA.size() <= 1) {
            return 0;
        } else {
            return sortedA.stream().skip(sortedA.size() - 2).limit(1).findFirst().orElse(0);
        }
    }

    //better than better
    public int solveBetterer(List<Integer> A) {
        int highest, higher;
        highest = higher = Integer.MIN_VALUE;
        for (int val : A) {
            if (val > highest) {
                highest = val;
            } else if (val > higher && val != highest) {
                higher = val;
            }
        }
        return higher == Integer.MIN_VALUE ? 0 : higher;
    }

}

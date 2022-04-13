package com.self.practice.arrays;

import java.util.List;

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

}

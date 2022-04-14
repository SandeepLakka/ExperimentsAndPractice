package com.self.practice.arrays;

import java.util.List;

public class GreaterOrLesser {

    public int solve(List<Integer> A, List<Integer> B, int C) {
        return (int) Math.max(
                A.stream().filter(val -> val > C).count(),
                B.stream().filter(val -> val < C).count()
        );
    }
}


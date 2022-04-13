package com.self.practice.strings;

/*
Problem Description

Given a string A which contains only three characters {'x', 'o', '.'}.
Find minimum possible distance between any pair of 'x' and 'o' in the string.
Distance is defined as the absolute difference between the index of 'x' and 'o'.

NOTE: If there is no such pair return -1.

Problem Constraints
1 <= |A| <= 105

Input Format
First and only argument is a string A.

Output Format
Return an integer denoting the minimum possible distance.

Example Input
Input 1:
 A = "x...o.x...o"
Input 2:
 A = "xxx...xxx"

Example Output
Output 1:
 2
Output 2:
 -1

Example Explanation
Explanation 1:
 Minimum distance is between 'o' at index 5 and 'x' at index 7 i.e |7 - 5| = 2
Explanation 2:
 There is no such pair, return -1.
 */
public class MinimumDistance {

    public int findMinDistance(String input) {
        int result = Integer.MAX_VALUE;

        int oIndex = -1;
        int xIndex = -1;
        int len = -1;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == 'o') {
                oIndex = i;
                if (xIndex != -1) {
                    result = Math.min(result, oIndex - xIndex);
                }
            }
            if (input.charAt(i) == 'x') {
                xIndex = i;
                if (oIndex != -1) {
                    result = Math.min(result, xIndex - oIndex);
                }
            }
        }

        return result == Integer.MAX_VALUE ? -1 : result;
    }
}

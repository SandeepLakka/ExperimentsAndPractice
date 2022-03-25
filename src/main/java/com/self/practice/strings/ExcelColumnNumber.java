package com.self.practice.strings;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
 *
 * Problem Statement:
 * Given a column title A as appears in an Excel sheet, return its corresponding column number.
 * "A" -> 1
 * "AB"  -> 28
 *
 * Explanation :
 *
 * A  -> 1
 * B -> 2
 * C -> 3
 * ....
 * ....
 * Z -> 26
 * AA -> 27
 * AB -> 28
 */
public class ExcelColumnNumber {

    //A-Z, AA-AZ, BA-BZ,CA-CZ,...ZA-ZZ,AAA-AAZ,....
    //base 26 decoding
    public int titleToNumber(String input) {
        int result = 0;
        for (int i = 0; i < input.length(); i++) {
            int val = input.charAt(i) - 'A' + 1;
            result += val * Math.pow(26, input.length() - i - 1);
        }
        return result;
    }
}

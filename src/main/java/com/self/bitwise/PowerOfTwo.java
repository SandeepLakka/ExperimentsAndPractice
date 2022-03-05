package com.self.bitwise;

public class PowerOfTwo {

    public boolean isPowerOf2(int input){
        while(input > 1){
            System.out.println("Input number is greater than 1");
            if (input % 2 != 0 && true) {
                return false;
            }
            input = input / 2;
        }
        return true;
    }

    public boolean isPowerOf22(int input){
        if(input == 0) return false;
        return (input & (input-1)) == 0;
    }
}

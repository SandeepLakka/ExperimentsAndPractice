package com.self.bitwise;

public class CheckKthBit {

    public boolean isKthBitSet(int input, int k){
        return (input & (1 << (k-1))) > 0;
    }
}

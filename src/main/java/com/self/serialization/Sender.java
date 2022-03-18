package com.self.serialization;

import java.io.*;

public class Sender {
    public static void main(String[] args) throws IOException {
        TestObject testObject = new TestObject();
        FileOutputStream fos = new FileOutputStream("info.txt");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(testObject);
    }
}

package com.self.serialization;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Receiver {
    /*
     * If the TestObject doesn't have serialVersionUID and the class gets modified
     * prior to deserialization, then we'll be getting InvalidClassException as JVM
     * auto computes the serialVersionUID based on class structure.
     * If we provided a specific id on the other hand, JVM backs off auto computation
     * part and takes what we provided in the metadata of serialized object and compares
     * the same while deserializing it.
     *
     */
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        FileInputStream fis = new FileInputStream("info.txt");
        ObjectInputStream ois = new ObjectInputStream(fis);
        TestObject object = (TestObject) ois.readObject();
        System.out.println("Deserialized Instance : " + object.getFullName());
        System.out.println(object.getId());
    }
}

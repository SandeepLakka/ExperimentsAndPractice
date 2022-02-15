package com.self.datastructures.list;

//TODO
//Specify preconditions explicitly
//Add more methods to the contract to support sorting,
//iterator and addAll functionality

public interface List<T> {
    //Return the number of elements of the list
    int size();

    //Adds an element to the list
    void add(T element);

    //Returns true if the list contains an element
    //e such that e.equals(element) and returns true
    //Otherwise, return false
    boolean contains(T element);

    //Removes all elements of the list
    void clear();

    //Removes an element if exists i.e an element e
    //such that e.equals(element) and returns true
    //Otherwise, return false
    boolean remove(T element);

    //Removes an element at a specified index if
    //the index is within bounds of list length
    //and returns true
    //Otherwise, return false
    boolean remove(int index);

    //Returns an element if there exists an element e
    //such that e.equals(element), Else returns null
    T get(T element);

    //Returns an element at specified index of the
    //index is within bounds of list length
    //and returns true
    //Otherwise, return false
    T get(int index);

    //Returns true if the list is empty, Else false
    boolean isEmpty();

    //Returns the index of element e such that
    //e.equals(element), Otherwise return -1
    int indexOf(T element);

}

package com.codewithjosue;

public interface LinkedListInterface {
    int size();
    void addFirst(String value);
    void addLast(String value);
    String removeFirst();
    void show();
    boolean isEmpty();
    String first();
    String last();
    void insert(int index, String value);
}

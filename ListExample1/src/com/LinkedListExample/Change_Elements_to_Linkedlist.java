
package com.LinkedListExample;

import java.util.LinkedList;
public class Change_Elements_to_Linkedlist {
    public static void main(String[] args) {
        LinkedList<String> languages = new LinkedList<>();

        // add elements in the linked list
        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");
        languages.add("Java");
        System.out.println("LinkedList: " + languages);

        // change elements at index 3
        languages.set(3, "Kotlin");
        System.out.println("Updated LinkedList: " + languages);
    }
}
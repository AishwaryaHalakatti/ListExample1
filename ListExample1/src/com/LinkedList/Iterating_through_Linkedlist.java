
package com.LinkedList;

import java.util.LinkedList;
public class Iterating_through_Linkedlist {
    public static void main(String[] args) {
        // Creating a linked list
        LinkedList<String> animals = new LinkedList<>();
        animals.add("Cow");
        animals.add("Cat");
        animals.add("Dog");
        System.out.println("LinkedList: " + animals);

        // Using forEach loop
        System.out.println("Accessing linked list elements:");
        for(String animal: animals) {
            System.out.print(animal);
            System.out.print(", ");
        }
    }
}

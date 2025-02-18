package org.juan;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //ArrayList
        System.out.println("This is an ArrayList:");
        List<Book> books = new ArrayList<>();
        books.add(new Book("The Hunger Games", "Suzanne Collins"));
        books.add(new Book("Catching Fire", "Suzanne Collins"));
        books.add(new Book("Mockingjay", "Suzanne Collins"));

        for (Book b : books) {
            System.out.println(b.getTitle() + " by " + b.getAuthor());
        }
        System.out.println("=======================\n");

        //HashMap
        System.out.println("this is a HashMap:");
        Map<Integer, Book> books2 = new HashMap<>();
        books2.put(13292, new Book("Harry Potter", "J.K. Rowling"));
        books2.put(22248, new Book("1984", "George Orwell"));
        books2.put(39978, new Book("All the crooked saints", "Maggie S."));

        //Only the keys
        for (Integer i : books2.keySet()){
            System.out.println("Keys: " + i);
        }
        System.out.println("=======================\n");
        //only the values
        for (Book b : books2.values()){
            System.out.println(b.getTitle() + " by " + b.getAuthor());
        }
        System.out.println("=======================\n");
        //both
        for (Map.Entry<Integer, Book> e : books2.entrySet()){
            System.out.println("SKU: " + e.getKey() + " - "
                    + e.getValue().getTitle() + " by " + e.getValue().getAuthor());
        }
    }
}
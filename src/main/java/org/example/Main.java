package org.example;

public class Main {
    public static void main(String[] args) {
        Record<String, String> r1 = new Record<>("name", "Adilson Fuxe");
        Record<String, Integer> r2 = new Record<>("Age", 25);

        System.out.println( r1.getKey() + ": " + r1.getValue());
        System.out.println( r2.getKey() + ": " + r2.getValue());
    }
}
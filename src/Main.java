package src;

import src.subjects.MapPractice;
import src.subjects.RecursionPractice;

public class Main {
    public static void main(String[] args) {
        MapPractice mappy = new MapPractice();
        RecursionPractice recurse = new RecursionPractice();

        int value = recurse.countX("xxherx");
        System.out.println(value);
    }
}

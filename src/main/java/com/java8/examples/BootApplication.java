package com.java8.examples;

import com.java8.examples.hashmap.HashMapExamples;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

@SpringBootApplication
public class BootApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootApplication.class, args);

        Map<Character, Integer> map = new HashMap<Character, Integer>();
        System.out.print("Letter Repeat Challenge Example - Phrase input: ");
        String frase = new Scanner(System.in).nextLine();

        printMap(HashMapExamples.sortMap(map,frase));

    }

    private static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println("Key : " + entry.getKey()
                    + " Value : " + entry.getValue());
        }
    }

}

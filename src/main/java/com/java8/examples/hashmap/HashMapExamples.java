package com.java8.examples.hashmap;

import java.util.*;

public class HashMapExamples {

    public static Map<Character, Integer> sortMap(Map<java.lang.Character, Integer>hmletters, String frase) {


        frase = frase.toUpperCase();
        for (Character c : frase.toCharArray()) {
            Integer qtd = hmletters.get(c);
            if (qtd == null) {
                hmletters.put(c, new Integer(1));
            } else {
                qtd++;
                hmletters.remove(c); // remove
                hmletters.put(c, new Integer(qtd)); //input same letter with other value
            }
        }

        // Sort HashMap

        return sortByValue(hmletters);

    }

    private static Map<Character, Integer> sortByValue(Map<Character, Integer> unsortMap) {

        // 1. Convert Map to List of Map
        List<Map.Entry<Character, Integer>> list =
                new LinkedList<Map.Entry<Character, Integer>>(unsortMap.entrySet());

        // 2. Sort list with Collections.sort(), provide a custom Comparator
        //    Try switch the o1 o2 position for a different order
        Collections.sort(list, new Comparator<Map.Entry<Character, Integer>>() {
            public int compare(Map.Entry<Character, Integer> o1,
                               Map.Entry<Character, Integer> o2) {
                return (o1.getValue()).compareTo(o2.getValue());
            }
        });

        // 3. Loop the sorted list and put it into a new insertion order Map LinkedHashMap
        Map<Character, Integer> sortedMap = new LinkedHashMap<Character, Integer>();
        for (Map.Entry<Character, Integer> entry : list) {
            sortedMap.put(entry.getKey(), entry.getValue());
        }

        /*
        //classic iterator example
        for (Iterator<Map.Entry<String, Integer>> it = list.iterator(); it.hasNext(); ) {
            Map.Entry<String, Integer> entry = it.next();
            sortedMap.put(entry.getKey(), entry.getValue());
        }*/

        return sortedMap;
    }


}

package com.java8.examples.lambda;

import java.util.*;

public class LambdaExamples {


    public static void lambdaTest (){

        List<String> palavras = Arrays.asList("rodrigo", "paulo", "caelum");

        /*Comparator<String> comparador = new Comparator<String>() {
            public int compare(String s1, String s2) {
                return Integer.compare(s1.length(), s2.length());
            }
        };

        Comparator<String> comparador = (s1, s2) -> {
            return Integer.compare(s1.length(), s2.length());
        };

        Collections.sort(palavras, comparador);

        palavras.sort(comparador);*/

        palavras.sort(Comparator.comparing(s -> s.length()));
    }
}

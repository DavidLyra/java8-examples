package com.java8.examples;

import com.java8.examples.set.Conjunto;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;


@SpringBootApplication
public class SetApplication {

    public static void main(String[] args) {
        SpringApplication.run(SetApplication.class, args);

        Conjunto conjunto = new Conjunto();

        conjunto.adiciona("Mauricio");
        System.out.println(conjunto);

        conjunto.adiciona("Mauricio");
        System.out.println(conjunto);

        conjunto.adiciona("Marcelo");
        conjunto.adiciona("Guilherme");
        System.out.println(conjunto);

        conjunto.remove("Mauricio");
        System.out.println(conjunto);

        // À estrutura de Conjuntos damos o nome de Set e sua implementação é o HashSet:

        Set<String> conjuntoDoJava = new HashSet<String>();

        conjuntoDoJava.add("Mauricio");

        // Para espalhar os dados, o HashSet se utiliza do método HashCode

        String x = "Guilherme";
        x.hashCode();

    }



}

package com.java8.examples;

import com.java8.examples.linkedlist.ListaLigada;
import com.java8.examples.vetor.Aluno;
import com.java8.examples.vetor.Vetor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class LinkedListApplication {

    public static void main(String[] args) {
        SpringApplication.run(LinkedListApplication.class, args);

        ListaLigada lista = new ListaLigada();

        System.out.println(lista);
        lista.adicionaNoComeco("mauricio");
        System.out.println(lista);
        lista.adicionaNoComeco("paulo");
        System.out.println(lista);
        lista.adicionaNoComeco("guilherme");
        System.out.println(lista);

        lista.adiciona("marcelo");
        System.out.println(lista);

        lista.adiciona(2, "gabriel");
        System.out.println(lista);

        Object x = lista.pega(2);
        System.out.println(x);

        System.out.println(lista.tamanho());

        lista.removeDoComeco();
        System.out.println(lista);

    }



}

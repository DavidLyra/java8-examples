package com.java8.examples;

import com.java8.examples.pile.Pilha;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Stack;

@SpringBootApplication
public class PileApplication {

    public static void main(String[] args) {
        SpringApplication.run(PileApplication.class, args);

        // O primeiro a entrar é o último a sair

        Pilha pilha = new Pilha();

        System.out.println(pilha.vazia());

        pilha.insere("Mauricio");
        System.out.println(pilha);

        pilha.insere("Guilherme");
        System.out.println(pilha);

        String r1 = pilha.remove();
        System.out.println(r1);

        String r2 = pilha.remove();
        System.out.println(r2);

        System.out.println(pilha);

        System.out.println(pilha.vazia());

        // Stack é a classe de pilha do Java

        Stack<String> stack = new Stack<String>();
        stack.push("Mauricio");
        stack.push("Marcelo");

        System.out.println(stack);

        // remove o ultimo

        stack.pop();
        System.out.println(stack);

        String nome = stack.peek();
        System.out.println(nome);

    }



}

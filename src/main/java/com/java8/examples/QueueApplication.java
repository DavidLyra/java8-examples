package com.java8.examples;

import com.java8.examples.queue.Fila;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.LinkedList;
import java.util.Queue;

@SpringBootApplication
public class QueueApplication {

    public static void main(String[] args) {
        SpringApplication.run(QueueApplication.class, args);

        // O primeiro a entrar é o primeiro a ser atendido/sair

        Fila fila = new Fila();

        fila.adiciona("Mauricio");
        fila.adiciona("Guilherme");

        System.out.println(fila);

        String x1 = fila.remove();
        System.out.println(x1);
        System.out.println(fila);


        // Queue é a Fila do Java

        Queue<String> filaDoJava = new LinkedList<String>();

        filaDoJava.add("Mauricio");
        String x2 = filaDoJava.poll();

    }



}

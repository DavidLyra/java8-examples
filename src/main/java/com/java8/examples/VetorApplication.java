package com.java8.examples;

import com.java8.examples.vetor.Aluno;
import com.java8.examples.vetor.Vetor;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class VetorApplication {

    public static void main(String[] args) {
        SpringApplication.run(VetorApplication.class, args);

        Aluno a1 = new Aluno("Joao");
        Aluno a2 = new Aluno("Jose");
        Aluno a3 = new Aluno("David");

        Vetor lista = new Vetor();

        System.out.println(lista.tamanho());
        lista.adiciona(a1);
        System.out.println(lista.tamanho());
        lista.adiciona(a2);
        System.out.println(lista.tamanho());

        System.out.println(lista);

        lista.adiciona(1, a3);
        System.out.println(lista);

        lista.remove(1);
        System.out.println(lista);

        for(int i = 0; i < 300; i++) {
            Aluno y = new Aluno("Joao" + i);
            lista.adiciona(y);
        }
        System.out.println(lista);

        /*O Java já tem uma implementação de Vetor, é a Classe conhecida por "ArrayList".
         Ela é bem parecida com tudo o que fizemos até agora e funciona como um Armazenamento
         Sequencial, possuindo os métodos implementados nesta aula:

        ArrayList<Aluno> listaDoJava = new ArrayList<Aluno>();*/

        ArrayList<Aluno> listaDoJava = new ArrayList<Aluno>();

    }



}

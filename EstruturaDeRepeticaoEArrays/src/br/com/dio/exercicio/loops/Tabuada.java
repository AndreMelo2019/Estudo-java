package br.com.dio.exercicio.loops;

/*
 * Desenvolva um gerador de tabuada,
 * capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10.
 * o usuário deve informar de qual numero ele deseja ver a tabuada.
 * A saída deve ser conforme o exemplo abaixo:
    Tabuada de 5:
        5 X 1 = 5
        5 X 2 = 10
        ...
        5 x 10 = 50
 * */

import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("Tabuada de " + tabuada);

        for (int i = 1; i <= 10; i++) { // aqui o i seria o counter Do WHILE
            System.out.println(tabuada + " X " + i + " = " + (tabuada * i));
        }
    }
}

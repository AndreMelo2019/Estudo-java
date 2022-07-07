package br.com.dio.exercicio.loops;

/*
 * Faça um programa que preça uma nota, entre zero e dez,
 * Mostre um amensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido
 *
 * */

import java.util.Scanner;

public class Notas {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("Nota: ");
        nota = scan.nextInt();

        while (nota < 0 | nota > 10) {
            System.out.println("Nota inválida! Digite novamente: ");
            nota = scan.nextInt();
        }

        System.out.println("Obrigada por cadastrar a nota");
    }
}

package br.com.dio.exercicio.loops;

/*
 * Faça um programa que leia 5 números,
 * e informe o maior número
 * e a média desses números
 * */

import java.util.Scanner;

public class MaioEMenor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int  numero;
        int maior = 0;
        int soma = 0;
        int count = 0;

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();
            soma = soma + numero;
            if (numero > maior) maior = numero;
            //System.out.println("Maior: " + maior); // Aqui ele imprime o número maior a cada laço que ele faz

            count = count + 1;
        } while (count < 5);

        System.out.println("Maior: " + maior); //Já aqui ele so imprime o valor maior de todo o conjunto
        System.out.println("Média: " + (soma) / 5);
    }
}

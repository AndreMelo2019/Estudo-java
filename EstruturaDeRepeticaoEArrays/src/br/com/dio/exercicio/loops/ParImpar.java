package br.com.dio.exercicio.loops;

/*
 * Faça um programa que peça N números inteiros,
 * calcule e mostre a quantidade de números pares
 * e a quantidade de números impares
 * */

import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int quantNumeros;
        int numero;
        int quantPares = 0, quantImpares = 0;

        System.out.println("Quantidade de números: ");
        quantNumeros = scan.nextInt();

        int count = 0;

        do {
            System.out.println("Número: ");
            numero = scan.nextInt();

            if (numero % 2 == 0) quantPares++;
            else quantImpares++;

            count++; // incrementando para o loop não ficar infinito, pois o count sem essa incrementação ele será sempre 0


        }while (count < quantNumeros);


        System.out.println("Pares: " + quantPares);
        System.out.println("Impares: " + quantImpares);
    }
}

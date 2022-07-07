package br.com.dio.exercicio.arrays;

/*
Faça um programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/

import java.util.Scanner;

public class Consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] consoantes = new String[6];

        int quantConsoantes = 0;

        int counter = 0;

        do {
            System.out.println("Letra: ");
            String letra = scan.next();

            if ( !(letra.equalsIgnoreCase("a") | letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |  letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u")) ) {
                consoantes[counter] = letra;
                quantConsoantes++;
            }
            counter++;
        }while (counter < consoantes.length);

        System.out.println("Consoantes");
        for (String consoante : consoantes) {
            if (consoante != null) {
            System.out.print(consoante + " "); }
        }

        System.out.println("\nQuantidade de consoantes: " + quantConsoantes);
    }
}

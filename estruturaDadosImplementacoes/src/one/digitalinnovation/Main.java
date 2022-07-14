package one.digitalinnovation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int QT = Integer.parseInt(leitor.nextLine());

        String linha1[], linha2[], nome1, escolha1, nome2, escolha2;
        int N = 0;
        int M = 0;

        for (int i = 0; i < QT; i++) {
            linha1 = leitor.nextLine().split(" ");
            linha2 = leitor.nextLine().split(" ");

            nome1 = linha1[0];
            escolha1 = linha1[1];

            nome2 = linha1[2];
            escolha2 = linha1[3];

            N = Integer.parseInt(linha2[0]);
            M = Integer.parseInt(linha2[1]);

            if (((N + M) % 2 == 0 && escolha1.equalsIgnoreCase("PAR")) || ((N+M) % 2 == 1 && escolha1.equalsIgnoreCase("IMPAR"))){
                System.out.println(nome1);
            }
            else {
                System.out.println(nome2);
            }
        };

    }

}
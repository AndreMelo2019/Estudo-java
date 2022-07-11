package br.com.dio.collection.set;

import java.util.*;

public class ExemploSet {
    public static void main(String[] args) {

        System.out.println("Crie um conjunto e adicione as notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d,  7d, 0d, 3.6));
        System.out.println(notas.toString());

        //System.out.println("Exiba a posição da nota 5.0: ");
        //System.out.println("Adicione na lista a nota 8.0 na posição 4: ")
        //System.out.println("\nSubstitua a nota 5.0 pela nota 6.0: ");
        System.out.println("\nConfira se a nota 5.0 está na lista: " + notas.contains(5d));
        //System.out.println("\nExiba a terceira nota adicionada: ");


        System.out.println("\nExiba a menor nota: " + Collections.min(notas));

        System.out.println("\nExiba a maior nota: " + Collections.max(notas));

        Iterator<Double> iterator = notas.iterator();
        Double soma = 0d;
        while (iterator.hasNext()) {
            Double next = iterator.next();
            soma += next;
        }
        System.out.println("\nExiba a soma dos valores:  " + soma);

        System.out.println("\nExiba a média dos valores:  " + (soma/notas.size()));

        System.out.println("\nRemova a nota 0:  ");
        notas.remove(0d);
        System.out.println(notas);

        //System.out.println("\nRemova a nota na posição 0: ");

        System.out.println("\nRemova as notas menores que 7 e exiba a lista: ");
        Iterator<Double> iterator1 = notas.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next < 7) iterator1.remove();
        }

        System.out.println(notas);

        System.out.println("\nExiba todas as notas na ordem em que foram informados: ");
        Set<Double> notas2 = new LinkedHashSet<>(Arrays.asList(7d, 8.5, 9.3, 5d,  7d, 0d, 3.6));
        System.out.println(notas2);

        System.out.println("Exiba todas as notas na ordem crescente");
        Set<Double> notas3 = new TreeSet<>(notas2);
        System.out.println(notas3);

        System.out.println("\nApague toda a lista: ");
        notas.clear();
        System.out.println(notas);
    }
}

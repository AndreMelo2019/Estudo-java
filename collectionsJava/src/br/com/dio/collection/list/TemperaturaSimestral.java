package br.com.dio.collection.list;
/*
Faça um programa que receba a temperatura média dos 6
primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas e
mostre todas as temperaturas acima desta média, e em que
mês elas ocorreram (mostrar o mês por extenso: 1 – Janeiro, 2
– Fevereiro e etc).
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TemperaturaSimestral {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite a temperatura de Janeiro: ");
        double janeiro = scan.nextDouble();

        System.out.println("Digite a temperatura de Fevereiro: ");
        double fevereiro = scan.nextDouble();

        List<Double> mediaTemperatura = new ArrayList<>();
       mediaTemperatura.add(janeiro);
       mediaTemperatura.add(fevereiro);



        System.out.println("1 - Janeiro: " + mediaTemperatura.get(0));
        System.out.println("2 - janeiro: " + mediaTemperatura.get(0));
        System.out.println("3 - janeiro: " + mediaTemperatura.get(0));
        System.out.println("4 - janeiro: " + mediaTemperatura.get(0));
    }
}

class mediaTemperatura {
    private double janeiro, fevereiro, marco, abril, maio;

    public static void add(double janeiro) {
    }

    public double getJaneiro() {
        return  janeiro;
    }

    public void setJaneiro(double janeiro) {
        this.janeiro = janeiro;
    }

    public double getFevereiro() {
        return fevereiro;
    }

    public void setFevereiro(double fevereiro) {
        this.fevereiro = fevereiro;
    }

    public double getMarco() {
        return marco;
    }

    public void setMarco(double marco) {
        this.marco = marco;
    }

    public double getAbril() {
        return abril;
    }

    public void setAbril(double abril) {
        this.abril = abril;
    }

    public double getMaio() {
        return maio;
    }

    public void setMaio(double maio) {
        this.maio = maio;
    }

    @Override
    public String toString() {
        return "{" +
                "janeiro=" + janeiro +
                ", fevereiro=" + fevereiro +
                ", marco=" + marco +
                ", abril=" + abril +
                ", maio=" + maio +
                '}';
    }
}



package br.com.dio.collection.list;
/*
Faça um programa que receba a temperatura média dos 6
primeiros meses do ano e armazene-as em uma lista.
Após isto, calcule a média semestral das temperaturas.
 */

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class TemperaturaSimestral {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        List<Double> mediaTemperatura = new ArrayList<>();

        for (int i = 0; i <= 5; i++) {
            int mes = 1;
            System.out.println(" Digite a " + (mes = mes + i) + " temperatura : ");
            double n = scan.nextDouble();
            mediaTemperatura.add(n);
        }
        ;


        System.out.println("1 - Janeiro: " + mediaTemperatura.get(0));
        System.out.println("2 - Fevereiro: " + mediaTemperatura.get(1));
        System.out.println("3 - Março: " + mediaTemperatura.get(2));
        System.out.println("4 - Abril: " + mediaTemperatura.get(3));
        System.out.println("5 - Maio: " + mediaTemperatura.get(4));
        System.out.println("6 - Junho: " + mediaTemperatura.get(5));

        Iterator<Double> iterator = mediaTemperatura.iterator();
        Double soma = 0d;

        while (iterator.hasNext()) {
            double next = iterator.next();
            soma += next;
        }

        double media = soma / mediaTemperatura.size();
        DecimalFormat formatador = new DecimalFormat("0.00");

        System.out.println("\nA Média de temperatura do semestre foi:  " + formatador.format(media));

        Iterator<Double> iterator1 = mediaTemperatura.iterator();
        while (iterator1.hasNext()) {
            Double next = iterator1.next();
            if (next <= media) iterator1.remove();
        }

        System.out.println("Os menores valores" + mediaTemperatura);

        class mediaTemperatura {
            private double janeiro, fevereiro, marco, abril, maio, junho;

            public mediaTemperatura(double janeiro, double fevereiro, double marco, double abril, double maio, double junho) {
                this.janeiro = janeiro;
                this.fevereiro = fevereiro;
                this.marco = marco;
                this.abril = abril;
                this.maio = maio;
                this.junho = junho;
            }

            public double getJaneiro() {
                return janeiro;
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

            public double getJunho() {
                return junho;
            }

            public void setJunho(double junho) {
                this.junho = junho;
            }

            @Override
            public String toString() {
                return "mediaTemperatura{" +
                        "janeiro=" + janeiro +
                        ", fevereiro=" + fevereiro +
                        ", marco=" + marco +
                        ", abril=" + abril +
                        ", maio=" + maio +
                        ", junho=" + junho +
                        '}';
            }
        }
    }
}
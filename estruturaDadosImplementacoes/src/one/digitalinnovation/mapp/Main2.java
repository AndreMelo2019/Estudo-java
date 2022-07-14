package one.digitalinnovation.mapp;


import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        Map<String, Double> temperaturas = new LinkedHashMap<>();


        for(int i =0; i < 5; i++) {
            double n;
            switch (i) {
                case 0:
                    System.out.println("Digite a temperatura de janeiro: ");
                    n = scan.nextDouble();
                    temperaturas.put("1 - Janeiro", n);
                    break;
                case 1:
                    System.out.println("Digite a temperatura de Fevereiro: ");
                    n = scan.nextDouble();
                    temperaturas.put("2 - Fevereiro", n);
                    break;
                case 2:
                    System.out.println("Digite a temperatura de Março: ");
                    n = scan.nextDouble();
                    temperaturas.put("3 - Março", n);
                    break;
                case 3:
                    System.out.println("Digite a temperatura de Abril: ");
                    n = scan.nextDouble();
                    temperaturas.put("4 - Abril", n);
                    break;
                case 4:
                    System.out.println("Digite a temperatura de MAio: ");
                    n = scan.nextDouble();
                    temperaturas.put("5 - Maio", n);
                    break;
                case 5:
                    System.out.println("Digite a temperatura de Junho: ");
                    n = scan.nextDouble();
                    temperaturas.put("6 - Junho", n);
                    break;
                default:
                    break;
            }
        } System.out.println(temperaturas);

    }


}

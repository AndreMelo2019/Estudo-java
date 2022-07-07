package one.digitalInnovation.basecamp;

public class Main {

    public static void main(String[] args) {
        escolhaCorOlhos();
        int olhos = 3;
        switch (olhos)  {
            case 1:
                System.out.println("Seus olhos são verde");
                break;
            case 2:
                System.out.println("Seus olhos são rosa");
                break;
            case 3:
                System.out.println("Seus olhos são azul");
                break;
            case 4:
                System.out.println("Seus olhos são vermelho");
                break;

        }


    }
    private static void escolhaCorOlhos(){
        System.out.println("Escolha a cor dos olhos do seu avatar entre as quatros opções abaixo");
        System.out.println("1- verde");
        System.out.println("2- rosa");
        System.out.println("3- azul");
        System.out.println("4- vermelho");
    }
}

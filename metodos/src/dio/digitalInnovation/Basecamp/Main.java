package dio.digitalInnovation.Basecamp;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercicio calculadora");
        Calculadora.soma(5,2);
        Calculadora.subtrair(6,3);
        Calculadora.multiplicar(8,4);
        Calculadora.dividir(9,2.5);

        System.out.println("Exercicio Mensagem");
        Mensagem.obterMensagem( 5);
        Mensagem.obterMensagem( 13);
        Mensagem.obterMensagem( 20);
        Mensagem.obterMensagem( 32);

        System.out.println("Exercicio Empréstimo");
        Emprestimo.calcular(1000, Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000, 5);
    }


}

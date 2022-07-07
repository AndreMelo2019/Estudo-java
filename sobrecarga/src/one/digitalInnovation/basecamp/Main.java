package one.digitalInnovation.basecamp;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercicio quadrilátero");

        double areaQuadrado = Quadrilatero.area(3);
        System.out.println("Área do quadrado:" + areaQuadrado);

        double areaRetangulo = Quadrilatero.area(5, 5);
        System.out.println("Área do retangulo:" + areaRetangulo);

        double areaTrapezio = Quadrilatero.area(7, 8,9);
        System.out.println("Área do retangulo:" + areaTrapezio);

        System.out.println("Aluno");
        String primeiroCadastro = Aluno.cadastroAluno("Tayanna");
        System.out.println("Escola de Arte: " + primeiroCadastro);

        int idadeAluno = Aluno.cadastroAluno(25);
        System.out.println("Idade cadastrada: " + idadeAluno );
    }

}

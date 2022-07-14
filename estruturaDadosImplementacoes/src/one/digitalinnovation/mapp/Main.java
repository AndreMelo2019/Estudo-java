package one.digitalinnovation.mapp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String args[]){

        Map<String, String> aluno = new HashMap<>();

        aluno.put("Nome", "João");
        aluno.put("Idade", "17");
        aluno.put("Media", "8.5");
        aluno.put("Turma", "3a");

        System.out.println(aluno);

        System.out.println(aluno.keySet());

        List<Map<String, String>> listaAlunos = new ArrayList<>(); // Adicionando o map numa lista
        listaAlunos.add(aluno); // listaAlunos recebendo o Map aluno

        Map<String, String> aluno2 = new HashMap<>();
        aluno2.put("Nome", "Maria");
        aluno2.put("Idade", "18");
        aluno2.put("Media", "8.9");
        aluno2.put("Turma", "3b");
        listaAlunos.add(aluno2);

        Map<String, String> aluno3 = new HashMap<>();
        aluno3.put("Nome", "Vanessa");
        aluno3.put("Idade", "25");
        aluno3.put("Media", "6.2");
        aluno3.put("Turma", "2b");
        listaAlunos.add(aluno3);

        System.out.println(listaAlunos);

        System.out.println(aluno.containsKey("Nome"));
    }

}

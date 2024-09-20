package org.example;

public class Main2 {
    public static void main(String[] args) {
        Aluno a1 = new Aluno();
        a1.setNome("Renato");
        a1.setMatricula("123");
        System.out.println(a1);
        System.out.println(a1.hashCode());

    }
}

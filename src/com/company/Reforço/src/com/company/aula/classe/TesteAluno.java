package com.company.aula.classe;

public class TesteAluno {
    public static void main(String[] args) {
        Aluno julio = new Aluno();
        System.out.println("Proximo semestre: "+julio.proximoSemestre());
        System.out.printf("Quantidade de faltas: "+julio.quantidadeDeFaltas());
    }
}

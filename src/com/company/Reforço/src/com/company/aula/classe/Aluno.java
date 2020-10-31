package com.company.aula.classe;

public class Aluno {

    private int matricula;// variável destinada ao numero da metricula do aluno
    private String turno;// variavel destinada ao turno que o aluno estuda
    private int semestre = 1;//variavel destinada ao semestre que o aluno está
    private int falta = 0;//variavel destinada a quantidade de faltas


    public int proximoSemestre(){
        return this.semestre + 1;
    }

    public int quantidadeDeFaltas(){
        return this.falta;
    }
}

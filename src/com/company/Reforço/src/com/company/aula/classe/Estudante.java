package com.company.aula.classe;

public class Estudante {
    public  String nome;
    public int idade;
    public String sala;

    public double CalcularMediaProva(double nota1,double nota2,double nota3){
        return (nota1 + nota2 + nota3) / 3;
    }
}

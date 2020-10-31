package com.company.aula.grafico;

import com.company.aula.classe.Aluno;

public class TratamentoDeExececao {
    public static void main(String[] args) {
        Aluno[] alunos = new Aluno[58];
        int indice = 74;
        //tratamento de execeçoes
        try {
            //tenta executar esse cutando
            System.out.println(alunos[indice]);
        }catch(ArrayIndexOutOfBoundsException erro){
            //se houver algur erro no bloco anterior
        }catch (Exception erro){
            //pode-se usar ur catch para cada tipo de erro
            //possivel no bloco try
            System.out.println("exceção inesperada");
        }finally {
            //esse comando sera executado sempre
            System.out.println("executou o finally");
        }
    }
}

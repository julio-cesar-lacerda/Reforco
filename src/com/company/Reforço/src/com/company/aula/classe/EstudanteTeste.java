package com.company.aula.classe;
public class EstudanteTeste {

    public static void main(String[] args) {
        Estudante aluno = new Estudante();
        aluno.nome = "julio";
        aluno.sala = "Tads19";
        aluno.idade = 20;

        double valo1,valo2,valo3;

        System.out.println("Nome do estudante: "+aluno.nome);
        System.out.println("Sala: "+aluno.sala);
        System.out.println("Idade: "+aluno.idade);

        valo1 = 5.0;
        valo2 = 6.5;
        valo3 = 7.9;

        System.out.printf("O aluno "+aluno.nome+" da sala "+aluno.sala+" está");
        if(aluno.CalcularMediaProva(valo1,valo2,valo3) > 6.9){
            System.out.printf(" Acima da media");
        }else if(aluno.CalcularMediaProva(valo1,valo2,valo3) == 6.9 || aluno.CalcularMediaProva(valo1,valo2,valo3) > 6.0){
            System.out.printf(" Esta na media");
        }else{
            System.out.printf(" Baixo da media");
        }

        System.out.printf(" Nota: "+aluno.CalcularMediaProva(valo1,valo2,valo3));
    }
}

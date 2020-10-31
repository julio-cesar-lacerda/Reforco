package com.company.jogo.rpg.personagens;

public class Jogador extends Personagens{
    int pontosDemagias;
    int experienciaAltual;
    int experienciaProximoNivel;

    public Jogador(){ }

    public Jogador(String nome){
        //super indica uma chamada a algo da super classe
        // (Ou seja, classe a qual a classe atual herda).
        // Assim como o this indica chamadas a algo da classe atual.
        super(nome);
        System.out.println("Construi um jogador já com nome");
    }
    // marca o método como um método da superclasse
    // que foi substituído
    @Override
    public void exibirNome(){
        System.out.println("Jogador: "+this.retornarNome());
    }
}

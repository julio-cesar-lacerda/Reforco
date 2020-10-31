package com.company.jogo.rpg.personagens;

public class Enemy extends Personagens{

    int experiencia;

    public Enemy(){}

    public Enemy(Racas raca){
        switch (raca){
            case Zumbi:
                System.out.println("Raça:Zumbi");
                break;
            case Humano:
                System.out.println("Raça:Humano");
                break;
            case Elfo:
                System.out.println("Raça:Elfo");
                break;
            case Goblin:
                System.out.println("Raça:Goblin");
                break;
            default:
                System.out.println("Escolha um numero");
        }
    }
    // marca o método como um método da superclasse
    // que foi substituído
    @Override
    public void exibirNome(){
        System.out.println("Monstro "+this.retornarNome()+" apareceu!");
    }
}

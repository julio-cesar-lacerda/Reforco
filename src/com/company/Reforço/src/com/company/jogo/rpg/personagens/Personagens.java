package com.company.jogo.rpg.personagens;

public class Personagens {

    private String nome;
    private int pontosDevida;
    private int pontosDemagias;
    private int força;
    private int magia;
    private int velocidade;
    private int defesa;
    private int nivel;
    private Racas raca;

    public Personagens(){}

    public Personagens(String nome){
        this.nome = nome;
    }
     public void atacar(){
        System.out.println("Atacou");
     }

    private void defender(){
        System.out.println("Defender");
    }

    private void usarMagia(){
        System.out.println("Magia plimplim");
    }

    private void usarItem(){
        System.out.println("usando item");
    }

    public void atribuirNome(String nome){
         this.nome = nome;
    }

    public void exibirNome(){
        System.out.println("nome: "+this.nome);
    }

    protected String retornarNome(){
         return this.nome;
    }
}

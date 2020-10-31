package com.company.jogo.rpg;

import com.company.jogo.rpg.personagens.Enemy;
import com.company.jogo.rpg.personagens.Jogador;
import com.company.jogo.rpg.personagens.Racas;

public class Rpg {
    public static void main(String[] args) {
        Jogador player1 = new Jogador("julio");
        player1.exibirNome();

        Enemy monstro = new Enemy(Racas.Humano);
        monstro.atribuirNome("Demonio");
        monstro.exibirNome();
    }
}

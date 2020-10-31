package com.company.aula.grafico;
//JFrame
//Para criar frames (quadros), utilizamos a classe JFrame.
// Essa classe cria uma janela com título e bordas, podendo ter outros componentes adicionados.
// Vejamos, a seguir, os principais métodos da classe JFrame:
//Método:setDefaultCloseOperation:Descrição = Define a ação que deverá ocorrer ao fechar o componente.
//Método:setSize:Descrição = Define o tamanho do componente.
//Método:setLayout:Descrição = Define o gerenciador de layout.
//Método:setVisible:Descrição = Torna o componente visível ou não

import javax.swing.JFrame;

public class BibliotecaJframe {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Nome da janela");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(400,300);
        janela.setLayout(null);
        janela.setVisible(true);
    }
}

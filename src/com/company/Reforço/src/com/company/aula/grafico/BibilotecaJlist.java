package com.company.aula.grafico;
//JList
//Para criarmos listas de seleção, utilizamos a classe JList.
// Essa classe possibilita que o usuário escolha um ou
// vários valores armazenados em uma lista.
import javax.swing.JFrame;
import javax.swing.JList;

public class BibilotecaJlist {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Nome da janela");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(400,300);
        janela.setLayout(null);

        String[] itens = {"Item 1","Item 2"};
        JList list = new JList(itens);
        list.setBounds(20,130,360,40);
        janela.add(list);
        janela.setVisible(true);
    }
}

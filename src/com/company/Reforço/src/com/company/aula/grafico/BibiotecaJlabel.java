package com.company.aula.grafico;

import javax.swing.*;
import javax.swing.JLabel;
//JLabel
//Com a classe JLabel, podemos inserir um texto dentro de outro componente, como o JFrame.
//Vejamos, a seguir, os principais métodos da classe JLabel:
//Método:getText Descrição = Retorna o texto do componente.
//Método:setText Descrição = Altera o texto do componente.
public class BibiotecaJlabel {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Nome da janela");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(400,300);
        janela.setLayout(null);

        JLabel texto = new JLabel("Hello World",JLabel.CENTER);//instanciando o componente
        texto.setBounds(20,130,360,40);
        janela.add(texto);
        janela.setVisible(true);

    }
}
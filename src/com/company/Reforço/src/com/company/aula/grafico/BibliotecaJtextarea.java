package com.company.aula.grafico;

import javax.swing.JFrame;
import javax.swing.JTextArea;

//JTextArea
//Com a classe JTextArea, podemos criar um campo para o
// usuário digitar um texto, semelhante ao
// que é criado por meio do JTextField, mas com diversas linhas.
public class BibliotecaJtextarea {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Nome da janela");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(400,300);
        janela.setLayout(null);

        JTextArea texto = new JTextArea();
        texto.setBounds(20,130,360,120);
        janela.add(texto);
        janela.setVisible(true);
    }
}

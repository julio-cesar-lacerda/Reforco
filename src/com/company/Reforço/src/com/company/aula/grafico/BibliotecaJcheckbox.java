package com.company.aula.grafico;

import javax.swing.JFrame;
import javax.swing.JCheckBox;

//JCheckBox
//JCheckBox é a classe utilizada para criar caixas de opção
// que permitem representar uma opção selecionada
// (true) e outra não selecionada (false)
public class BibliotecaJcheckbox {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Nome da janela");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(400,300);
        janela.setLayout(null);

        JCheckBox box = new JCheckBox("SOU NEGRO");
        JCheckBox box1 = new JCheckBox("SOU BRANCO");
        box.setBounds(20,130,360,40);
        box1.setBounds(19,30,360,40);
        janela.add(box);
        janela.add(box1);
        janela.setVisible(true);
    }
}

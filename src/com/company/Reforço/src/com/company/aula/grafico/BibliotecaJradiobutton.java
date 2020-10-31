package com.company.aula.grafico;
//JRadioButton
//A classe JRadioButton nos permite criar os chamados botões de rádio.
// Ao utilizarmos botões de rádio, precisamos sempre agrupá-los
// em um objeto ButtonGroup.
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class BibliotecaJradiobutton {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Nome da janela");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(400,300);
        janela.setLayout(null);

        JRadioButton box = new JRadioButton("SOU NEGRO");
        JRadioButton box1 = new JRadioButton("SOU BRANCO");
        box.setBounds(20,130,360,40);
        box1.setBounds(19,30,360,40);
        janela.add(box);
        janela.add(box1);
        janela.setVisible(true);
    }
}

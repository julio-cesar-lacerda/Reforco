package com.company.aula.grafico;
//JComboBox
//A classe JComboBox funciona de forma semelhante à classe JList,
// porém nos permite selecionar apenas um item.
import javax.swing.JFrame;
import javax.swing.JComboBox;

public class BIbliotecaJcombox {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Nome da janela");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(400,300);
        janela.setLayout(null);

        String[] itens = {"Item 1","Item 2"};
        JComboBox list = new JComboBox(itens);
        list.setBounds(20,130,360,40);
        janela.add(list);
        janela.setVisible(true);
    }
}

package com.company.aula.grafico;
//JScrollBar
//Com a classe JScrollBar,
// podemos utilizar barras de rolagem para controlar
// um valor numérico, definindo um valor mínimo e um valor máximo
import javax.swing.JFrame;
import javax.swing.JScrollBar;
public class BiBliotecaJscrollbar {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Nome da janela");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(400,300);

        JScrollBar barra = new JScrollBar(JScrollBar.HORIZONTAL,50,1,0,100);
        barra.setBounds(230,130,360,15);
        janela.add(barra);
        janela.setVisible(true);
    }
}

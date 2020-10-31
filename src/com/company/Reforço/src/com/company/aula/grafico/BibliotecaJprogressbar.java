package com.company.aula.grafico;
//JProgressBar
//Utilizando a classe JProgressBar,
// podemos mostrar ao usuário o andamento de
// determinada ação, como o carregamento de uma imagem externa.
import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class BibliotecaJprogressbar {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Nome da janela");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(400,300);
        janela.setLayout(null);

        JProgressBar barra = new JProgressBar(JProgressBar.HORIZONTAL,1,100);
        barra.setValue(50);
        barra.setBounds(20,130,360,15);
        janela.add(barra);
        janela.setVisible(true);
    }
}

package com.company.aula.grafico;
//JButton
//A classe JButton permite a criação de botões. Os botões podem conter somente texto e/ou texto e um ícone.
//Vejamos, a seguir, os principais métodos do componente JButton:
//Método:getText Descrição = Retorna o texto do componente.
//Método:setText Descrição = Altera o texto do componente.
//Método:setEnabled Descrição = Habilita ou desabilita o componente.
//Método:setHorizontalTextPosition	Descrição = Define o alinhamento horizontal do texto no componente.
//Método:setVerticalTextPosition Descrição = Define o alinhamento vertical do texto no componente.
//Método:setToolTipText	Descrição = Define uma mensagem ao componente.
import javax.swing.JFrame;
import javax.swing.JButton;
public class BibliotecaJbutton {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Nome da janela");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(400,300);
        janela.setLayout(null);

        JButton botao = new JButton("BOTÂO VAI");//instanciando o componente
        JButton botao1 = new JButton("BOTÂO");//instanciando o componente
        botao.setBounds(20,130,360,40);
        botao1.setBounds(19,30,360,40);
        janela.add(botao);
        janela.add(botao1);
        janela.setVisible(true);
    }
}
package com.company.aula.grafico;

import javax.swing.JFrame;
import javax.swing.JPasswordField;

//JPasswordField
//A classe JPasswordField é parecida com a classe JTextField,
// porém nos permite criar um campo de texto cujos caracteres
// digitados não aparecerão na tela. É ideal para senhas.
//Vejamos, a seguir, os principais métodos do componente JPasswordField:
//Método :getPassword Descrição = Retorna o texto do componente, porém em um array onde cada caractere é um elemento.
//Método :getEchoChar Descrição = Retorna o caractere utilizado para substituir os caracteres digitados – o padrão é asterisco.
//Método :setEchoChar Descrição = Altera o caractere utilizado para substituir os caracteres digitados.
public class BibliotecaJpassowordField {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Nome da janela");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(400,300);
        janela.setLayout(null);

        JPasswordField texto = new JPasswordField();//instanciando o componente
        texto.setBounds(20,130,360,40);
        janela.add(texto);
        janela.setVisible(true);
    }
}

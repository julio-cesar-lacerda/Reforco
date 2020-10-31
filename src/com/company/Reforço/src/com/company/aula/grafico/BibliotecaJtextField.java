package com.company.aula.grafico;

import javax.swing.JTextField;
import javax.swing.JFrame;

//JTextField
//A classe JTextField nos permite criar um campo de texto onde o usuário poderá digitar valores.
// Vejamos, a seguir, os principais métodos do componente JTextField:
//Método:getText Descrição = Retorna o texto do componente.
//Método:getSelectedText Descrição = Retorna o texto selecionado no componente.
//Método:setText Descrição = Altera o texto do componente.
//Método:selectAll Descrição = Seleciona todo o texto do componente.
//Método:setEditable Descrição = Habilita ou desabilita o componente para edição.
//Método:isEditable Descrição = Valida se o componente é editável ou não.
public class BibliotecaJtextField {

    public static void main(String[] args) {
        JFrame janela = new JFrame("Nome da janela");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(400,300);
        janela.setLayout(null);

        JTextField texto = new JTextField();//instanciando o componente
        texto.setBounds(20,130,360,40);
        janela.add(texto);
        janela.setVisible(true);
    }
}

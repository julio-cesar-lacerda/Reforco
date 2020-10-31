package com.company.aula.grafico;
//JMenu
// Com a classe JMenu, podemos criar menus que aparecem na parte superior da aplicação.
// Para criar um menu, é necessário utilizar três classes: JMenu, JMenuBar e JMenuItem.
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JFrame;
import javax.swing.JMenuItem;
public class BibliotecaJmenu {
    public static void main(String[] args){
        JFrame janela = new JFrame("Nome da janela");
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setSize(400,300);
        janela.setLayout(null);

        JMenuBar menuBar = new JMenuBar();//instanciando o componente
        JMenu menu = new JMenu("Menu");//instanciando o componente
        JMenuItem menuItem = new JMenu("Olá");//instanciando o componente
        menu.add(menuItem);
        menuBar.add(menu);

        janela.setJMenuBar(menuBar);
        janela.setVisible(true);
    }
}

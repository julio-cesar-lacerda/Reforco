package com.company.rpg;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

import static javax.swing.JFrame.*;

public class Janela {
    public static void main(String[] args) {
        JFrame titulo = new JFrame("RPG");
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        frame.setSize(400,400);
        frame.setLayout(null);

        JMenuItem menu = new JMenuBar();
        JMenu vai = new JMenu("menu");
        JMenuItem menuItem = new JMenuItem("olá");

        menu.add(menuItem);
        menu.add(menu);

        JFrame.setJMenuBar(menu);

        frame.setVisible(true);
    }
}

package com.company.aula.grafico;

import javax.swing.*;

public class ImagenDeFondo extends JFrame{

    ImageIcon referencia = new ImageIcon(getClass().getResource("imagens\\Menu.jpg"));
    JLabel label = new JLabel(referencia);

    public ImagenDeFondo(){
        add(label);
        setTitle("Meu jogo");//nome da janela
        setSize(1024,728);//tamanho da janela
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//funçao para fechar a janela
        setLocationRelativeTo(null);
        this.setResizable(false);//funçao vai impedir usuario estica a tela
        setVisible(true);//fu
    }

    public static void main(String[] args) {
        new ImagenDeFondo();
    }
}

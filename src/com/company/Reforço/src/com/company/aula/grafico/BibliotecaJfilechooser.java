package com.company.aula.grafico;
//JFileChooser
//Utilizamos a classe JFileChooser para permitir
// que o usuário escolha um ou mais arquivos em sua própria máquina,
// possibilitando realizar rotinas sobre os arquivos escolhidos.
import java.io.File;
import javax.swing.JFileChooser;
public class BibliotecaJfilechooser {
    public static void main(String[] args) {
        JFileChooser fila = new JFileChooser();

        int returno;
        returno = fila.showOpenDialog(null);

        if(returno == fila.APPROVE_OPTION){
            File felaria = fila.getSelectedFile();
            System.out.println(felaria.toString());
        }else{
            System.out.println("Nenhum arquivo foi selecionado");
        }
    }
}

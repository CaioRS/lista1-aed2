import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.Console;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

import javax.swing.JOptionPane;

public class q5 {
    public static void main(String[] args) throws Exception {
        Console input = System.console();
        String nomeArq, textoSalvar;

        nomeArq = JOptionPane.showInputDialog("Nome do Arquivo : ");

        nomeArq = "src\\"+nomeArq+".txt";

        System.out.println(nomeArq);
        

        try{
            FileReader fr = new FileReader(nomeArq);
            BufferedReader br = new BufferedReader(fr);
            String linha = br.readLine();
            System.out.println(linha);
        }catch(FileNotFoundException e){
            System.out.println(nomeArq+"  nao existe");
        }



        //File f = new File (nomeArq);
        //System.out.println(f.exists() ? "existe": "nao existe");

        textoSalvar = JOptionPane.showInputDialog("Escreva algo para salvar no arquivo: ");
      

        /*try {
            BufferedWriter arq = new BufferedWriter(new FileWriter(nomeArq + ".txt"));
            arq.write( textoSalvar );
            arq.close();
        } catch (Exception e) {
           // e.printStackTrace();
        }*/
    
    
    
        
    
    
    
    
    }
}

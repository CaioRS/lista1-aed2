import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

public class q5 {
    public static void main(String[] args) throws Exception {
        String nomeArq;
        String textoSalvar;

        nomeArq = JOptionPane.showInputDialog("Nome do Arquivo : ");

        nomeArq =nomeArq+".txt";

        File f = new File (nomeArq);
   
        try{

            FileWriter fw = new FileWriter(f);
            PrintWriter arq = new PrintWriter(fw);
            textoSalvar = JOptionPane.showInputDialog("Escreva algo para salvar no arquivo: ");
            arq.write(textoSalvar);
            arq.close();

        }catch(FileNotFoundException e){
            System.out.println(nomeArq+" nao existe, será criado um novo");
            textoSalvar = JOptionPane.showInputDialog("Escreva algo para salvar no arquivo: ");
            BufferedWriter arq = new BufferedWriter(new FileWriter(nomeArq));
            arq.write( textoSalvar );
            arq.close();
        }
      

        /*try {
            BufferedWriter arq = new BufferedWriter(new FileWriter(nomeArq + ".txt"));
            arq.write( textoSalvar );
            arq.close();
        } catch (Exception e) {
           // e.printStackTrace();
        }*/
    
    
    
        
    
    
    
    
    }
}

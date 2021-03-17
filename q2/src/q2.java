import javax.swing.JOptionPane;

public class q2 {
    public static void main(String[] args) throws Exception {
        String n1;
        int num1=0,soma=0;

        while(num1!= -1){
            n1 = JOptionPane.showInputDialog("Numero : ");

            num1 = Integer.parseInt(n1);

            if(num1 == -1) break;

            soma = soma + num1; 
        }
        
        JOptionPane.showMessageDialog(null, "Soma = " + soma, "Resultado", JOptionPane.PLAIN_MESSAGE );
    }
}

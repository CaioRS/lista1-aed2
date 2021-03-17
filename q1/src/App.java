import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        String n1;
        int num1;

        n1 = JOptionPane.showInputDialog("Numero : ");

        num1 = Integer.parseInt(n1);

        while(num1 <= 0){
            n1 = JOptionPane.showInputDialog("NumeroInvalido , digite numero >= 1 : ");

            num1 = Integer.parseInt(n1);

        }
        
        for (int i=0, qtd = 0 ; qtd< num1 ; i++){
            if(i%2!=0){
                System.out.print(i+" " );
                qtd++;
            }
        }

    }
}

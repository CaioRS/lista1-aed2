import javax.swing.JOptionPane;

public class q7 {
    public static void main(String[] args) throws Exception {
        String n1, n2, op;
        int num1,num2;
        char op1;

        n1 = JOptionPane.showInputDialog("Numero 1: ");

        num1 = Integer.parseInt(n1);   

        
        op = JOptionPane.showInputDialog("Digite a operação (+,-,*,/): ");
        op1 = op.charAt(0);

        System.out.println(op1);

        n2= JOptionPane.showInputDialog("Numero 2: ");

        num2 = Integer.parseInt(n2); 

        while(op1=='/' && num2==0){
            n2= JOptionPane.showInputDialog("Não é permitido divisão por 0, selecione o numero 2 novamente: ");
            num2 = Integer.parseInt(n2);
        }


        if(op1=='+'){
            System.out.println(num1+num2);
            JOptionPane.showMessageDialog(null, "Soma = " + (num1+num2), "Resultado", JOptionPane.PLAIN_MESSAGE );
        }
        if(op1=='-'){
            JOptionPane.showMessageDialog(null, "Subtração = " + (num1-num2), "Resultado", JOptionPane.PLAIN_MESSAGE );
        } 
        if(op1=='*'){
            JOptionPane.showMessageDialog(null, "Multiplicação = " + (num1*num2), "Resultado", JOptionPane.PLAIN_MESSAGE );
        } 
        if(op1=='/'){
            JOptionPane.showMessageDialog(null, "Divisão = " + (num1/num2), "Resultado", JOptionPane.PLAIN_MESSAGE );
        } 




    }
}

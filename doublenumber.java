package Lab01;
import javax.swing.JOptionPane;
public class doublenumber {
    public static void main(String[] args) {
     double num1;
     double num2;
     num1 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please input the 1st number:",
     "Input the 1st number",JOptionPane.INFORMATION_MESSAGE));
     num2 = Double.parseDouble(JOptionPane.showInputDialog(null, "Please input the 2nd number:",
     "Input the 2nd number",JOptionPane.INFORMATION_MESSAGE));
     double sum,dif,product,quotient;
     sum = num1+num2;
     dif = num1-num2;
     product = num1*num2;
     quotient = num1/num2;
     System.out.print("The sum of 2 numbers is "+ sum);
     System.out.print("\nThe different of 1st number and 2nd number is "+ dif);
     System.out.print("\nThe product of 2 numbers is "+ product);
     System.out.print("\nThe quotient between 1st and 2nd number is "+ quotient);
     System.exit(0);
    }
}

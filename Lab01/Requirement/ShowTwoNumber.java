package Lab01;
import javax.swing.JOptionPane;
public class ShowTwoNumber {
    public static void main(String[] args) {
        String strNum1;
        String strNum2;
        String stringNotification = "You\'ve just entered:";
        strNum1 = JOptionPane.showInputDialog(null, "Please input the 1st number:","Input the 1st number",JOptionPane.INFORMATION_MESSAGE);
        stringNotification = stringNotification + strNum1 + " and ";
        strNum2 = JOptionPane.showInputDialog(null, "Please input the 2nd number:","Input the 2nd number",JOptionPane.INFORMATION_MESSAGE);
        stringNotification = stringNotification + strNum2;
        JOptionPane.showMessageDialog(null, stringNotification, "Show two number", JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}

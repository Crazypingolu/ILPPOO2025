package Due0227;
import javax.swing.JOptionPane;
public class Exe01 {
    public static void main(String[] args) {
        double n1 = Double.parseDouble(JOptionPane.showInputDialog("Type the first number: ")), 
        n2 = Double.parseDouble(JOptionPane.showInputDialog("Type the second number: ")),
        r = (n1 + n2);
        JOptionPane.showMessageDialog(null, "The sum of: " + n1 + " and " + n2 + " is " + r );
    }
}

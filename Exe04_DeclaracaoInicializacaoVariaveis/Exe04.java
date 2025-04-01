package Due0227;
import javax.swing.JOptionPane;
public class Exe04 {
    public static void main(String[] args) {
        String companyName = JOptionPane.showInputDialog("Type in the company's name (25 chars max): ");
        while(true){
            if(companyName.length() <= 25)
                break;
            JOptionPane.showMessageDialog(null, "Invalid text, please, try again.");
            companyName = JOptionPane.showInputDialog("Type in the company's name (25 chars max): ");
        }
        
        @SuppressWarnings("unused")
        int totalSal = 9999;
        @SuppressWarnings("unused")
        String data = "(00 - 00 - 0000): ";
        
        float[] grades = new float[4];
        for (int i = 0 ; i < 4 ; i++) {
            grades[i] = 1 + i;
        }

        String[] car = new String[6];
        for (int i = 0 ; i < 6 ; i++) {
            car[i] = "test";
        }
        @SuppressWarnings("unused")
        double goldenRatio = 1.61803;

        String[] name = new String[6];
        for (int i = 0 ; i < 6 ; i++) {
            name[i] = "name";
        } 
        @SuppressWarnings("unused")
        int shoePairQuant = 5;
    }
}

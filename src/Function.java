import javax.swing.*;

public class Function {

    public boolean check(String input) {
        try {
            double x = Double.parseDouble(input);
            if (x >= 0 || x < 0);
                return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public void dollarToRuble(String input){
        double ruble = Double.parseDouble(input) * 60.38;
        JOptionPane.showMessageDialog(null, "Amount of Ruble: " + ruble + " rb");
    }

    public void dollarToJPY(String input){
        double JPY = Double.parseDouble(input) * 134.96;
        JOptionPane.showMessageDialog(null, "Amount of JPY: " + JPY + " yen");
    }

}

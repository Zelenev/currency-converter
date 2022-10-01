import javax.swing.*;

public class Runner {
    public static void main(String[] args) {
        Function function = new Function();
        Object[] options1 = {"Ruble","Yen","Quit"};
        Object[] options2 = {"Try again","Quit"};

        while (true){
            String input = JOptionPane.showInputDialog(null, "Enter value: ");
            System.out.println(input);

            if(function.check(input) == true){

            int choice1 = JOptionPane.showOptionDialog(null,"Choose currency which you wish to convert",
                    "Currency Converter", JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null,
                    options1,options1[2]);

            if(choice1 == 0){
                function.dollarToRuble(input);
                int choice2 = JOptionPane.showOptionDialog(null, "What do you wish to do?", "Currency Converter",
                        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options2,options2[1]);

                if(choice2 == 0){

                }else {break;}
            } else if (choice1 == 1){
                function.dollarToJPY(input);
                int choice2 = JOptionPane.showOptionDialog(null, "What do you wish to do?", "Currency Converter",
                        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options2,options2[1]);

                if(choice2 == 0){

                }else {break;}
            } else break;

            } else{
                JOptionPane.showMessageDialog(null, "Invalid output");

                int choice2 = JOptionPane.showOptionDialog(null, "What do you wish to do?", "Currency Converter",
                        JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options2,options2[1]);

                if(choice2 == 0){

                }else {break;}
            }
        }
    }
}

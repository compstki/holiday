
import javax.swing.JOptionPane;
import java.io.*;

public class SimpleUI
{

    public SimpleUI()
    {

    }

    public String readLine(String prompt){
        return JOptionPane.showInputDialog(prompt);
    }

    public String enterText(String prompt)
    {
        while(true){
            String input = readLine(prompt);
            try {
                return input;
            } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Error, re-enter data");
            }
        }
    }

    public int enterInt(String prompt)
    {
        while(true){
            String input = readLine(prompt);
            try {
                int number = Integer.parseInt(input);
                return number;
            } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Error, re-enter data");
            }
        }
    }

    public float enterFloat(String prompt)
    {
        while(true){
            String input = readLine(prompt);
            try {
                float floatData = Float.parseFloat(input);
                return floatData;
            } catch (NumberFormatException e){
                JOptionPane.showMessageDialog(null,"Error, re-enter data");

            }
        }
    }

}

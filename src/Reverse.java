import javax.swing.*;
import java.util.Locale;

public class Reverse {

    public static String ROutput = "";

    public static void main(String[] args) {


        String Input = JOptionPane.showInputDialog("Reverse a word!");
        String RInput = reverse(Input);
        System.out.println(RInput);
        if (Input.equals(RInput)){
            System.out.println("PALINDROME!!");
        }


    }
    public static String reverse(String Input){
        for (int i = Input.length()-1; i >= 0; i--) {
            char CInput = Input.charAt(i);
            ROutput += CInput;
        }
        return (ROutput);
    }
}


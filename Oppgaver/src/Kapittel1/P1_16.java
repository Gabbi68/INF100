package Kapittel1;
import javax.swing.*;
/**
 * Created by RakNoel on 26.08.2016.
 */
public class P1_16 {
    public static void main(String[] args) {
        String name = JOptionPane.showInputDialog("Enter your name: ");
        String jobb = JOptionPane.showInputDialog("Hello, " + name + ". What can I do for you");
        JOptionPane.showMessageDialog(null, "I'm sorry " + name + ", but you need to wake up! IM A FUCKING COMPUTER, " +
                "not a wizard. You fool, how am i supposed to: '" + jobb + "'?");
    }
}

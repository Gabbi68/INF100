package Kapittel1;
import javax.swing.*;
import java.net.URL;

/**
 * Created by RakNoel on 26.08.2016.
 */
public class P1_17 {
    public static void main(String[] args) throws Exception {
        URL imageLocation = new URL("https://dl.dropboxusercontent.com/u/6343558/306973_10200269718529025_279265487_n.jpg");
        JOptionPane.showMessageDialog
                (null, "Hello, World!", "Title", JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
    }
}

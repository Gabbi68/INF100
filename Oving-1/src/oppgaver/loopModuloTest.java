package oppgaver;

import javax.swing.*;
import java.io.IOException;

/**
 * Created by Grønevikveien 4 on 27.08.2016.
 */
public class loopModuloTest {
    public static void main(String[] args) {
        double input1 = Double.parseDouble(JOptionPane.showInputDialog("How long would you like it to be?"));

        for (int i = 0; i < input1; i++) {
                if(i%2 == 0){
                    System.out.println("|  |");
                }else{
                    System.out.println("++++");
                }
        }
    }
}

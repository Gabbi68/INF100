package Frames;

import javax.swing.*;
import java.awt.event.*;

/**
 * Created by Dj_Usher on 26.08.2016.
 */
public class panel {


    public class ClickListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            System.out.println("I was clicked!");
        }
    }

    private void Dostuff() {
        JFrame frame1 = new JFrame();
        JButton button = new JButton("Click me");
        JLabel label = new JLabel("Hello, World!");


        final int FRAME_WIDTH = 300;
        final int FRAME_HEIGHT = 100;

        frame1.setSize(FRAME_WIDTH, FRAME_HEIGHT);
        frame1.setTitle("Empty frame");
        frame1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        JPanel panel = new JPanel();
        panel.add(button);
        panel.add(label);

        frame1.add(panel);
        frame1.setVisible(true);

        ActionListener listener = new ClickListener();
        button.addActionListener(listener);
    }



}

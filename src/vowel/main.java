package vowel;

import javax.swing.*;

public class main {
    public static void main(String[] args) {

        JFrame frame = new JFrame("gui");
        frame.setContentPane(new Gui().panel1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}

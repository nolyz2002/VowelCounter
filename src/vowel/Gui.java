package vowel;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Gui {
    public JPanel panel1;
    private JTextField vowelCounterTextField;
    public JTextField textField1;
    private JButton countButton;

    LetterMstcher match = new LetterMstcher();
    public Gui() {
        vowelCounterTextField.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        countButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int count = match.compareString(vowelCounterTextField.getText());
                textField1.setText(String.valueOf(count));
            }
        });
    }
}

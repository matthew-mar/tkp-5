package lab1;

import javax.swing.*;
import java.awt.event.*;
import java.util.Formatter;


public class BirthYearGUI {
    private static int CURRENT_YEAR = 2022;
    private String name;
    private int age;

    BirthYearGUI() {
        JFrame frame = new JFrame("lab1.BirthYear application");

        frame.setSize(500, 150);

        frame.setLayout(new BoxLayout(frame.getContentPane(), BoxLayout.Y_AXIS));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JLabel nameLabel = new JLabel("enter your name");
        frame.add(nameLabel);

        JTextField nameTextField = new JTextField(15);
        frame.add(nameTextField);

        JLabel ageLabel = new JLabel("enter your age");
        frame.add(ageLabel);

        JTextField ageTextField = new JTextField(15);
        frame.add(ageTextField);

        JLabel resLabel = new JLabel();
        frame.add(resLabel);

        JButton calc = new JButton("get year");
        frame.add(calc);
        calc.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent ae) {
                name = nameTextField.getText();
                nameTextField.setText("");

                age = Integer.parseInt(ageTextField.getText());
                ageTextField.setText("");

                Formatter formatter = new Formatter();
                resLabel.setText(formatter.format("Hello, %s, you was born in %d", name, CURRENT_YEAR - age).toString());
            }
        });
        
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
          public void run() {
            new BirthYearGUI();
          }
        });
    }
}


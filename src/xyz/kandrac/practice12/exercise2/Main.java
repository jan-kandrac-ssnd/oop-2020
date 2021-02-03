package xyz.kandrac.practice12.exercise2;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {

    public static void main(String[] args) {
        JFrame f = new JFrame();

        // vytvorenie komponentov
        JButton b = new JButton("click");
        JTextField text = new JTextField("");
        JTextPane textPane = new JTextPane();

        // nastavenie pozicie a velkosti komponentov
        b.setBounds(130, 100, 100, 40);
        text.setBounds(130, 200, 100, 40);
        textPane.setBounds(130, 300, 100, 200);

        // pridanie komponentov do okna
        f.add(b);
        f.add(text);
        f.add(textPane);

        // nastavenie vlastnosti okna
        f.setSize(400, 500);//400 width and 500 height
        f.setLayout(null);//using no layout managers
        f.setVisible(true);//making the frame visible
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // nastavenie akcii
        b.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textPane.setText(textPane.getText() + "\n" + text.getText());
            }
        });
    }
}

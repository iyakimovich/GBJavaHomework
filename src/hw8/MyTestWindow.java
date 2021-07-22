package hw8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MyTestWindow extends JFrame {
    public MyTestWindow() throws HeadlessException {
        setVisible(true);
        setLocation(500, 500);
        setSize(300,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        JPanel panel = new JPanel(new GridLayout(1, 2));

        JButton buttonClose = new JButton("Close");
        JButton buttonOther = new JButton("Other");

        ActionListener actionListener = new MyTestActionListener();
        buttonClose.addActionListener(actionListener);

        panel.add(buttonOther);
        panel.add(buttonClose);

        add(panel, BorderLayout.SOUTH);
    }
}

package edu.javacourse.thread;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.Locale;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
import javax.swing.JButton;
import javax.swing.JFrame;

public class PDU extends JFrame implements ActionListener {

    public static String LEFT = "LEFT";
    public static String RIGHT = "RIGHT";
    public static String UP = "UP";
    public static String DOWN = "DOWN";

    private static final int STEP = 3;
    static String direction;
    
    public static String LOCALE;
    public static String language = "Английский";

    public PDU() throws IOException {

        PropertyResourceBundle prb1 = (PropertyResourceBundle) PropertyResourceBundle
                .getBundle("Locale");

        if (language == "Русский") {
            LOCALE = prb1.getString("RU");
        } else {
            if (language == "Английский") {
                LOCALE = prb1.getString("EN");
            }
            else LOCALE = "RU";
        } 

        PropertyResourceBundle prb2 = (PropertyResourceBundle) PropertyResourceBundle
                .getBundle("TitleNames", new Locale(LOCALE));
        System.out.println("TITLE:" + prb2.getString("right"));
        String rightText = prb2.getString("right");
        String leftText = prb2.getString("left");
        String upText = prb2.getString("up");
        String downText = prb2.getString("down");

        JButton left = new JButton(leftText);
        left.setActionCommand(LEFT);
        left.addActionListener(this);
        add(left, BorderLayout.WEST);

        JButton right = new JButton(rightText);
        right.setActionCommand(RIGHT);
        right.addActionListener(this);
        add(right, BorderLayout.EAST);

        JButton up = new JButton(upText);
        up.setActionCommand(UP);
        up.addActionListener(this);
        add(up, BorderLayout.NORTH);

        JButton down = new JButton(downText);
        down.setActionCommand(DOWN);
        down.addActionListener(this);
        add(down, BorderLayout.SOUTH);

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400, 300, 250, 200);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        e.getActionCommand();
        direction = e.getActionCommand();
    }
}

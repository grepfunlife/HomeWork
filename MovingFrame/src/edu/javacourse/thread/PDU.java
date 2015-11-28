package edu.javacourse.thread;

import java.awt.BorderLayout;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

public class PDU extends JFrame implements ActionListener {

    public static final String LEFT = "LEFT";
    public static final String RIGHT = "RIGHT";
    public static final String UP = "UP";
    public static final String DOWN = "DOWN";
    public String direction;
    private static final int STEP = 3;

    public PDU() {
        JButton left = new JButton(LEFT);
        left.setActionCommand(LEFT);
        left.addActionListener(this);
        add(left, BorderLayout.WEST);

        JButton right = new JButton(RIGHT);
        right.setActionCommand(RIGHT);
        right.addActionListener(this);
        add(right, BorderLayout.EAST);

        JButton up = new JButton(UP);
        up.setActionCommand(UP);
        up.addActionListener(this);
        add(up, BorderLayout.NORTH);

        JButton down = new JButton(DOWN);
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

//    public void moveFrame() {
//
//        Rectangle r = getBounds();
//
//        if (direction == RIGHT) {
//            r.x += STEP;
//        } else if (direction == LEFT) {
//            r.x -= STEP;
//        } else if (direction == UP) {
//            r.y += STEP;
//        } else {
//            r.y -= STEP;
//        }
//        setBounds(r);
//    }

}

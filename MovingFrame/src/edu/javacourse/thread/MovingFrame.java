package edu.javacourse.thread;

import static edu.javacourse.thread.PDU.LEFT;
import static edu.javacourse.thread.PDU.RIGHT;
import static edu.javacourse.thread.PDU.UP;
import java.awt.Rectangle;
import javax.swing.JFrame;

public class MovingFrame extends JFrame {

    String direction = null;
    int STEP = 3;

    public MovingFrame() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(400, 300, 250, 200);
        setVisible(true);
    }

    public void moveFrame() {

        Rectangle r = getBounds();

        if (direction == RIGHT) {
            r.x += STEP;
        } else if (direction == LEFT) {
            r.x -= STEP;
        } else if (direction == UP) {
            r.y += STEP;
        } else {
            r.y -= STEP;
        }
        setBounds(r);
    }

}

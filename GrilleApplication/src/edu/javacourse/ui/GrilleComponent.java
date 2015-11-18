package edu.javacourse.ui;

import java.awt.Graphics;
import javax.swing.JComponent;

public class GrilleComponent extends JComponent {

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(5, 5, getWidth() - 10, getHeight() - 10);       
        int N = 3;
        for (int i = 1; i < N + 1; i++) {
          g.drawLine(i*(getWidth() / (N + 1)), 5, i*(getWidth() / (N + 1)), getHeight() - 5);
          g.drawLine(5, i*(getHeight() / (N + 1)), getWidth() - 5, i*(getHeight() / (N + 1)));
        }
        
    }

}

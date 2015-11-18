package edu.javacourse.ui;

import java.awt.Graphics;
import javax.swing.JComponent;

public class SquareComponent extends JComponent
{
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawRect(5, 5, getWidth() - 10, getHeight() - 10);
    }
    
}

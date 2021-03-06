package edu.javacourse.ui;

import java.awt.Graphics;
import javax.swing.JComponent;

// Наследуемся от стандартного класса, который
// используется для создания компонентов на форме
public class DiamondComponent extends JComponent
{

    // Переопределяем метод рисованиая, в который передается
    // объект класса Graphics
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        int[] arrayX = {5,  getWidth() / 2, getWidth() - 5, getWidth() / 2};
        int[] arrayY = {getHeight()/2, 5, getHeight()/2, getHeight() - 5};
        g.drawPolygon(arrayX, arrayY, 4);
    }
    
}

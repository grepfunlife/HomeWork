package edu.javacourse.ui;

import javax.swing.JFrame;

public class SquareFrame extends JFrame
{
    public SquareFrame() {
        // Создаем объект типа OvalComponent
        SquareComponent oc = new SquareComponent();
        // Испольщзуем метод класса JFrame для добавления
        // компонента на главную панель.
        add(oc);
        
        // Устанавливаем координаты и размеры окна
        setBounds(200, 200, 300, 250);
    }
    
}

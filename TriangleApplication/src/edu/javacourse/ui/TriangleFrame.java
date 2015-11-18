package edu.javacourse.ui;

import javax.swing.JFrame;

public class TriangleFrame extends JFrame
{
    public TriangleFrame() {
        // Создаем объект типа OvalComponent
        TriangleComponent oc = new TriangleComponent();
        // Испольщзуем метод класса JFrame для добавления
        // компонента на главную панель.
        add(oc);
        
        // Устанавливаем координаты и размеры окна
        setBounds(200, 200, 300, 250);
    }
    
}

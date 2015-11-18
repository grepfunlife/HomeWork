package edu.javacourse.ui;

import javax.swing.JFrame;

public class GrilleFrame extends JFrame
{
    public GrilleFrame() {
        // Создаем объект типа OvalComponent
        GrilleComponent oc = new GrilleComponent();
        // Испольщзуем метод класса JFrame для добавления
        // компонента на главную панель.
        add(oc);
        
        // Устанавливаем координаты и размеры окна
        setBounds(200, 200, 300, 250);
    }
    
}

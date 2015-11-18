package edu.javacourse.ui;

import javax.swing.JFrame;

public class DiamondFrame extends JFrame
{
    public DiamondFrame() {
        // Создаем объект типа OvalComponent
        DiamondComponent oc = new DiamondComponent();
        // Испольщзуем метод класса JFrame для добавления
        // компонента на главную панель.
        add(oc);
        
        // Устанавливаем координаты и размеры окна
        setBounds(200, 200, 300, 250);
    }
    
}

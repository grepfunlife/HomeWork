package edu.javacourse.ui;

import javax.swing.JFrame;

public class DiamondApplication
{
    public static void main(String[] args) {
        // Создаем графическое окно
        DiamondFrame of = new DiamondFrame();
        // Задаем правидо, по которому приложение завершиться при 
        // закрытии этой формы
        of.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Делаем окно видимым
        of.setVisible(true);
    }
}

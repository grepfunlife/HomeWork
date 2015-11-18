package edu.javacourse.ui;

import javax.swing.JFrame;

public class SquareApplication
{
    public static void main(String[] args) {
        // Создаем графическое окно
        SquareFrame of = new SquareFrame();
        // Задаем правидо, по которому приложение завершиться при 
        // закрытии этой формы
        of.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Делаем окно видимым
        of.setVisible(true);
    }
}

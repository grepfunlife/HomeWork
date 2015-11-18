package edu.javacourse.ui;

import javax.swing.JFrame;

public class TriangleApplication
{
    public static void main(String[] args) {
        // Создаем графическое окно
        TriangleFrame of = new TriangleFrame();
        // Задаем правидо, по которому приложение завершиться при 
        // закрытии этой формы
        of.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Делаем окно видимым
        of.setVisible(true);
    }
}

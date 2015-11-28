package mypolygon;

import javax.swing.JFrame;

public class PolygonFrame extends JFrame
{
    public PolygonFrame() {
        DrawPolygon dp = new DrawPolygon();
        add(dp);
        
        setBounds(200, 50, 600, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
}

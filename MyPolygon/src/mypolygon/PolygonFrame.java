package mypolygon;

import javax.swing.JFrame;

class PolygonFrame extends JFrame
{
    public PolygonFrame() {
        DrawPolygon dp = new DrawPolygon();
        add(dp);
        setBounds(200, 200, 300, 250);
    }
    
}

package mypolygon;

import java.awt.Graphics;
import java.io.BufferedReader;
import java.io.FileReader;
import javax.swing.JComponent;

public class DrawPolygon extends JComponent
{
public static final String FILE_NAME = "coordinates.txt";
public static int limit;
//public static int[] arrayX = new int[5];
//public static int[] arrayY = new int[5];

    static {
        
        try {
            
            BufferedReader br = new BufferedReader(new FileReader(FILE_NAME));
            String str = null;
            int i = 0;
            while ((str = br.readLine()) != null) {
                
                if (!str.trim().isEmpty()) {
                    String[] array = str.split(",\\s*");
                    if (array.length == 1) {
                 
                    limit = Integer.parseInt(array[0]);
                    System.out.println(limit);
                    }
                    else {
                    int[] arrayX = new int[limit+1];
                    int[] arrayY = new int[limit+1];
                        arrayX[i] = Integer.parseInt(array[0]);
                        System.out.println(arrayX[i]);
                        arrayY[i] = Integer.parseInt(array[1]);
                        //System.out.println(arrayY[i]);
                        
                    }
                    i++;
                    
                    
                }
                    
                
            }
            br.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
    public static int[] getArrayX(){
    return arrayX;
    
    }
    
    public static int[] getArrayY(){
    return arrayY;
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawPolygon(getArrayX(), getArrayY(), limit);
    }
}
 
    




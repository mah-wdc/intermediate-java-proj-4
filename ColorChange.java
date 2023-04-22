/*import java.awt.*;
import javax.swing.*;

public class ColorChange extends JPanel {
	
    public void paintComponent(Graphics g) {
    
    	Graphics2D graphic = (Graphics2D) g;

        g.fillRect(0,0,this.getWidth(), this.getHeight());

        int blue = (int) (Math.random() * 256);
        int red = (int) (Math.random() * 256);
        int green = (int) (Math.random() * 256);
        Color color1 = new Color(blue, red, green);
    
        blue = (int) (Math.random() * 256);
        red = (int) (Math.random() * 256);
        green = (int) (Math.random() * 256);
        Color color2 = new Color(blue, red, green);
        
        GradientPaint gradient = new GradientPaint(80,80,color1, 140,140, color2);
        graphic.setPaint(gradient);
        graphic.fillOval(80,80,100,100);
        
    }
    
}
*/
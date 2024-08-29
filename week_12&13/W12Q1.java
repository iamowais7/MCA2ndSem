package weeks;
import java.applet.Applet;
import java.awt.*;

public class W12Q1 extends Applet {
    public void paint(Graphics g) {
       g.setColor(Color.black);

    
       g.drawLine(600, 80, 500, 300);
       g.drawLine(600, 80, 700, 300);
       g.drawOval(500, 280, 200, 50);
    }
}


package weeks;
 import java.applet.Applet;
 import java.awt.*;
public class W12Q2 extends Applet {
public void paint(Graphics g) {
   g.setColor(Color.blue);
   g.fillRect(10, 10, 300, 150);
   g.setColor(Color.yellow);
   g.fillOval(10,10,150,150);
   g.setColor(Color.yellow);
   g.fillOval(150,10,150,150);
   g.setColor(Color.red);
   g.drawString("RAMADAN MUBARAK", 110, 90);
}
}

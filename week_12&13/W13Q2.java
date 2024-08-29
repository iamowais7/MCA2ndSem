
package weeks;
import java.applet.Applet;
import java.awt.*;

public class W13Q2 extends Applet {
   int[] x= {0, 100, 200};
      int[]y={50, 10, 50};
   public void paint(Graphics g) {
      g.drawPolygon(x,y,3);
      g.drawRect(0, 50, 200, 150);

      g.drawRect(30, 100, 40, 100);

      g.drawRect(90, 100, 80, 35);

   }

}

package weeks;

import java.applet.Applet;
import java.awt.*;

public class W13Q3 extends Applet {

   public void paint(Graphics g) {
      for (int i = 1; i <= 3; i++) {
         for (int j = 1; j <= 3; j++) {
            if (i == j) {
               g.fillOval(i * 30, j * 30, 20, 20);

            } else {
               g.drawOval(i *30, j*30, 20, 20);
            }
         }
      }
   }
}

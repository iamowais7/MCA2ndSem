package weeks;
import java.applet.Applet;
import java.awt.*;

public class W13Q4 extends Applet {

   public void paint(Graphics g) {
      for(int i=5; i>=1; i--) {
         int coord = (5-i)*20+20;
         int hw = i*40;

         if(i%2!=0) {
            g.setColor(Color.black);
            g.fillOval(coord, coord, hw, hw);
         } else {
            g.setColor(Color.white);
            g.fillOval(coord, coord, hw, hw);
         }
      }
   }
}
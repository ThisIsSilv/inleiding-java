package h04;

import java.applet.Applet;
import java.awt.*;

public class opdracht4_3 extends Applet {
    //kekke wallpaperz
    public void init() {
        setBackground(Color.pink);
    }
      public void paint(Graphics g) {
        g.drawLine(20, 20, 20, 170);
        g.setColor(Color.red);
        g.fillRect(21,40, 100, 10 );
        g.setColor(Color.white);
        g.fillRect(21,50, 100, 10 );
        g.setColor(Color.cyan);
        g.fillRect(21,60, 100, 10 );

     }
}

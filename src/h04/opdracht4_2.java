package h04;

import java.applet.Applet;
import java.awt.*;

public class opdracht4_2 extends Applet {
    //kekke wallpaperz
    public void init() {
        setBackground(Color.pink);
    }

    // driehoke
    public void paint(Graphics g) {
        g.setColor(Color.yellow);
        g.drawLine(200, 100, 300, 100);
        g.drawLine(200, 100, 250, 50);
        g.drawLine(300, 100, 250, 50);
        g.drawRect(200, 100, 100, 100);
        g.drawRect(220, 150, 20, 50);
        g.drawRect(270, 110, 20, 20);
    }
}
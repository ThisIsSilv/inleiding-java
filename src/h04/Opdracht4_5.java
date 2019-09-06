package h04;

import com.sun.deploy.util.BlackList;

import java.applet.Applet;
import java.awt.*;

public class Opdracht4_5 extends Applet {
    //kekke wallpaperz
    public void init() {
        setBackground(Color.blue);
    }
    public void paint(Graphics g) {
        g.drawString("IKEA", 100, 50);
    //Ikea ding
        g.setColor(Color.YELLOW);
        g.fillOval(20, 20, 320, 140);
        g.setColor(Color.blue);
        //IKEA TECXT LMAO
        g.drawString("IKEA", 150, 100);
    }

}

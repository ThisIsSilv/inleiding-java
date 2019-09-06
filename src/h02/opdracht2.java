package h02;

import java.applet.Applet;
import java.awt.*;

public class opdracht2 extends Applet {


    //kekke wallpaperz
    public void init() {
        setBackground(Color.white);
    }

    // lmao text enzo
    public void paint(Graphics g) {
        g.setColor(Color.blue);
        g.drawString("Silvano", 50, 60);
        g.setColor(Color.red);
        g.drawString("Bakacak", 50, 70);
    }
}
package h04;

import java.applet.Applet;
import java.awt.*;

public class opdracht4_7 extends Applet {
    //kekke wallpaperz
    public void init() {
        setBackground(Color.pink);
    }

    public void paint(Graphics g){
        //outline
        g.setColor(Color.yellow);
        g.fillRoundRect(100, 100, 100, 100, 10, 10);
        //dots
        g.setColor(Color.darkGray);
        g.fillOval(110, 110, 30, 30);
        g.fillOval(160, 110, 30, 30);
        g.fillOval(110, 160, 30, 30);
        g.fillOval(160, 160, 30, 30);
    }
}

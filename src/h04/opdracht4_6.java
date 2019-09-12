package h04;

import java.applet.Applet;
import java.awt.*;

public class opdracht4_6 extends Applet {
    //kekke wallpaperz
    public void init() {
        setBackground(Color.pink);
    }

    public void paint(Graphics g){
        //paal van licht
        g.fillRect(100, 100, 15, 100);
        //outline lampen
        g.setColor(Color.DARK_GRAY);
        g.fillRect(90, 50, 40, 70);

        //lampen
        g.setColor(Color.red);
        g.fillOval(100, 55, 20, 20 );
        g.setColor(Color.ORANGE);
        g.fillOval(100, 75, 20, 20 );
        g.setColor(Color.green);
        g.fillOval(100, 95, 20, 20 );

    }
}

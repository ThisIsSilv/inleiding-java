package h01;


import java.awt.*;
import java.applet.*;


public class Show extends Applet {


    public void init() {
        setBackground(Color.WHITE);
    }

    public void paint(Graphics g) {
        g.drawLine(50, 50, 50, 50);
        g.setColor(Color.CYAN);
        g.drawString("Silvano", 50, 60 );
        g.setColor(Color.RED);
        g.drawString("Bakacak", 50, 70 );
    }

}
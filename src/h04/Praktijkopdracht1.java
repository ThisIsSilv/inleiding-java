package h04;

import java.applet.Applet;
import java.awt.*;

public class Praktijkopdracht1 extends Applet {
    //kekke wallpaperz
    public void init() {
        setBackground(Color.pink);
    }

    public void paint(Graphics g){
        //LINE
        g.drawLine(10,20, 60, 20);
        g.drawString("Lijn",20, 35);
        //RECTANGLE
        g.drawRect(10, 40, 50, 30);
        //FILLEDRECTANGLE OVAL
        g.setColor(Color.MAGENTA);
        g.fillRect(70, 40, 50, 30);
        g.setColor(Color.black);
        g.drawOval(70,40, 50, 30);
        //PIE
        g.setColor(Color.magenta);
        g.fillArc(131, 40, 50, 30, 0, 45);
        g.setColor(Color.black);
        g.drawOval(131, 40, 50, 30);
        //
    }
}

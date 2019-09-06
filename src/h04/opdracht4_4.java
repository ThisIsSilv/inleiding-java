package h04;

import java.applet.Applet;
import java.awt.*;

public class opdracht4_4 extends Applet {
    //kekke wallpaperz
    public void init() {
        setBackground(Color.pink);
    }
    public void paint(Graphics g) {
        g.setColor(Color.DARK_GRAY);
        g.drawString("Gewicht van koters (kg)", 10, 20);
        g.drawString("Valerie", 60, 210);
        g.drawString("Jeroen", 100, 210);
        g.drawString("Hans", 145, 210);
        //Nummers
        g.setColor(Color.DARK_GRAY);
        g.drawString("0", 40, 205 );
        g.drawString("20", 35, 185 );
        g.drawString("40", 35, 165 );
        g.drawString("60", 35, 145 );
        g.drawString("80", 35, 125 );
        g.drawString("100", 29, 105 );
        g.drawString("120", 29, 85 );

        //Lijntjes achtergrondddddd
        g.setColor(Color.DARK_GRAY);
        g.drawLine(50, 200, 200, 200);
        g.drawLine(50, 180, 200, 180);
        g.drawLine(50, 160, 200, 160);
        g.drawLine(50, 140, 200, 140);
        g.drawLine(50, 120, 200, 120);
        g.drawLine(50, 100, 200, 100);
        g.drawLine(50, 80, 200, 80);

        //balkjes enzo lmao
        g.setColor(Color.yellow);
        g.fillRect(70,160, 20,  40 );
        g.setColor(Color.green);
        g.fillRect(110,100, 20, 100 );
        g.setColor(Color.CYAN);
        g.fillRect(150,140, 20, 60);

    }
}

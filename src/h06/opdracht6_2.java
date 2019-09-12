package h06;

import java.applet.Applet;
import java.awt.*;

public class opdracht6_2 extends Applet {
   Color kleur1;
   Color kleur2;

   int sec;
   int hour;
   int day;
   int year;



    public void init() {
        kleur1 = Color.PINK;
        kleur2 = Color.yellow;

        sec = 1;
        hour = sec * 3600;
        day = hour * 24;
        year = day * 256;

        //Background
        setBackground(kleur1);
    }
    public void paint(Graphics g) {
        g.setColor(kleur2);
        g.drawString(String.valueOf(sec), 20, 20);
        g.drawString(String.valueOf(hour), 20, 30);
        g.drawString(String.valueOf(day), 20, 40);
        g.drawString(String.valueOf(year), 20, 50);
    }
}

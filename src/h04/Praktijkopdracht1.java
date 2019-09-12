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
        g.drawString("Rechthoek", 7, 82);

        //FILLEDRECTANGLE OVAL
        g.setColor(Color.MAGENTA);
        g.fillRect(70, 40, 50, 30);
        g.setColor(Color.black);
        g.drawOval(70,40, 50, 30);

        //Ik had niet genoeg ruimte en had niet echt zin om nogmaals te maken dus ja :)

        g.drawString("RechtVaal", 67, 82);

        //PIE
        g.setColor(Color.magenta);
        g.fillArc(131, 40, 50, 30, 0, 45);
        g.setColor(Color.black);
        g.drawOval(131, 40, 50, 30);

        //Again ruimte issues maar dat is logisch denk ik dus ja

        g.drawString("TaartDing", 131, 82);

        //Afegronde rechthoek
        g.drawRoundRect(10,90, 50, 30,15, 15);

        // ruimte :)

        g.drawString("AfrondHoek", 1, 132);

        //Gevulde ovaal
        g.setColor(Color.magenta);
        g.fillOval(70, 90, 50, 30);
        g.setColor(Color.black);
        g.drawString("OvaalFill", 70, 132);

        //Cirkel
        g.drawOval(131, 90, 30, 30);
        g.drawString("Cirkel", 131,130);

    }
}

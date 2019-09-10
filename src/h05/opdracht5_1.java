package h05;

import java.applet.Applet;
import java.awt.*;



public class opdracht5_1 extends Applet {

    private Color opvulkleur;
    private Color lijnkleur;
    private int breedte;
    private int hoogte;

    public void init() {
        setBackground(Color.pink);
        //initialisatie.
        opvulkleur = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 50;
        hoogte = 30;
    }
    //kekke wallpaperz



    public void paint(Graphics g){

        //LINE
        g.drawLine(10,20, 60, 20);
        g.drawString("Lijn",20, 35);

        //RECTANGLE
        g.drawRect(10, 40, breedte, hoogte);
        g.drawString("Rechthoek", 7, 82);

        //FILLEDRECTANGLE OVAL
        g.setColor(opvulkleur);
        g.fillRect(70, 40, breedte, hoogte);
        g.setColor(lijnkleur);
        g.drawOval(70,40, breedte, hoogte);

        //Ik had niet genoeg ruimte en had niet echt zin om nogmaals te maken dus ja :)

        g.drawString("RechtVaal", 67, 82);

        //PIE
        g.setColor(opvulkleur);
        g.fillArc(131, 40, breedte, hoogte, 0, 45);
        g.setColor(lijnkleur);
        g.drawOval(131, 40, breedte, hoogte);

        //Again ruimte issues maar dat is logisch denk ik dus ja

        g.drawString("TaartDing", 131, 82);

        //Afegronde rechthoek
        g.drawRoundRect(10,90, breedte, hoogte,15, 15);

        // ruimte :)

        g.drawString("AfrondHoek", 1, 132);

        //Gevulde ovaal
        g.setColor(opvulkleur);
        g.fillOval(70, 90, breedte, hoogte);
        g.setColor(lijnkleur);
        g.drawString("OvaalFill", 70, 132);

        //Cirkel
        g.drawOval(131, 90, 30, 30);
        g.drawString("Cirkel", 131,130);

    }
}

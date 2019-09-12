package h06;

import javafx.scene.layout.BackgroundFill;

import java.awt.*;
import java.applet.*;


public class opdracht6_1 extends Applet {
    //Variabelen!!

    double opbrengst;
    double Personen;
    double uitkomst;

    String persoon1;
    String persoon2;
    String persoon3;
    String persoon4;

    Color Kleur;
    Color Kleur2;

    public void init() {
//Variablen!!

        Kleur = Color.PINK;
        Kleur2 = Color.yellow;
//Variablen!!
        persoon1 = "Jan";
        persoon2 = "Ali";
        persoon3 = "Jeannette";
        persoon4 = "Silv";
//Variablen!!
        opbrengst = 113;
        Personen = 4;
        uitkomst = opbrengst / Personen;
//Variablen!!

        //Background
        setBackground(Kleur);
    }

    public void paint(Graphics g) {
        g.setColor(Kleur2);
        g.drawString(persoon1 + "  krijgt  €" + uitkomst, 20, 20);
        g.drawString(persoon2 + "  krijgt  €" + uitkomst, 20, 30);
        g.drawString(persoon3 + "  krijgt  €" + uitkomst, 20, 40);
        g.drawString(persoon4 + "  krijgt  €" + uitkomst, 20, 50);


    }
}
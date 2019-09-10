package h06;

import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;

import java.applet.Applet;
import java.awt.*;

public class opdracht6_3 extends Applet {

    Color kleur1;
    Color kleur2;

    int A;
    int B;
    double Uitkomst;

    public void fill() {
         setBackground(kleur1);
    }


    public void init() {
        kleur1 = Color.PINK;
        kleur2 = Color.yellow;

        A = 1;
        B = 2;
        Uitkomst = B + A;
    }

    public void paint(Graphics g) {
    g.drawString("-" + Uitkomst, 20, 20);
    }
}

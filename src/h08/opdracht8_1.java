package h08;

import java.awt.*;
import java.applet.*;
import java.awt.event.*;


public class opdracht8_1 extends Applet {
    Button ButtonOk;
    Button ButtonReset;
    TextField Textfield;
    Label Label;
    String s;

    public void init() {
        setBackground(Color.PINK);
        Textfield = new TextField("( ͡° ͜ʖ ͡°)", 20);
        setBackground(Color.PINK);
        Label = new Label("(> ͡° ͜ʖ ͡°)>");

        add(Textfield);
        add(Label);
        s = "";

        ButtonOk = new Button("Ok");
        ButtonOk.addActionListener(new Ok());
        add(ButtonOk);


        ButtonReset = new Button("Reset");
        ButtonReset.addActionListener(new Reset());
        add(ButtonReset);


        setBackground(Color.pink);
    }

    public void paint(Graphics g) {
        g.drawString(s, 50, 60);
    }


    class Ok implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String input;

            input = Textfield.getText();
            s = input;
            repaint();
        }
    }

    class Reset implements ActionListener {
        public void actionPerformed(ActionEvent e) {

            Textfield.setText("");
            s = "";
            repaint();
        }
    }
}


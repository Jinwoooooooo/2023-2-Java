package assignment9;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class RainbowButtonFrame extends JFrame {
    public RainbowButtonFrame() {
        super("Rainbow Buttons Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new GridLayout(1, 10));

        JButton[] btn = new JButton[10];
        Color[] rainbowColors = {Color.RED, Color.ORANGE, Color.YELLOW, Color.GREEN, Color.BLUE,
                new Color(75, 0, 130), new Color(128, 0, 128), new Color(255, 0, 0), new Color(255, 165, 0),
                new Color(0, 0, 255)};

        for (int i = 0; i < btn.length; i++) {
            btn[i] = new JButton(Integer.toString(i));
            btn[i].setBackground(rainbowColors[i]);
            c.add(btn[i]);
        }

        setSize(500, 200);
        setVisible(true);
    }

    public static void main(String[] args) {
        new RainbowButtonFrame();
    }
}

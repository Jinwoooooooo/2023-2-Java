package assignment9;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class RandomLabelsFrame extends JFrame {
    public RandomLabelsFrame() {
        super("Random Labels Frame");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container container = getContentPane();
        container.setLayout(null); // Absolute positioning을 사용하기 위해 레이아웃 매니저를 null로 설정

        int labelCount = 20;
        int labelWidth = 10;
        int labelHeight = 10;
        Random random = new Random();

        for (int i = 0; i < labelCount; i++) {
            JLabel label = new JLabel();
            label.setBackground(Color.BLUE);
            label.setOpaque(true); // 배경색이 표시되도록 설정
            label.setBounds(random.nextInt(200) + 50, random.nextInt(200) + 50, labelWidth, labelHeight);
            container.add(label);
        }

        setSize(300, 300);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new RandomLabelsFrame());
    }
}

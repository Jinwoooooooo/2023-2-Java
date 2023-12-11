package assignment10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class ClickPractice extends JFrame {
    private JLabel label;

    public ClickPractice() {
        setTitle("Click Practice");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(null);

        // 초기 위치를 (100, 100)으로 하는 JLabel 생성
        label = new JLabel("C");
        label.setFont(new Font("Arial", Font.PLAIN, 24));
        label.setBounds(100, 100, 30, 30); // 크기는 30x30
        c.add(label);

        // JLabel에 마우스 클릭 이벤트 리스너 추가
        label.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                moveLabelRandomly(); // 랜덤한 위치로 이동
            }
        });

        setSize(400, 300);
        setVisible(true);
    }

    private void moveLabelRandomly() {
        Random random = new Random();
        int x = random.nextInt(getWidth() - label.getWidth());
        int y = random.nextInt(getHeight() - label.getHeight());
        label.setLocation(x, y);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new ClickPractice());
    }
}

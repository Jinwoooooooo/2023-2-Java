package assignment9;

import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample extends JFrame {
    public BorderLayoutExample() {
        // 프레임 설정
        setTitle("BorderLayout Example");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(300, 200);

        // 패널 생성
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout(5, 7)); // 수평 간격: 5, 수직 간격: 7

        // 컴포넌트 추가
        panel.add(new JButton("North"), BorderLayout.NORTH);
        panel.add(new JButton("South"), BorderLayout.SOUTH);
        panel.add(new JButton("East"), BorderLayout.EAST);
        panel.add(new JButton("West"), BorderLayout.WEST);
        panel.add(new JButton("Center"), BorderLayout.CENTER);

        // 패널을 프레임에 추가
        add(panel);

        // 프레임 표시
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new BorderLayoutExample());
    }
}

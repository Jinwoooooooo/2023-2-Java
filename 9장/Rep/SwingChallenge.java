package assignment9;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class SwingChallenge extends JFrame {
    private static final int LABEL_COUNT = 10;
    private JLabel[] starLabels;
    private JButton openButton, closeButton, exitButton, wordInputButton;
    private JTextField wordInputTextField;

    public SwingChallenge() {
        super("Swing Challenge");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 300);
        setLocationRelativeTo(null); // 화면 중앙에 표시

        // 상단에 버튼
        openButton = new JButton("열기");
        closeButton = new JButton("닫기");
        exitButton = new JButton("나가기");

        // 상단 버튼에 액션 리스너 추가
        openButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showMessage("열기 버튼이 눌렸습니다.");
            }
        });

        closeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showMessage("닫기 버튼이 눌렸습니다.");
            }
        });

        exitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        // 중앙에 JLabel
        starLabels = new JLabel[LABEL_COUNT];
        for (int i = 0; i < LABEL_COUNT; i++) {
            starLabels[i] = new JLabel("*");
            starLabels[i].setFont(new Font("Arial", Font.PLAIN, 20));
            starLabels[i].setForeground(Color.BLACK);
            starLabels[i].setVisible(false); // 초기에는 숨김 상태로 설정
            getContentPane().add(starLabels[i]);
        }

        // 하단에 버튼과 텍스트 필드
        wordInputButton = new JButton("Word Input");
        wordInputTextField = new JTextField();
        wordInputTextField.setHorizontalAlignment(JTextField.RIGHT); // 우측 정렬

        // 하단 버튼에 액션 리스너 추가
        wordInputButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showMessage("Word Input 버튼이 눌렸습니다. 입력 값: " + wordInputTextField.getText());
            }
        });

        // 프레임에 컴포넌트 배치
        getContentPane().setLayout(new BorderLayout());

        JPanel topPanel = new JPanel();
        topPanel.setBackground(Color.GRAY);
        topPanel.add(openButton);
        topPanel.add(closeButton);
        topPanel.add(exitButton);
        getContentPane().add(topPanel, BorderLayout.NORTH);

        JPanel centerPanel = new JPanel();
        centerPanel.setLayout(null);
        for (int i = 0; i < LABEL_COUNT; i++) {
            centerPanel.add(starLabels[i]);
        }
        getContentPane().add(centerPanel, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setBackground(Color.YELLOW);
        bottomPanel.setLayout(new BorderLayout());
        bottomPanel.add(wordInputButton, BorderLayout.WEST);
        bottomPanel.add(wordInputTextField, BorderLayout.EAST);
        getContentPane().add(bottomPanel, BorderLayout.SOUTH);
    }

    private void showMessage(String message) {
        JOptionPane.showMessageDialog(this, message);
    }

    // '*'를 랜덤한 위치에 표시하는 메서드
    private void displayRandomStars() {
        Random random = new Random();
        for (JLabel starLabel : starLabels) {
            int x = random.nextInt(getWidth() - 20); // 프레임 너비 내에서 랜덤한 X 위치
            int y = random.nextInt(getHeight() - 20); // 프레임 높이 내에서 랜덤한 Y 위치
            starLabel.setBounds(x, y, 20, 20); // '*' 크기는 20x20
            starLabel.setVisible(true);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            SwingChallenge frame = new SwingChallenge();
            frame.displayRandomStars(); // 초기에 '*'를 랜덤한 위치에 표시
            frame.setVisible(true);
        });
    }
}

package assignment10;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Dragging extends JFrame {
    private Container c; // Container 객체 정의

    public Dragging() {
        setTitle("드래깅동안 배경색을 YELLOW");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        c = getContentPane(); // Container 객체 초기화
        c.setLayout(new FlowLayout());

        // 초기 배경색을 초록색으로 설정
        c.setBackground(Color.GREEN);

        MyMouseListener listener = new MyMouseListener();
        c.addMouseMotionListener(listener);

        setSize(300, 200);
        setVisible(true);
    }

    class MyMouseListener implements MouseMotionListener {
        public void mouseDragged(MouseEvent e) {
            c.setBackground(Color.YELLOW); // 배경색을 노란색으로 변경
        }

        @Override
        public void mouseMoved(MouseEvent e) {
            // 드래깅 중이 아닌 경우, 배경색을 초록색으로 변경
            c.setBackground(Color.GREEN);
        }
    }

    public static void main(String[] args) {
        new Dragging();
    }
}


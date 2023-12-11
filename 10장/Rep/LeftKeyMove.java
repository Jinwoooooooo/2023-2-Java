package assignment10;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LeftKeyMove extends JFrame {
    public LeftKeyMove() {
        super("Left 키로 문자열 이동");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        JLabel label = new JLabel("Love Java");
        //"Love Java"라는 텍스트를 가진 JLabel 객체를 생성.

        c.addKeyListener(new KeyAdapter() {
        //JFrame에 KeyListener를 추가. 이 리스너는 키 이벤트를 처리.
            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_LEFT) {
                //눌린 키가 왼쪽 방향키인지 확인.
                    String text = label.getText();
                    //현재 레이블에 있는 텍스트를 가져옴.
                    text = text.substring(1) + text.charAt(0);
                    //문자열을 한 문자씩 왼쪽으로 회전.
                    label.setText(text);
                    //회전된 문자열을 다시 레이블에 설정하여 화면에 표시.
                }
            }
        });

        c.add(label);
        setSize(250, 100);
        setVisible(true);

        c.setFocusable(true); 
        //JFrame이 포커스를 받을 수 있도록 지정
        c.requestFocus(); 
        //JFrame에 키 입력 포커스를 설정. 이렇게 하면 프로그램이 시작될 때 바로 키 입력을 받을 수 있음.
    }

    public static void main(String[] args) {
        new LeftKeyMove();
    }
}

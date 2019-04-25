package com.t3h.Myui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel1 extends JPanel implements ActionListener {
    private JLabel lbTitle;
    private JTextField tfUserName;
    private JPasswordField tfPassWord;
    private JButton btnLogin;

    public Panel1() {
        setLayout(null);
        setBackground(Color.WHITE);
        initComp();
    }

    private void initComp() {
        lbTitle = new JLabel();
        lbTitle.setText("Login");
        lbTitle.setSize(Frame1.W,30);
        lbTitle.setLocation(0,50);
        lbTitle.setHorizontalAlignment(SwingConstants.CENTER);
        lbTitle.setForeground(Color.blue);
        add(lbTitle);

        //===============================================
        tfUserName = new JTextField();
        tfUserName.setSize(Frame1.W - 40,30);
        int y = lbTitle.getY() + lbTitle.getHeight() + 10;
        tfUserName.setLocation(10,y);
        add(tfUserName);

        //===============================================
        tfPassWord = new JPasswordField();
        tfPassWord.setSize(tfUserName.getWidth(),tfUserName.getHeight());
        y = tfUserName.getY()+tfUserName.getHeight() + 10;
        tfPassWord.setLocation(10,y);
        add(tfPassWord);
        tfPassWord.addActionListener(this);
        //==============================================
        btnLogin = new JButton();
        btnLogin.setText("ok");
        btnLogin.setSize(100,30);
        y = tfPassWord.getY() + tfPassWord.getHeight() +10;
        int x = tfPassWord.getX() + tfPassWord.getWidth() - btnLogin.getWidth();
        btnLogin.setLocation(x,y);
        btnLogin.setForeground(Color.WHITE);
        btnLogin.setBackground(Color.red);
        add(btnLogin);
        btnLogin.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

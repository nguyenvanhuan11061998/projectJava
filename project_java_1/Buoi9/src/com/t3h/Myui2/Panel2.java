package com.t3h.Myui2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Panel2 extends JPanel implements ActionListener {
    private JLabel lbText;
    private JButton btnLogout;

    public Panel2(String userName, String password) {

        setBackground(Color.WHITE);
        setLayout(null);
        initComp();
    }

    private void initComp() {
        lbText = new JLabel();
        lbText.setSize(Frame2.W - 40,30);
        lbText.setText("Xin chao");
        lbText.setLocation(0,50);
        lbText.setHorizontalAlignment(SwingConstants.CENTER);
        lbText.setForeground(Color.red);
        add(lbText);

        //===========================
        btnLogout = new JButton();
        btnLogout.setSize(100,30);
        btnLogout.setText("Logout");
        int y = lbText.getY() + lbText.getHeight() +10;
        int x = Frame2.W/2 - (btnLogout.getWidth()/2)-10;
        btnLogout.setLocation(x,y);
        btnLogout.setForeground(Color.WHITE);
        btnLogout.setBackground(Color.BLUE);
        add(btnLogout);
        btnLogout.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

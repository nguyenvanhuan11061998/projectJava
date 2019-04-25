package com.t3h.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {
    private JLabel lbTitle;
    private JTextField tfInput;
    private JButton btnSubmit;
    private JButton btnCannel;
    public MyPanel() {
        setLayout(null);
        setBackground(Color.WHITE);
        initComp();
    }

    private void initComp() {
        lbTitle = new JLabel();
        lbTitle.setText("Hello");
        lbTitle.setSize(MyFrame.W,100);
        lbTitle.setLocation(0,10);
        lbTitle.setHorizontalAlignment(SwingConstants.CENTER);      //đưa ra giữa màn hình thông tin
        lbTitle.setForeground(Color.red);                           //màu chữ
        lbTitle.setFont(new Font("Palace Script MT",Font.ITALIC,20));                                //thay đổi font chữ(kiểu chữ, kiểu font, kích thước chữ)
        add(lbTitle);
        //=============================================
        tfInput = new JTextField();
        tfInput.setSize(MyFrame.W-40,30);
        int y  = lbTitle.getY() + lbTitle.getHeight() + 10;
        tfInput.setLocation(10,y);
        add(tfInput);

        //=============================================
        btnSubmit = new JButton();
        btnSubmit.setText("ok");
        btnSubmit.setSize(100,30);
        y = tfInput.getY() + tfInput.getHeight() + 10;
        int x = tfInput.getX() + tfInput.getWidth() - btnSubmit.getWidth();
        btnSubmit.setLocation(x,y);
        btnSubmit.setBackground(Color.red);                     //Màu Button
        btnSubmit.setForeground(Color.WHITE);                   //Màu chữ
        add(btnSubmit);
        btnSubmit.addActionListener(this);


        btnCannel = new JButton();
        btnCannel.setText("Cannel");
        btnCannel.setSize(btnSubmit.getWidth(),btnSubmit.getHeight());
        x= x - btnCannel.getWidth() - 10;
        btnCannel.setLocation(x,y);
        btnCannel.setBackground(Color.orange);
        btnCannel.setForeground(Color.blue);
        add(btnCannel);
        btnCannel.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {        //đưa vào một hành động.
        if(e.getSource().equals(btnSubmit)){            //lấy ra hành động người dùng so sánh.
            lbTitle.setText(tfInput.getText());
            tfInput.setText("");
        }else if(e.getSource().equals(btnCannel)){
            System.exit(0);
        }
    }
}

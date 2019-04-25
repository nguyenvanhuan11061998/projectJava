package com.t3h.Bai1.ui1;

import com.t3h.Bai1.Main1.PTB2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {
    private JLabel lbTitle;
    private JLabel lbNhapA;
    private JLabel lbNhapB;
    private JLabel lbNhapC;
    private JLabel lbKetQua;
    private JLabel lbBoxKetQua1;
    private JLabel lbBoxKetQua2;

    private JPanel pnBoxKetQua;

    private JTextField tfNhapA;
    private JTextField tfNhapB;
    private JTextField tfNhapC;

    private JButton btnGiaiPT;

    public MyPanel() {
        setLayout(null);
        initComp();

    }

    private void initComp() {
        lbTitle = new JLabel();
        lbTitle.setText("GIẢI PT BẬC 2");
        lbTitle.setSize(GUI.W,100);
        lbTitle.setLocation(0,10);
        lbTitle.setHorizontalAlignment(SwingConstants.CENTER);
        Color c = new Color(0x3621D1);
        lbTitle.setForeground(c);
        lbTitle.setFont(new Font(null,Font.BOLD,50));
        add(lbTitle);
        //======================================================


        lbNhapA = new JLabel();
        lbNhapA.setText("Nhập A:");
        lbNhapA.setSize(100,50);
        int y = lbTitle.getHeight()  + lbTitle.getY() + 10;
        lbNhapA.setLocation(20,y);
        lbNhapA.setHorizontalAlignment(SwingConstants.RIGHT);
        c = new Color(0x3AC3C4);
        lbNhapA.setForeground(c);
        lbNhapA.setFont(new Font(null,Font.BOLD,25));
        add(lbNhapA);
        //======================================================


        lbNhapB = new JLabel();
        lbNhapB.setText("Nhập B:");
        lbNhapB.setSize(100,50);
        y = lbNhapA.getHeight()  + lbNhapA.getY() + 10;
        lbNhapB.setLocation(20,y);
        lbNhapB.setHorizontalAlignment(SwingConstants.CENTER);
        c = new Color(0x3AC3C4);
        lbNhapB.setForeground(c);
        lbNhapB.setFont(new Font(null,Font.BOLD,25));
        add(lbNhapB);
        //======================================================


        lbNhapC = new JLabel();
        lbNhapC.setText("Nhập C:");
        lbNhapC.setSize(100,50);
        y = lbNhapB.getHeight()  + lbNhapB.getY() + 10;
        lbNhapC.setLocation(20,y);
        lbNhapC.setHorizontalAlignment(SwingConstants.CENTER);
        c = new Color(0x3AC3C4);
        lbNhapC.setForeground(c);
        lbNhapC.setFont(new Font(null,Font.BOLD,25));
        add(lbNhapC);
        //=====================================================


        tfNhapA = new JTextField();
        tfNhapA.setSize(400,50);
        y = lbNhapA.getY();
        int x = lbNhapA.getX()+lbNhapA.getWidth()+10;
        tfNhapA.setLocation(x,y);
        add(tfNhapA);
        tfNhapA.setFont(new Font(null,0,20));
        tfNhapA.addActionListener(this);
        //=====================================================


        tfNhapB = new JTextField();
        tfNhapB.setSize(400,50);
        y = lbNhapB.getY();
        x = lbNhapB.getX()+lbNhapB.getWidth()+10;
        tfNhapB.setLocation(x,y);
        add(tfNhapB);
        tfNhapB.setFont(new Font(null,0,20));
        tfNhapB.addActionListener(this);
        //=====================================================


        tfNhapC = new JTextField();
        tfNhapC.setSize(400,50);
        y = lbNhapC.getY();
        x = lbNhapC.getX()+lbNhapC.getWidth()+10;
        tfNhapC.setLocation(x,y);
        add(tfNhapC);
        tfNhapC.setFont(new Font(null,0,20));
        tfNhapC.addActionListener(this);
        //====================================================


        lbKetQua = new JLabel();
        lbKetQua.setText("Kết quả:");
        lbKetQua.setSize(100,50);
        y = lbNhapC.getHeight()  + lbNhapC.getY() + 20;
        lbKetQua.setLocation(20,y);
        lbKetQua.setHorizontalAlignment(SwingConstants.RIGHT);
        c = new Color(0x000000);
        lbKetQua.setForeground(c);
        lbKetQua.setFont(new Font(null,Font.BOLD,25));
        add(lbKetQua);
        //====================================================


        lbBoxKetQua1 = new JLabel();
        lbBoxKetQua1.setSize(240,40);
        int y1 = lbNhapC.getY()+lbNhapC.getHeight()+10;
        lbBoxKetQua1.setLocation(x+10,y1);
        lbBoxKetQua1.setForeground(Color.BLACK);
        lbBoxKetQua1.setFont(new Font(null,0,20));
        add(lbBoxKetQua1);
        //=================================================

        lbBoxKetQua2 = new JLabel();
        lbBoxKetQua2.setSize(240,40);
        lbBoxKetQua2.setLocation(x+10,y1+45);
        lbBoxKetQua2.setForeground(Color.BLACK);
        lbBoxKetQua2.setFont(new Font(null,0,20));
        add(lbBoxKetQua2);
        //================================================

        pnBoxKetQua = new JPanel();
        pnBoxKetQua.setLayout(null);
        pnBoxKetQua.setSize(250,80);
        c = new Color(0xFFC423);
        x = lbKetQua.getX() + lbKetQua.getWidth() + 10;
        y = lbKetQua.getY();
        pnBoxKetQua.setLocation(x,y);
        pnBoxKetQua.setBackground(c);
        add(pnBoxKetQua);

        //===================================================


        btnGiaiPT = new JButton();
        btnGiaiPT.setSize(130,50);
        x = pnBoxKetQua.getX()+pnBoxKetQua.getWidth() + 20;
        btnGiaiPT.setLocation(x,y);
        btnGiaiPT.setText("Giải PT");
        c = new Color(0x3621D1);
        btnGiaiPT.setForeground(c);
        btnGiaiPT.setFont(new Font(null,0,20));
        add(btnGiaiPT);
        btnGiaiPT.addActionListener(this);

    }




    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(btnGiaiPT)){
            PTB2 ptb2 = new PTB2();
            String a = tfNhapA.getText();
            String b = tfNhapB.getText();
            String c = tfNhapC.getText();
            if(a.isEmpty() || b.isEmpty() || c.isEmpty()){
                JOptionPane.showMessageDialog(null,"Phải nhập dữ liệu mới tính đc -.-","Không thể tính",
                        JOptionPane.QUESTION_MESSAGE);
                return ;
            }else if(ptb2.kt(a,b,c).equals("notNum")){
                JOptionPane.showMessageDialog(null,"Nhập số sai rồi kìa :3","Không thể ",
                        JOptionPane.QUESTION_MESSAGE);
                return ;
            }
            lbBoxKetQua1.setText("Nghiệm 1: "+String.valueOf(ptb2.GiaiPT1(a,b,c)));
            lbBoxKetQua2.setText("Nghiệm 2: "+String.valueOf(ptb2.GiaiPT2(a,b,c)));
        }
    }
}

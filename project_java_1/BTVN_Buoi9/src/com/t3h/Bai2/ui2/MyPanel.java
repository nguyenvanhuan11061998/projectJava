package com.t3h.Bai2.ui2;

import com.t3h.Bai2.Main2.MyPrime;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyPanel extends JPanel implements ActionListener {
    private JLabel lbKiemTra;
    private JLabel lbNhapN;

    private JTextField tfKiemTra;
    private JTextField tfNhapN;

    private JButton btnKiemTra;
    private JButton btnLietKe;

    public MyPanel() {
        setLayout(null);
        initComp();
        Color c = new Color(0xB1ECA6);
        setBackground(c);
    }

    private void initComp() {
        tfKiemTra = new JTextField();
        tfKiemTra.setSize(250,40);
        int x = Gui.W/4;
        int y = Gui.H/6;
        tfKiemTra.setLocation(x,y);
        tfKiemTra.setFont(new Font(null,0,15));
        add(tfKiemTra);
        tfKiemTra.addActionListener(this);
        //===============================================


        tfNhapN = new JTextField();
        tfNhapN.setSize(250,40);
        y = tfKiemTra.getY() + tfKiemTra.getHeight() + 10;
        tfNhapN.setLocation(x,y);
        tfNhapN.setFont(new Font(null,0,15));
        add(tfNhapN);
        //================================================


        lbKiemTra = new JLabel();
        lbKiemTra.setText("Số Kiểm Tra:");
        lbKiemTra.setSize(120,40);
        x = tfKiemTra.getX() - lbKiemTra.getWidth()+10;
        y = tfKiemTra.getY();
        lbKiemTra.setLocation(x,y);
        lbKiemTra.setFont(new Font(null,Font.BOLD,17));
        Color c = new Color(0x2714AF);
        lbKiemTra.setForeground(c);
        add(lbKiemTra);
        //================================================


        lbNhapN = new JLabel();
        lbNhapN.setText("Khoảng N:");
        lbNhapN.setSize(120,40);
        x = tfNhapN.getX() - lbNhapN.getWidth() + 28;
        y = tfNhapN.getY();
        lbNhapN.setLocation(x,y);
        lbNhapN.setFont(new Font(null, Font.BOLD,17));
        lbNhapN.setForeground(c);
        add(lbNhapN);
        //====================================================


        btnKiemTra = new JButton();
        btnKiemTra.setText("Kiểm Tra");
        btnKiemTra.setSize(120,40);
        x = tfKiemTra.getX() + tfKiemTra.getWidth() + 10;
        y = tfKiemTra.getY();
        c = new Color(0xD60A0F);
        btnKiemTra.setForeground(c);
        btnKiemTra.setFont(new Font(null,Font.BOLD,17));
        btnKiemTra.setLocation(x,y);
        add(btnKiemTra);
        btnKiemTra.addActionListener(this);
        //===================================================


        btnLietKe = new JButton();
        btnLietKe.setText("Liệt Kê");
        btnLietKe.setSize(120,40);
        y = tfNhapN.getY();
        btnLietKe.setLocation(x,y);
        btnLietKe.setForeground(c);
        btnLietKe.setFont(new Font(null,Font.BOLD,17));
        add(btnLietKe);
        btnLietKe.addActionListener(this);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(btnKiemTra)){
            String soKT = tfKiemTra.getText();
            if(soKT.isEmpty()){
                JOptionPane.showMessageDialog(null,"Nhập số mới kiểm tra đc chứ :(","Kiểm tra thất bại",
                        JOptionPane.QUESTION_MESSAGE);
                return ;
            }
            MyPrime myPrime = new MyPrime();
            int a = myPrime.kiemTraSo(soKT);
            if(a == -1){
                JOptionPane.showMessageDialog(null,"Số đấy là số nguyên tố đấy :)","Kq kiểm tra",
                        JOptionPane.QUESTION_MESSAGE);
                return;
            }else if(a == -2){
                JOptionPane.showMessageDialog(null,"Không phải số nguyên tố đâu nha :0",
                        "kq kiểm tra",JOptionPane.QUESTION_MESSAGE);
                return;
            }else if(a==-3){
                JOptionPane.showMessageDialog(null,"Nhập số thế à, sai rồi :V",
                        "kq Kiểm tra",JOptionPane.QUESTION_MESSAGE);
                return;
            }
        }else if(e.getSource().equals(btnLietKe)){
            String soLK = tfNhapN.getText();
            if (soLK.isEmpty()){
                JOptionPane.showMessageDialog(null,"Không nhập số vào liệt kê sao đc _._","kq liệt kê",
                        JOptionPane.QUESTION_MESSAGE);
                return;
            }else{
                MyPrime myPrime = new MyPrime();
                int a = myPrime.ktLietKe(tfNhapN.getText());
                if(a == -1){
                    JOptionPane.showMessageDialog(null,"Nhập số đi, nhập j thế - . -","kq Liệt kê",
                            JOptionPane.QUESTION_MESSAGE);
                }else{

                    String chuoi = myPrime.MangPTu(a);
                    JOptionPane.showMessageDialog(null,chuoi,
                            "kq Liệt kê",JOptionPane.QUESTION_MESSAGE);
                }
            }
        }
    }
}

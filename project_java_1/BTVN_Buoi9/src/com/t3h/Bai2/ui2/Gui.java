package com.t3h.Bai2.ui2;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class Gui extends JFrame implements WindowListener {
    public static final int W = 600;
    public static final int H = 200;

    public Gui() throws HeadlessException {
        setSize(W,H);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Kiểm tra số");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        addWindowListener(this);

        MyPanel myPanel = new MyPanel();
        add(myPanel);
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        int result = JOptionPane.showConfirmDialog(null,"Suy nghĩ kỹ chưa mà thoát","Thoát ứng dụng",
                JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(result == JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }
}

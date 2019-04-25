package com.t3h.Button;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ButtonHuongDan extends JButton implements MouseListener {
    private ImageIcon btnHuongDan1;
    private ImageIcon btnHuongDan2;

    public ButtonHuongDan() {
        btnHuongDan1 = new ImageIcon(getClass().getResource("/sound/Button/button_huong-dan1.png"));
        btnHuongDan2 = new ImageIcon(getClass().getResource("/sound/Button/button_huong-dan2.png"));
        addMouseListener(this);
        setBorder(null);
        setIcon(btnHuongDan1);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        setIcon(btnHuongDan1);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        setIcon(btnHuongDan1);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        setIcon(btnHuongDan1);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        setIcon(btnHuongDan2);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        setIcon(btnHuongDan1);
    }
}
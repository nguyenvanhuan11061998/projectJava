package com.t3h.Button;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ButtonTamDung extends JButton implements MouseListener {
    private ImageIcon btnTamDung1;
    private ImageIcon btnTamDung2;

    public ButtonTamDung() {
        btnTamDung1 = new ImageIcon(getClass().getResource("/sound/Button/button_tam-dung1.png"));
        btnTamDung2 = new ImageIcon(getClass().getResource("/sound/Button/button_tam-dung2.png"));
        addMouseListener(this);
        setBorder(null);
        setIcon(btnTamDung1);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        setIcon(btnTamDung1);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        setIcon(btnTamDung1);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        setIcon(btnTamDung1);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        setIcon(btnTamDung2);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        setIcon(btnTamDung1);
    }
}

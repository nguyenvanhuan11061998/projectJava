package com.t3h.Button;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ButtonChoiLai extends JButton implements MouseListener {
    private ImageIcon btnChoiLai1;
    private ImageIcon btnChoiLai2;

    public ButtonChoiLai() {
        btnChoiLai1 = new ImageIcon(getClass().getResource("/sound/Button/button_choi-lai.png"));
        btnChoiLai2 = new ImageIcon(getClass().getResource("/sound/Button/button_choi-lai (1).png"));
        addMouseListener(this);
        setBorder(null);
        setIcon(btnChoiLai1);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        setIcon(btnChoiLai1);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        setIcon(btnChoiLai1);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        setIcon(btnChoiLai1);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        setIcon(btnChoiLai2);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        setIcon(btnChoiLai1);
    }
}
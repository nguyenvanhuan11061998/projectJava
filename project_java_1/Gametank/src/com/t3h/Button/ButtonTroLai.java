package com.t3h.Button;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ButtonTroLai extends JButton implements MouseListener {
    private ImageIcon btnTroLai1;
    private ImageIcon btnTroLai2;

    public ButtonTroLai() {
        btnTroLai1 = new ImageIcon(getClass().getResource("/sound/Button/button_tro-lai.png"));
        btnTroLai2 = new ImageIcon(getClass().getResource("/sound/Button/button_tro-lai (1).png"));
        addMouseListener(this);
        setBorder(null);
        setIcon(btnTroLai1);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        setIcon(btnTroLai1);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        setIcon(btnTroLai1);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        setIcon(btnTroLai1);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        setIcon(btnTroLai2);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        setIcon(btnTroLai1);
    }
}
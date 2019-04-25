package com.t3h.Button;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ButtonTiepTuc extends JButton implements MouseListener {
    private ImageIcon btnTiepTuc1;
    private ImageIcon btnTiepTuc2;

    public ButtonTiepTuc() {
        btnTiepTuc1 = new ImageIcon(getClass().getResource("/sound/Button/button_tiep-tuc (1).png"));
        btnTiepTuc2 = new ImageIcon(getClass().getResource("/sound/Button/button_tiep-tuc.png"));
        addMouseListener(this);
        setBorder(null);
        setIcon(btnTiepTuc1);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        setIcon(btnTiepTuc1);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        setIcon(btnTiepTuc1);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        setIcon(btnTiepTuc1);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        setIcon(btnTiepTuc2);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        setIcon(btnTiepTuc1);
    }
}

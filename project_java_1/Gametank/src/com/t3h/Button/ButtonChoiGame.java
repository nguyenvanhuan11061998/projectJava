package com.t3h.Button;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class ButtonChoiGame extends JButton implements MouseListener {
    private ImageIcon btnChoiGame1;
    private ImageIcon btnChoiGame2;

    public ButtonChoiGame() {
        btnChoiGame1 = new ImageIcon(getClass().getResource("/sound/Button/button_choi-game1.png"));
        btnChoiGame2 = new ImageIcon(getClass().getResource("/sound/Button/button_choi-game2.png"));
        addMouseListener(this);
        setBorder(null);
        setIcon(btnChoiGame1);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        setIcon(btnChoiGame1);
    }

    @Override
    public void mousePressed(MouseEvent e) {
        setIcon(btnChoiGame1);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        setIcon(btnChoiGame1);
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        setIcon(btnChoiGame2);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        setIcon(btnChoiGame1);
    }
}

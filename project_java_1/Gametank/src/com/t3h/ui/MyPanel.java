package com.t3h.ui;

import com.t3h.Button.ButtonChoiGame;
import com.t3h.Button.ButtonHuongDan;
import com.t3h.Gui.TankFrame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowListener;

public class MyPanel extends JPanel implements ActionListener {
    private int W = MainFrame.W;
    private int H = MainFrame.H;
    private Image image = new ImageIcon(getClass().getResource("/sound/image/Background.jpg")).getImage();
    private ButtonHuongDan btnHuongDan;
    private ButtonChoiGame btnChoi;


    public Image getImage() {
        return image;
    }

    public MyPanel() {
        setLayout(null);

        initComp();
    }

    private void initComp() {
        btnChoi = new ButtonChoiGame();
        btnChoi.setSize(169,48);
        int x = W/2 - btnChoi.getWidth()/2;
        int y = 400;
        btnChoi.setLocation(x,y);
        add(btnChoi);
        btnChoi.addActionListener(this);

        btnHuongDan = new ButtonHuongDan();
        btnHuongDan.setSize(175,48);
        x = W/2 - btnHuongDan.getWidth()/2;
        y = 480;
        btnHuongDan.setLocation(x,y);
        add(btnHuongDan);
    }

    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D)g;
        super.paintComponent(g2d);

        g2d.drawImage(image,0,0,null);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource().equals(btnChoi)){
            TankFrame tankFrame = new TankFrame();
            tankFrame.setVisible(true);
        }
    }
}

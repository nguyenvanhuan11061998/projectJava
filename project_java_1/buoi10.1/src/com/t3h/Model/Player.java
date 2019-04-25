package com.t3h.Model;

import com.t3h.Manager.SoundManager;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Player extends Entiy {

    private int index = 0;
    private int count = 0;
    private long t = 0;
    private Image[] imLeft = {
            new ImageIcon(getClass().getResource("/santa_images/left0.png")).getImage(),
            new ImageIcon(getClass().getResource("/santa_images/left1.png")).getImage(),
            new ImageIcon(getClass().getResource("/santa_images/left2.png")).getImage(),
            new ImageIcon(getClass().getResource("/santa_images/left3.png")).getImage(),
            new ImageIcon(getClass().getResource("/santa_images/left4.png")).getImage(),
            new ImageIcon(getClass().getResource("/santa_images/left5.png")).getImage(),
            new ImageIcon(getClass().getResource("/santa_images/left6.png")).getImage(),
            new ImageIcon(getClass().getResource("/santa_images/left7.png")).getImage()
    };

    private Image[] imRight = {
            new ImageIcon(getClass().getResource("/santa_images/right0.png")).getImage(),
            new ImageIcon(getClass().getResource("/santa_images/right1.png")).getImage(),
            new ImageIcon(getClass().getResource("/santa_images/right2.png")).getImage(),
            new ImageIcon(getClass().getResource("/santa_images/right3.png")).getImage(),
            new ImageIcon(getClass().getResource("/santa_images/right4.png")).getImage(),
            new ImageIcon(getClass().getResource("/santa_images/right5.png")).getImage(),
            new ImageIcon(getClass().getResource("/santa_images/right6.png")).getImage(),
            new ImageIcon(getClass().getResource("/santa_images/right7.png")).getImage()
    };

    private Image[] imUp = {
            new ImageIcon(getClass().getResource("/santa_images/up0.png")).getImage(),
            new ImageIcon(getClass().getResource("/santa_images/up1.png")).getImage(),
            new ImageIcon(getClass().getResource("/santa_images/up2.png")).getImage(),
            new ImageIcon(getClass().getResource("/santa_images/up3.png")).getImage(),
            new ImageIcon(getClass().getResource("/santa_images/up4.png")).getImage(),
            new ImageIcon(getClass().getResource("/santa_images/up5.png")).getImage(),
            new ImageIcon(getClass().getResource("/santa_images/up6.png")).getImage(),
            new ImageIcon(getClass().getResource("/santa_images/up7.png")).getImage()
    };

    private Image[] imDown = {
            new ImageIcon(getClass().getResource("/santa_images/down0.png")).getImage(),
            new ImageIcon(getClass().getResource("/santa_images/down1.png")).getImage(),
            new ImageIcon(getClass().getResource("/santa_images/down2.png")).getImage(),
            new ImageIcon(getClass().getResource("/santa_images/down3.png")).getImage(),
            new ImageIcon(getClass().getResource("/santa_images/down4.png")).getImage(),
            new ImageIcon(getClass().getResource("/santa_images/down5.png")).getImage(),
            new ImageIcon(getClass().getResource("/santa_images/down6.png")).getImage(),
            new ImageIcon(getClass().getResource("/santa_images/down7.png")).getImage()
    };

    private Image[][] images = {imLeft, imRight, imUp, imDown};

    public Player(int x, int y) {
        super(x, y);
        orient = RIGHT;
    }

    @Override
    public void draw(Graphics2D g2D) {
        img = images[orient][index];
        super.draw(g2D);
    }

    public void changeOrient(int newOrient) {
        orient = newOrient;
    }

    @Override
    public void move() {
        super.move();
    }
}

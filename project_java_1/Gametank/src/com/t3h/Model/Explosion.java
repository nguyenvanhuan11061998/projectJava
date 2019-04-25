package com.t3h.Model;

import javax.swing.*;
import java.awt.*;

public class Explosion {
    private int x;
    private int y;

    private Image[] arr = {
            new ImageIcon(getClass().getResource("/sound/image/bullet_exp1.png")).getImage(),
            new ImageIcon(getClass().getResource("/sound/image/bullet_exp12.png")).getImage(),
            new ImageIcon(getClass().getResource("/sound/image/bullet_exp2.png")).getImage(),
            new ImageIcon(getClass().getResource("/sound/image/bullet_exp3.png")).getImage(),
            new ImageIcon(getClass().getResource("/sound/image/bullet_exp32.png")).getImage(),
            new ImageIcon(getClass().getResource("/sound/image/bullet_exp42.png")).getImage(),
            new ImageIcon(getClass().getResource("/sound/image/bullet_exp4.png")).getImage(),
    };

    public Explosion(int x, int y) {
        this.x = x;
        this.y = y;
    }

    private int time = 50;
    private int index = 0;

    public void draw(Graphics2D g2d) {
        time--;
        if (time < 0) {
            return;
        }
        if (time < 10) {
            index = 6;
        } else if (time < 20) {
            index = 5;
        } else if (time < 25) {
            index = 4;
        } else if (time < 30) {
            index = 3;
        } else if(time <38){
            index = 2;
        }else if(time <44){
            index = 1;
        }else{
            index = 0;
        }

        int xD = x - arr[index].getWidth(null) / 2;
        int yD = y - arr[index].getHeight(null) / 2;
        g2d.drawImage(arr[index], xD, yD, null);
    }
}

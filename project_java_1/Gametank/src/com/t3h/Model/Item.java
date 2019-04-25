package com.t3h.Model;

import javax.swing.*;
import java.awt.*;

public class Item {
    private Image Score = new ImageIcon(getClass().getResource("/sound/image/Score.jpg")).getImage();
    private Image TowerBoss = new ImageIcon(getClass().getResource("/sound/image/tower.png")).getImage();
    private Image heart = new ImageIcon(getClass().getResource("/sound/image/heart.png")).getImage();

        public void drawHeart(Graphics2D g2d, int x, int y){
        g2d.drawImage(heart,x,y,null);
    }

    public void drawScore(Graphics2D g2d,int x, int y){
        g2d.drawImage(Score,x,y,null);
    }

    public void drawTowerBoss(Graphics2D g2d,int x, int y){
        g2d.drawImage(TowerBoss,x,y,null);
    }


}

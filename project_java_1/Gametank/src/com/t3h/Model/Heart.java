package com.t3h.Model;

import javax.swing.*;
import java.awt.*;

public class Heart {
    private int x;
    private int y;
    private Image heart = new ImageIcon(getClass().getResource("/sound/image/heart.png")).getImage();

    public Heart(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth(){
        return heart.getWidth(null);
    }

    public int getHeight(){
        return heart.getHeight(null);
    }
    public void drawHeart(Graphics2D g2d){
        g2d.drawImage(heart,x,y,null);
    }

    public Rectangle getRect() {
        if (heart == null) {
            return new Rectangle();
        }
        Rectangle rect = new Rectangle(x, y, heart.getWidth(null), heart.getHeight(null));
        return rect;
    }

    public boolean checkPlayer(Player player){
        Rectangle rect = getRect().intersection(player.getRect());
        if(rect.isEmpty() == false){
            return  false;
        }
        return true;
    }
}

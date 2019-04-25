package com.t3h.Model;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Bullet extends EntityBullet {
    private Image imgBullet = new ImageIcon(getClass().getResource("/sound/image/bullet.png")).getImage();

    public Bullet(int x, int y, int orient) {
        super(x, y, orient);
    }

    @Override
    public void draw(Graphics2D g2d) {
        img = imgBullet;
        super.draw(g2d);
    }


    @Override
    public void move(int speed, ArrayList<Maptank> maptanks) {
        super.move(speed, maptanks);
    }

    /* Truyền vào một đối tượng hình chữ nhật, khai báo một hình chữ nhật kích thước bao trùm đạn , trả về true nếu
    có sự giao nhau giữa đạn và đối tượng(kiểm tra hình chữ nhật bằng rỗng là sai => hình chữ nhật không rỗng)*/
    public boolean checkBoomBullet(Rectangle rect) {
        int w = imgBullet.getWidth(null);
        int h = imgBullet.getHeight(null);
        int xD = x +4;
        int yD = y +4;
        Rectangle bRect = new Rectangle(xD, yD, w-7, h-7);
        return (rect.intersection(bRect).isEmpty() == false);
    }
}

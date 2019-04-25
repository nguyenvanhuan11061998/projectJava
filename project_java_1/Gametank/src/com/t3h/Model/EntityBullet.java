package com.t3h.Model;

import java.awt.*;
import java.util.ArrayList;

public class EntityBullet {
    public static final int UP = 0;
    public static final int UP_RIGHT = 1;
    public static final int RIGHT = 2;
    public static final int DOWN_RIGHT = 3;
    public static final int DOWN = 4;
    public static final int DOWN_LEFT = 5;
    public static final int LEFT = 6;
    public static final int UP_LEFT = 7;

    protected int x;
    protected int y;
    protected Image img;
    protected int orient;

    public EntityBullet(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public EntityBullet(int x, int y, int orient) {
        this.x = x;
        this.y = y;
        this.orient = orient;
    }

    public void draw(Graphics2D g2d) {
        g2d.drawImage(img, x, y, null);
    }

    public void move(int speed, ArrayList<Maptank> maptanks) {
        switch (orient) {
            case LEFT:
                x -= speed;
                break;
            case RIGHT:
                x += speed;
                break;
            case UP:
                y -= speed;
                break;
            case DOWN:
                y += speed;
                break;
            case UP_RIGHT:
                x += speed;
                y -= speed;
                break;
            case UP_LEFT:
                x -= speed;
                y -= speed;
                break;
            case DOWN_RIGHT:
                x += speed;
                y += speed;
                break;
            case DOWN_LEFT:
                x -= speed;
                y += speed;
                break;
        }
    }

    /*Khai báo một hình chữ nhật có kích thước bằng kích thước của vật thể để phục vụ va chạm*/
    public Rectangle getRect() {
        if (img == null) {
            return new Rectangle();
        }
        Rectangle rect = new Rectangle(x, y, img.getWidth(null), img.getHeight(null));
        return rect;
    }


    /*
    * Truyền vào một map. nếu bit = 0 thì tiếp tục kiểm tra ,nếu là các bít được đi qua thì tiếp tục, nếu là các bit khác
    tiếp tục kiểm tra. khai báo một hình chữ nhật là giao giữa đối tượng và map, nếu trả về true thì hình chữ nhật tồn tại,
    có giao nhau giữa map và phần tử, nếu trả về false là không*/
    public boolean checkMap(ArrayList<Maptank> arr) {
        for (Maptank map : arr) {
            if (map.getBit() == 0 || map.getBit() == 3) {
                continue;
            }
            Rectangle rectangle = getRect().intersection(map.getRect());
            if (rectangle.isEmpty() == false) {
                return false;
            }
        }
        return true;
    }
    /*Truyền vào một mảng đạn, nếu đối tượng bị trúng đạn thì trả về true, nếu không thì trả về false*/
    public boolean checkDie(ArrayList<Bullet> arrBullet) {
        for (Bullet b : arrBullet) {
            if (b.checkBoomBullet(getRect())) {
                return true;
            }
        }
        return false;
    }


}

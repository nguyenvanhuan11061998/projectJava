package com.t3h.Model;

import java.awt.*;
import java.util.ArrayList;

public abstract class Entity {
    private long  t = 0;
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

    public Entity(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getOrient() {
        return orient;
    }

    public void draw(Graphics2D g2d) {
        g2d.drawImage(img, x, y, null);
    }

    public void move(int speed, ArrayList<Maptank> maptanks) {
        int xR = x;
        int yR = y;
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
        boolean check = checkMap(maptanks);
        if (check == false) {
            x = xR;
            y = yR;
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
        for (Maptank map: arr) {
            if (map.getBit() == 0 || map.getBit() == 7) {
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
        for (int i = arrBullet.size()-1;i>=0;i--) {
            if(arrBullet.get(i).checkBoomBullet(getRect())){
                arrBullet.remove(i);
                return true;
            }
        }

//        for (Bullet b : arrBullet) {
//            if (b.checkBoomBullet(getRect())) {
//                return true;
//            }
//        }
        return false;
    }

    public void Fire(ArrayList<Bullet> bullets){
        long T = System.currentTimeMillis();
        if(T - t < 100){
            return;
        }
        t = T;
        int xP = img.getWidth(null)/2 + getX() -3;
        int yP = img.getHeight(null)/2 + getY() -3;
        Bullet bullet = new Bullet(xP,yP,getOrient());
        bullets.add(bullet);
    }
}

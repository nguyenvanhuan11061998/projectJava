package com.t3h.Model;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class Maptank {
    private int x;
    private int y;
    private int bit;

    private Image[] images = {
            new ImageIcon(getClass().getResource("/sound/image/map.jpg")).getImage(),   //  0
            new ImageIcon(getClass().getResource("/sound/image/boundMap.png")).getImage(),//1
            new ImageIcon(getClass().getResource("/sound/image/heart.png")).getImage(), //  2
            new ImageIcon(getClass().getResource("/sound/image/grass.png")).getImage(), //  3
            new ImageIcon(getClass().getResource("/sound/image/brick.png")).getImage(),//   4
            new ImageIcon(getClass().getResource("/sound/image/tree.png")).getImage(),//    5
            new ImageIcon(getClass().getResource("/sound/image/BackGround2.jpg")).getImage(),// 6
            new ImageIcon(getClass().getResource("/sound/image/water.png")).getImage(),//   7
            new ImageIcon(getClass().getResource("/sound/image/rock.png")).getImage(),//    8
            new ImageIcon(getClass().getResource("/sound/image/heart.png")).getImage(),//     9

    };

    public int getBit() {
        return bit;
    }

    public Maptank(int x, int y, int bit) {
        this.x = x;
        this.y = y;
        this.bit = bit;
    }

    public void draw(Graphics2D g2d){
        g2d.drawImage(images[bit],x,y,null);
    }

    /*Khởi tạo hình chữ nhật cho mỗi đối tượng trong map, trả về hình chữ nhật đó*/
    public Rectangle getRect(){
        Rectangle rect = new Rectangle(
                new Rectangle(x,y,images[bit].getWidth(null),images[bit].getHeight(null)));
        return rect;
    }

    /*Truyền vào một mảng đạn, kiểm tra nếu trùng với các bit đã chỉ định thì bỏ qua, với các bit còn lại , khởi tạo một hình chữ nhật
    * giao giữa đạn và phần tử trong map, nếu hình chữ nhật đó tồn tại, giá trị trong if là true, bit tại vị trí đó của map = 0,
    * phần tử của map tại vị trí đó biến mất*/
    public void checkBullet(ArrayList<Bullet> arr) {
        if (bit == 0) {
            return;
        }
        for (int i = arr.size() - 1; i >= 0; i--) {
            boolean check = arr.get(i).checkBoomBullet(getRect());
            if (check && (bit != 1 && bit != 8 && bit != 7)) {
                bit = 0;
                arr.remove(i);
                return;
            }
            if (check) {
                arr.remove(i);
                return;
            }
        }
    }
}

package com.t3h.ui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class
MyFrame extends JFrame implements WindowListener {    // implement: bộ sự kiện của window

    public static final int W = 1000;
    public static final int H = 600;

    public MyFrame() throws HeadlessException {
        setTitle("Buoi 8");
        setSize(W, H);
//        setLocation(200,200);
        setLocationRelativeTo(null);            //hiển thị ra giữa màn hình
        setResizable(false);            //thay đổi kích thước: không được thay đổi(false)
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);     //đưa vào chế độ muốn( DO_NOTHING_ON_CLOSE:không làm gì, hệ thống tự thoát, HIDE_ON_CLOSE: mặc định, vẫn chạy bình thường , DISPOSE_ON_CLOSE: đóng hết frame mới tắt,EXIT_ON_CLOSE: đóng một frame, chương trình  sẽ tắt, dừng hoạt động)
        addWindowListener(this);

        MyPanel panel = new MyPanel();              //cho panel hiển thị trên Frame
        add(panel);
    }


    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosing(WindowEvent e) {
        int result = JOptionPane.showConfirmDialog(
                null, "Bạn có muốn thoát không", "Thoát ứng dụng",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE
        );
        if (result == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }

    @Override
    public void windowClosed(WindowEvent e) {

    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }


}

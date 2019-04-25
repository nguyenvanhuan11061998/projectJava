package com.t3h.ui;

import javax.swing.*;
import java.awt.*;

public class MyFrame extends JFrame {
    public static final int W = 300;
    public static final int H = 400;

    public MyFrame() throws HeadlessException {
        setSize(W,H);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Buoi 9");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        MyPanel panel = new MyPanel();
        add(panel);
    }

}

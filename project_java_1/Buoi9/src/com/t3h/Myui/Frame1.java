package com.t3h.Myui;

import javax.swing.*;
import java.awt.*;
import java.util.jar.JarFile;

public class Frame1 extends JFrame {
    public static final int W = 400;
    public static final int H = 300;


    public Frame1() throws HeadlessException {
        setSize(W,H);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Login");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        Panel1 panel1 = new Panel1();
        add(panel1);
    }
}

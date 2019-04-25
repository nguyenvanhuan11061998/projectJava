package com.t3h.Myui2;

import javax.swing.*;
import java.awt.*;

public class Frame2 extends JFrame {
    public static final int W = 300;
    public static final int H = 400;

    public Frame2(String userName, String password) throws HeadlessException {
        setSize(W,H);
        setLocationRelativeTo(null);
        setResizable(false);
        setTitle("Xinchao");
        setDefaultCloseOperation(DISPOSE_ON_CLOSE);

        Panel2 panel2 = new Panel2(userName,password);
        add(panel2);
    }
}

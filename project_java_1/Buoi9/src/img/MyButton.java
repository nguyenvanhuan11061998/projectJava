package img;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyButton extends JButton implements MouseListener {
    private ImageIcon But1;
    private ImageIcon But2;
    public MyButton(String but1,String but2) throws HeadlessException {
        But1 = new ImageIcon(getClass().getResource(""));
        But2 = new ImageIcon(getClass().getResource());

        addMouseListener();
    }

    @Override
    public void mouseClicked(MouseEvent e) {

    }

    @Override
    public void mousePressed(MouseEvent e) {

    }

    @Override
    public void mouseReleased(MouseEvent e) {

    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }
}

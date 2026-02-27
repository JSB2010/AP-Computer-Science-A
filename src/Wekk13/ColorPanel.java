package Wekk13;

import javax.swing.*;
import java.awt.*;

public class ColorPanel extends JPanel {
public ColorPanel(Color backColor, int width, int height)
{
    setBackground(backColor);
    setPreferredSize(new Dimension(width,height));
}

public ColorPanel(Color backColor)
{
    setBackground(backColor);
}

public void paintComponent(Graphics g){
 // using the paint component method
     super.paintComponent(g);

    g.setColor(new Color(0, 130, 39));
    g.setFont(new Font("Times New Roman", Font.BOLD, 30));
    g.drawString("Hard work beats talent when talent doesn't work hard.", 50, 357);
    g.setColor(Color.RED);
    g.drawRect(25, 300, 750, 100);
    g.setColor(Color.BLUE);
    for (int i = 0; i < 32; i++) {
        g.fillOval( i * 25, 275, 25, 25);
    }
    for (int i = 0; i < 32; i++) {
        g.fillOval( i * 25, 400, 25, 25);
    }
    for (int i = 0; i < 4; i++) {
        g.fillOval(0, 300 + i *25, 25, 25);
    }
    for (int i = 0; i < 4; i++) {
        g.fillOval(775, 300 + i *25, 25, 25);
    }
    for (int i = 0; i < 12; i++) {
        g.drawLine(0, i * 25, 800,  i * 25);
    }
    for (int i = 0; i < 14; i++) {
        g.drawLine(0, 425 + i * 25, 800, 425 + i * 25);
    }



}
public static void main(String[] args) {
    JFrame theGUI = new JFrame();
    theGUI.setTitle("GUI Checkerboard");
    theGUI.setSize(800, 800);
    theGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    theGUI.add(new ColorPanel(new Color(3, 207, 252), 800, 800));
    theGUI.setVisible(true);
}
}
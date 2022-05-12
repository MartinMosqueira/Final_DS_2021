package model;

import java.awt.*;
import java.io.IOException;
import java.io.InputStream;


import javax.imageio.ImageIO;
import javax.swing.*;

public class HomeDark extends JFrame implements HomeButton {
    Image image;
    InputStream imgStream;

    public HomeDark(){
        super("HomeDark");
        this.setSize(250, 400);
        this.setVisible(true);
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        loadButton();
        repaint();
    }

    @Override
    public void loadButton() {
        try {
            imgStream = HomeDark.class.getResourceAsStream("../img/HomeDark.png");
            image = ImageIO.read(imgStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void paint(Graphics g) {
        Graphics g2 = (Graphics2D)g;
        g2.setColor(Color.black);
        g2.fillRect(0, 0, 250, 400);
        g2.drawImage(image, 100, 50, 70, 70, null);
    }

}

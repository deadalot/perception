package com.perception;

;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class Perception extends JPanel {

    private static String VERSION = "0.0.1 a";
    int x = 0;
    int y = 0;


    public static void main(String[] args) throws InterruptedException {

        JFrame frame = new JFrame("Perception - " + VERSION);
        Perception game = new Perception();

        frame.add(game);
        frame.setSize(300, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        System.out.println("Pannkakor");

        // Game loop
        while (true) {
            game.moveBall();
            game.repaint();
            Thread.sleep(10);
        }
    }


    private void moveBall() {
        int moveRight = 0;
        int moveDown = 0;
        int moveLeft = 0;
        int moveUp = 0;
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        if (input.contains("d")) {
            moveRight++;
        }
        if (input.contains("s")) {
            moveDown++;
        }
        if (input.contains("w")){
            moveUp++;
        }
        if (input.contains("a")){
            moveLeft++;
        }
        x += moveRight;
        y += moveDown;
        x -= moveLeft;
        y -= moveUp;
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.fillOval(x, y, 90, 30);
    }


}


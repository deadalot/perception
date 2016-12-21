package com.perception;

;

import com.perception.input.InputManager;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.KeyEvent;
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

        JPanel panel = new JPanel();
        frame.getContentPane().add(panel);
        InputManager input = new InputManager();
        panel.addKeyListener(input);

        Perception game = new Perception();



        frame.add(game);
        frame.setSize(300, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        System.out.println("Pannkakor");

        panel.setFocusable(true);
        panel.requestFocusInWindow();

        boolean isRunning = true;

        // Game loop
        while (isRunning) {

            isRunning = game.moveBall(input);

            game.repaint();

            Thread.sleep(10);
            
        }

        System.exit(0);
    }


    private boolean moveBall(InputManager input) {
        int moveRight = 0;
        int moveDown = 0;
        int moveLeft = 0;
        int moveUp = 0;
       // Scanner scanner = new Scanner(System.in);
       // String input = scanner.nextLine();
        if (input.isPressed(KeyEvent.VK_D)) {
            moveRight++;
        }
        if (input.isPressed(KeyEvent.VK_S)) {
            moveDown++;
        }
        if (input.isPressed(KeyEvent.VK_W)) {
            moveUp++;
        }
        if (input.isPressed(KeyEvent.VK_A)) {
            moveLeft++;
        }
        if (input.isPressed(KeyEvent.VK_ESCAPE)) {
            return false;
        }
        x += moveRight;
        y += moveDown;
        x -= moveLeft;
        y -= moveUp;

        return true;
    }


    @Override
    public void paint(Graphics g) {
        super.paint(g);
        Graphics2D g2d = (Graphics2D) g;
        g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        g2d.fillOval(x, y, 90, 30);
    }


}


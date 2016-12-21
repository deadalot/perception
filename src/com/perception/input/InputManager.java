package com.perception.input;


import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class InputManager extends KeyAdapter {


    Keys keys = new Keys();

    public void keyPressed(KeyEvent e){
        keys.press(e.getKeyCode());
    }

    public void keyReleased(KeyEvent e){
        keys.release(e.getKeyCode());
    }

    public boolean isPressed(int keyCode){
        return keys.isPressed(keyCode);
    }

}

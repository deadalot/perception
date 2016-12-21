package com.perception.input;


public class Key {

    int keyCode;
    boolean pressed;

    public Key(int keyCode){
        this.keyCode = keyCode;
        this.pressed = false;
    }

    public void press(){
        pressed = true;
    }

    public void release(){
        pressed = false;
    }

    public boolean isPressed(){
        return pressed;
    }

    public int getKeyCode(){
        return keyCode;
    }
}

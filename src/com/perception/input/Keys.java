package com.perception.input;

import java.awt.event.KeyEvent;
import java.util.ArrayList;

/**
 * Created by tonykronqvist on 2016-12-21.
 */
public class Keys {

    ArrayList<Key> keys =  new ArrayList<Key>();

    public Keys() {

        keys.add(new Key(KeyEvent.VK_A));
        keys.add(new Key(KeyEvent.VK_D));
        keys.add(new Key(KeyEvent.VK_W));
        keys.add(new Key(KeyEvent.VK_S));
        keys.add(new Key(KeyEvent.VK_ESCAPE));
        // LÄgg till nya keys HÄR :D
    }

    public void press(int keyCode){
        for(Key k : keys ){
            if(k.getKeyCode() == keyCode){
                k.press();
                break;
            }
        }
    }

    public void release(int keyCode){
        for(Key k : keys ){
            if(k.getKeyCode() == keyCode){
                k.release();
                break;
            }
        }
    }

    public boolean isPressed(int keyCode){
        for(Key k : keys ){
            if(k.getKeyCode() == keyCode){
                return k.isPressed();
            }
        }
        return false;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package slickexample;

import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;

/**
 *
 * @author billyjoel
 */
class AngryFace1 {
    public int x;
    public int y;
    public static boolean isvisible = true;
    Image currentImage;
    Shape hitbox;
    Image Angryface = new Image("res/Face.png");
    	AngryFace1 (int a, int b) throws SlickException {
    	this.x = a;
    	this.y = b;
    	this.hitbox = new Rectangle(a, b, 50, 50);// 64 is the width of the item
    	this.currentImage = Angryface;
        }
}

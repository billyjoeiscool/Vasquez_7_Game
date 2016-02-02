/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package steal;

import org.newdawn.slick.Animation;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;

/**
 *
 * @author billyjoel
 */
public class Player {
    public static float x = 96f;

	public static float y = 64f;

	public static int health = 10000;
	
	public static float speed = .550000f;

	static float hitboxX = x + 10f;

	static float hitboxY = y + 10f;

	private static int startX, startY, width = 30, height = 42;

	public static Shape rect = new Rectangle(getplayershitboxX(),
			getplayershitboxY(), width, height);

	public static float pdelta;

	public static Animation playeranime;

	public static void setpdelta(float somenum) {

		pdelta = somenum;

	}

	public static float getpdelta() {

		return pdelta;

	}

	public static float getplayersX() {

		return x;

	}

	public static float getplayersY() {

		return y;

	}

	public static float getplayershitboxX() {

		return x + 10f;

	}

	public static float getplayershitboxY() {

		return y + 10f;

	}

	public static void setplayershitboxX() {

		hitboxX = getplayershitboxX();

	}

	public static void setplayershitboxY() {

		hitboxY = getplayershitboxY();

	}

}





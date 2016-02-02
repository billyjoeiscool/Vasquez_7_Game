/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package steal;
import org.newdawn.slick.Image;
/**
 *
 * @author billyjoel
 */
import org.newdawn.slick.SlickException;
import org.newdawn.slick.geom.Rectangle;
import org.newdawn.slick.geom.Shape;
public class orb {
    private int x, y, width,height;

    private boolean isVisible;
    Image orbpic;
    Shape hitbox;
    public orb(int a, int b)throws SlickException{
        this.isVisible = false;
        this.x = a;
        this. y = b;
        this.orbpic= new Image ("res/orbs/Ninja_12.png");
        this.hitbox = new Rectangle (x,y,32,32);
        
    }

    
    
    //getters and stters are a common in java a design
    // guldeline in java, and object oriented 
    //programming in general, is to encapsulate/isolate
    //values as much as possible
    // getters- are methods used to query the value of instance
    //variables.
    //this.getLocationx();
    //Setters - methiods that set values for instance
    //variables

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public boolean isIsVisible() {
        return isVisible;
    }

    public void setIsVisible(boolean isVisible) {
        this.isVisible = isVisible;
    }

    public Image getOrbpic() {
        return orbpic;
    }

    public void setOrbpic(Image orbpic) {
        this.orbpic = orbpic;
    }

    public Shape getHitbox() {
        return hitbox;
    }

    public void setHitbox(Shape hitbox) {
        this.hitbox = hitbox;
    }
    
public void setlocation(int a,int b) {
}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interactivefiction;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author billyjoel
 */
public class InteractiveFiction {
static boolean playgame2;
static String Right = "wimp";
static String Wrong = "boss";
static boolean playgame3;
static String username;
static Random fandom = new Random();
static boolean playgame;
static boolean playgame4;
static int counter=1;
static int exit = 43110;
static String userinput;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        playgame = true;
       
                System.out.println("You wake up in a forest you walk down path that is strangle blury as you take in the view You feel the need the write your name on the tree that allready has your name on it a number of times");
                Scanner userinputname = new Scanner(System.in);
                username = userinputname.next();
                System.out.println("" + username + " as put in what you think your name is you hear sceaming you go to see whats up and YOU SEE A WIZARID KILLING PEOPLE What do you do boy run to take the wand or go to the police station like a wimp type wimp to to go to the police or type boss to run to the wand");
                Scanner useranswer = new Scanner(System.in);
                userinput = useranswer.next();
                 if (userinput == null ? Right == null : userinput.equals(Right)){
            System.out.println ("you run away like a wimp to the police you get there and slades there taking it over a cop pass you a gun and tells you to kill him what do you do type wimp and run to your mommy or type boss so you can stay and try to shoot slade ");
            Scanner useranwer = new Scanner(System.in);
            userinput = useranwer.next();
            if (userinput == null ? Right == null : userinput.equals(Right)){
                System.out.println("dang it " + username + " you were so close to being a boss oooh but what is this what is this your house is burned your mommy died oh boo hoo (you look at the house in ruin but there's a gun you pit it up you put it to your head) no! don't do that get over this go back and kill slade haeack even the wizarid just don't kill your self(type wimp for killd your self or boss for try to kill slade)");
                 playgame = true;
                 }else if (userinput == null ? Wrong == null : userinput.equals(Wrong)){
                     System.out.println("HAHAHAHAHAHAHAHAHAHA YOU SHOT AND MISS HAHAHAHAH WHAT A JOKE KID YOU THOUGHT YOU COULD KILL SLADE  ");
            playgame = false;
        }else if (userinput == null ? Wrong == null : userinput.equals(Wrong)){
            System.out.println("again You fool you triped on a rock and cracked your head open while running you will never win and I will keep killing you ");
            playgame =false;
            
                        
          while (playgame==true){
              
    }
    
}
    }
}
}
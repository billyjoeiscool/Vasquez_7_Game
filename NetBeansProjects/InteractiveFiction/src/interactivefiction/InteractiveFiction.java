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
static String yes ="s";
static String not ="g";
    static String no ="no";
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
static String gamestart ="start";
static String bonus = "me";
static String jump ="determination";
    /**
     * @param args the command line argumen
     */
    public static void main(String[] args) {
       playgame = true;
       start();
       level1();
       part2();                         
       part3();
       bonus();
       newlevel();                                                            
       
    }
    public static void start(){
        System.out.println("Would you like to take a nap? type start to go to sleep or no to not go to sleep");
        Scanner userplay = new Scanner(System.in);
         userinput = userplay.next();
         
         if (userinput == null ? gamestart == null : userinput.equals(gamestart)){
             System.out.println(" GOOOOOOoooood " );
                level1();
         }  else{
             if(userinput == null ? no == null : userinput.equals(no)){
         
             System.out.println("too bad I am your mother and you will do as I say " );
                level1();
         }else {
               if(userinput == null ? jump == null : userinput.equals(jump)) {
                   bonus();
               }else {    
             start();    
                 
    }
         }
        }
        }

         public static void level1() {
                System.out.println("You wake up in a forest you hear a voice in your head thats me but you don't care yet so "
                        + "you walk down path that is strangle blury as you take in the view You feel the need the write your name on "                              
                        + "the tree that allready has your name on it a number of times");
                Scanner userinputname = new Scanner(System.in);
                username = userinputname.next();
                if (username == null ? jump == null : username.equals(jump)){
                    bonus();
                }else {
                System.out.println("" + username + " as put in what you think your name is you hear sceaming "
                        + "you go to see whats up and YOU SEE A WIZARID KILLING PEOPLE What do you do boy run to take the wand or go "                             
                        + "to the police station like a wimp type wimp to to go to the police or type boss to run to the wand");
                Scanner useranswer = new Scanner(System.in);
                userinput = useranswer.next();
                
                
                 
                 if (userinput == null ? Right == null : userinput.equals(Right)){
            System.out.println ("you run away like a wimp to the police you get there and slade is there"
                    + " taking it over a cop pass you a gun and tells you to kill him what do you do type wimp and run to your mommy or "
                    + "type boss so you can stay and try to shoot slade ");
            Scanner useranwer = new Scanner(System.in);
            userinput = useranwer.next();
           part2();
             }else if (userinput == null ? Wrong == null : userinput.equals(Wrong)){
            System.out.println("again You fool you triped on a rock and cracked your head open while running you will never win and I will keep killing you ");
            start();
             }else {
                    level1();
                
                 
              
            
                     }
                 playgame = true;
            
            
        
        
                 }
                }
         
public static void part2() {
          if (userinput == null ? Right == null : userinput.equals(Right)){
                System.out.println("dang it " + username + " you were so close to being a boss oooh but what is this what is this your house"
                        + " is burned your mommy died oh boo hoo (you look at the house in ruin but there's"
                        + " a gun from the cop you put it up to your head) no! don't do that get over this go back and kill "
                        + "slade haeack even the wizarid just don't kill your self(type wimp for killd your self or boss for try to kill slade)");
                Scanner useranwer = new Scanner(System.in);
            userinput = useranwer.next();
            part3();
                 
                 
                 }else if (userinput == null ? Wrong == null : userinput.equals(Wrong)){
                     System.out.println("HAHAHAHAHAHAHAHAHAHA YOU SHOT AND MISSED HAHAHAHAH WHAT A JOKE KID YOU THOUGHT YOU COULD KILL SLADE"
                             + " HE JUST SHOT YOU IN THE HEAD WHEN YOU WALKED IN ");
                     start(); 
                        }else{
                        part2();
              
          }
        }

    public static void part3() {
        if (userinput == null ? Right == null : userinput.equals(Right)){
                         System.out.println("did you know this was the only way or did you kill "
                                + "your self because you thought"
                                 + " you were a loser you wake up in your mom's arms and yeah "
                                + "you beat the voice in your head ");
                         System.out.println("");
                         bonus();
                     }else if (userinput == null ? Wrong == null : userinput.equals(Wrong)){
                     System.out.println("HAHAHAHAHAHAHAHAHAHA YOU SHOT AND MISS "
                                + "HAHAHAHAH WHAT A JOKE KID YOU THOUGHT YOU COULD KILL SLADE  ");                                         
                     start();
                        }else{
                        part3();
    }
}
    public static void bonus(){
        System.out.println("ya! you won time for you to try the to unlock the bonus level in order to do this you must "
                + "type the name of the voice in your head in the last game");
         Scanner useranwer = new Scanner(System.in);
            userinput = useranwer.next();
             if (userinput == null ? bonus == null : userinput.equals(bonus)){
                 System.out.println("You did it YAAAAAAAA!!!!!!! now good luck"
                         + "[:");
                 newlevel();
             } else{
                 System.out.println("you suck you didn't rember the name go play again and type determination when you are asked to go to sleep  ");
                 start();
                
                        
    }
    
}
    public static void newlevel(){
        System.out.println("(some one tells you) welcome to hell " + username + "  you wake "
                + "up and you are the the coolest man that ever lived you look around theres a "
                + "gal yelling at you"
                + " in order"
                + " to escape hell you must pass a trial now go thought the"
                + " tunnel(g to stay s to go to the tunnel)");
        Scanner useranwer;                                                    
    useranwer = new Scanner(System.in);
        userinput = useranwer.next();
                if (userinput == null ? yes == null : userinput.equals(yes)){
               System.out.println("now "+ username +" must fight the DEVIL'S!!! SON'S! "
                       + "COUSAN's friend's mom and she has cake thats on FIRE!!!!!!!! and"
                + " she tossed it at you what do you do use your powers(type g to fly s for "
                       + "giga beam)");
                   Scanner useranswer = new Scanner(System.in);
                userinput = useranswer.next();
                fight();
                }else if (userinput == null ? not == null : userinput.equals(not)){
                System.out.println("" + username + "");
                Scanner useranswer = new Scanner(System.in);
                userinput = useranswer.next();
                  fightr2();
                
                }else{
                    newlevel();
    }
        }
    public static void fight(){
        if (userinput == null ? yes == null : userinput.equals(yes)){
            System.out.println("Yoou killed her "+username+" but you used all your life energy on that one move and your X_X");
            newlevel();
        }else if(userinput == null ? not == null : userinput.equals(not)){
            System.out.println("you fly high up and dodge the cake ,but the cake follows you quick use your powers(g to use giga beam s to use your sword of truth) ");
            Scanner useranswer = new Scanner(System.in);
                userinput = useranswer.next();
            fight2();
                }else{
                        fight();
}   
}
    public static void fightr2(){
        System.out.println("CUT cut you neet tunnel ok dang it action");
        newlevel();
        
}

    public static void fight2() {
        if (userinput == null ? not == null : userinput.equals(not)){
            System.out.println("you used too much life energy all you did was pass out and she ate you alive");
        newlevel();
        }else if(userinput == null ? yes == null : userinput.equals(yes)){
            System.out.println("the sword of truth stops time to ask queschion True or false are you the best around (g for no s of yes) ");
                Scanner useranswer = new Scanner(System.in);
                userinput = useranswer.next();
                fight3();
                }else{
                        fight2();
    }
}

public static void fight3() {
        if (userinput == null ? not == null : userinput.equals(not)){
            System.out.println("WOW you need some more self confedence man so I will give you alot"
                 + " life energy to help(type s giga beam type g sword of truth)");
        Scanner useranswer = new Scanner(System.in);
                userinput = useranswer.next();
                winlose();
        }else if(userinput == null ? yes == null : userinput.equals(yes)){
            System.out.println("Cool than you can use atomic slash(use atomic slash use sword of truth) ");
                Scanner useranswer = new Scanner(System.in);
                userinput = useranswer.next();
                fightl3();
                }else{
                        fight3();
        }
}
public static void fightl3() {
        if (userinput == null ? not == null : userinput.equals(not)){
            System.out.println("why did you spit an atom"+username+" and expected TO LIVE");
        
        }else if(userinput == null ? yes == null : userinput.equals(yes)){
            System.out.println("you were not the best around thats why you lossed battle you sould have told the truth ");
               newlevel();
}
}
public static void winlose() {
        if (userinput == null ? yes == null : userinput.equals(yes)){
            System.out.println("you havd enough life energy to kill hell and you woke up");
       
                
        }else if(userinput == null ? not == null : userinput.equals(not)){
            System.out.println("rember your not the best around you lost the cake got you on the frist swing ");
               newlevel();
                }else{
                        winlose();
        }
}
}


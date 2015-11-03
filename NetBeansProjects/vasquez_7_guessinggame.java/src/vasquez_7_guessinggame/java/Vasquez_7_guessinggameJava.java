/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vasquez_7_guessinggame.java;

import java.util.Random;
import java.util.Scanner;



/**
 *
 * @author billyjoel
 */
public class Vasquez_7_guessinggameJava {
static int magicnumber;
static int usernumber;
static String username;
static Random fandom = new Random();
static boolean playagain;
static int userguess;
static int counter=1;
static int exit = 43110;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        playagain = true;
        magicnumber = fandom.nextInt(10);
        System.out.println("Hello, person like to play game of life and DEATH!!!");
                System.out.println("BUT before that what is you name?");
                Scanner userinputname = new Scanner(System.in);
                username = userinputname.next();
                System.out.println("Good luck " + username + " your going to need it bahahahaha");
          while (playagain==true){
              playgame();
          }      
    }
    
    static void playgame (){
        if (counter == 15) {
            playagain = false;
            
        }
        Scanner userinputnumbers = new Scanner(System.in);
        System.out.println("now pick a number one thougth ten if you DARE AHAHAHAHAH!");
        userguess = userinputnumbers .nextInt();
        if (magicnumber == userguess){
            System.out.println ("you have guessed the....right....number..oh no AM MELTING AHHHHHHHHH!");
            playagain =false;
        }else if (magicnumber > userguess){
            System.out.println("Too low! Try again just so watch you fail again."+ (15-counter)+" turns left");
            counter++;
       
        
        } else {
            System.out.println("Too High! hahahah try again again so I can once again watch you fail "+ (15-counter)+" turns left");
            counter++;
        }
        
    
    
    }
    
   
}
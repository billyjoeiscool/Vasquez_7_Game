/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vasquez_7_challenge0;



/**
 *
 * @author billyjoel
 */
public class Vasquez_7_Challenge0 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int somenumber;
	        for (somenumber = 0; somenumber < 500; somenumber++) {
	            if (isDivisibleByFiftyFive(somenumber)) {
	                System.out.println(somenumber + "Animate this");
	            } else if (isDivisibleByTwentyTwo(somenumber)) {
	
	                System.out.println(somenumber + "ninja");
	            } else if (isDivisibleByThirtyThree(somenumber)) {
	            
	            System.out.println(somenumber + "Herr Direktor");  
	            } else if (isDivisibleByFive(somenumber)){
	                      
	             System.out.println(somenumber + "Vidal");
	            } else if (isDivisibleByThree(somenumber)){
	                System.out.println(somenumber + "Claughton");
	                
	            } else if (isDivisibleByTwo(somenumber)){
	                System.out.println(somenumber + "Davis");
	               
	            }  else if (isDivisibleByThree(somenumber) & isDivisibleByTwo(somenumber)){
	                System.out.println(somenumber + "chisme");
	                
	            } else if (isDivisibleByThree(somenumber) & isDivisibleByFive(somenumber)){
	                System.out.println(somenumber + "Old School");
	                
	            } else if (isDivisibleByTwo(somenumber) & isDivisibleByThree(somenumber) & isDivisibleByFive(somenumber)){
	  }                System.out.println(somenumber + "Team Building");
	        }
	        
	    }
	
	    static boolean isDivisibleByTwo(int J) {
	        return (J % 2 == 0);
	
	    }
	
	    static boolean isDivisibleByTwentyTwo(int O) {
	        return (O % 22 == 0);
	    }
	
	    static boolean isDivisibleByThree(int E) {
	        return (E % 3 == 0);
	    }
	
	    static boolean isDivisibleByThirtyThree(int L) {
	        return (L % 33 == 0);
	    }
	
	    static boolean isDivisibleByFive(int T) {
	        return (T % 5 == 0);
	    }
	
	    static boolean isDivisibleByFiftyFive(int V) {
	        return (V % 55 == 0);
	    }
	
	        
	    }   
    
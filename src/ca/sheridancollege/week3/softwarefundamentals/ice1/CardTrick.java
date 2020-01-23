/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Random;
import java.util.Scanner;
 

/**
 * A class that fills a magic hand of 7 cards with random Card Objects
 * and then asks the user to pick a card and searches the array of cards
 * for the match to the user's card. To be used as starting code in ICE 1
 * @author srinivsi
 Anousheh niazi 991524576
 */
public class CardTrick {

    public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
        Card[] magicHand = new Card[7];
         Card[] userHand = new Card[1];
        
        for (int i=0; i<magicHand.length; i++)

        {
             Card c = new Card();
             c.setValue(c.randValue());
             c.setSuit(Card.SUITS[c.randSuit()]);  
             
             
        }

        
        System.out.println("please insert a value");
        int a=scan.nextInt();
        
        System.out.println("please insert a suit");
        String b=scan.next();
        
         for (int i=0; i<userHand.length; i++)

        {
             Card c = new Card();
             c.setValue(a);
             c.setSuit(b);
              System.out.println(a+b);
             
        }
         
       
       if(userHand[0]!=magicHand[0]||userHand[0]!=magicHand[1]
               ||userHand[0]!=magicHand[2]||userHand[0]!=magicHand[3]
               ||userHand[0]!=magicHand[4] ||userHand[0]!=magicHand[5]||userHand[0]!=magicHand[6]){
           System.out.println("Approved!");
       }
       else{
            System.out.println("NOT Approved!");
       }

    }

 
     

}

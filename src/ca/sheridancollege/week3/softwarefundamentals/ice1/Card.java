/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week3.softwarefundamentals.ice1;
import java.util.Random;
/**
 * A class that models playing card Objects. Cards have 
 * a value (note that Ace = 1, Jack -11, Queen =12, King = 13)
 * A suit (clubs, hearts, spades, diamonds).
 * There are 52 cards in a deck, no jokers.
 * This code is to be used in ICE1. When you create your own branch,
 * Modifier: ANOUSHEH NIAZI 991524576
 * @author srinivsi
 */
public class Card {

   private String suit; //clubs, spades, diamonds, hearts
   private int value;//1-13
  
   
   public static final String [] SUITS = {"Hearts", "Diamonds", "Spades", "Clubs"};
   //public static final int[] VALUE = {1,2,3,4,5,6,7,8,9,10,11,12,13};
   
  
    
    /**
     * @return the suit
     */
    public String getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(String suit) {
        this.suit = suit;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }
    
   @Override
        public String toString() {
            return "Card{" +
                    "value=" + value +
                    ", suit=" + suit +
                    '}';
        }

      public int randValue(){
          int rand =(int)(Math.random() * 13)+1; 
           System.out.print(rand);
          return rand;
      }
      public int randSuit(){
          int randomS = (int)(Math.random()* SUITS.length);
           String randomElement = SUITS[randomS];
           System.out.println(randomElement);
           return randomS ;
      }
      
}
    


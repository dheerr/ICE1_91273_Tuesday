/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cardgame;

/**
 *
 * @author dsi1100
 */
public class CardTrick
{
    public static void main(String[] args) 
    {
        CardGame[] magicHand = new CardGame[7]; //array of objects
        for(int i=0; i<magicHand.length; i++)
        {                   
        CardGame c1 = new CardGame(); //object
        c1.setValue(c1.ranValue());//random number from one to thirteen
        c1.setSuit(CardGame.SUITS[c1.ranSuit()]);
        
        magicHand[i] = c1;
        }
        for(int i=0; i<magicHand.length; i++)
        {
        System.out.println(magicHand[i].getSuit()+" "+ magicHand[i].getValue());
        }
        //take input suit and value from user. Compare with already card in the 
        //array and print your card is found.
        }
                
    
    }
    


/*
File Card.java

I affirm that this program is entirely my own work and none of it is the work of another person.

Daniela Agueros!
6185850
COP 3337 U04
*/

/**
 * The Card class creates a card with a rank and a suit. 

 * @author vioda
 */
public class Card 
{
    private int test;
    private int faceValue ; //rank of card
    private int suitValue ; //suit of card
    
    /**
     * Creates a card with a suit and rank.
     * Makes private integers faceValue and suitValue equal to parameters.
     * @param faceVal the rank value.
     * @param suitVal the suit value.
     */
    public Card (int faceValue, int suitVal) 
    {  
        faceValue = faceValue ; 
        suitValue = suitVal ;
}
    /**
     * Returns the integer faceValue of a card.
     * @return the rank value.
     */
    public int getRank()
    {
        return faceValue ; 
    }
    
    /**
     * Returns the integer suitValue of a card.
     * @return the face value.
     */
    public int getSuit()
    {
        return suitValue ;
    }
    
    /**
     * Converts integers faceValue and suitValue into strings.
     * Adds rank and suit together to create a card.
     * @return card as a string.
     */
    public String toString()
    {
        String suit = "" ;  //declares suit 
        String rank = "" ; //declares rank
        
        if (faceValue == 2) //converts int 2 to string
        {
            suit = "2" ; 
        }
        
        if (faceValue == 3) //converts int 3 to string
        {
            suit = "3" ; 
        }
        
        if (faceValue == 4) //converts int 4 to string
        {
            suit = "4" ; 
        }
        
        if (faceValue == 5) //converts int 5 to string
        {
            suit = "5" ; 
        }
        
        if (faceValue == 6) //converts int 6 to string
        {
            suit = "6" ;
        }
        
        if (faceValue == 7) //converts int 7 to string
        {
            suit = "7" ;
        }
        
        if (faceValue == 8) //converts int 8 to string
        {
            suit = "8" ;
        }
        
        if (faceValue == 9) //converts int 9 to string
        {
            suit = "9" ;
        }
        
        if (faceValue == 10) //converts int 10 to string
        {
            suit = "10" ;
        }
        
        if (faceValue == 11) //converts int 11 to string J
        {
            suit = "J" ;
        }
        
        if (faceValue == 12) //converts int 12 to string Q
        {
            suit = "Q" ;
        }
        
        if (faceValue == 13) //converts int 13 to string K
        {
            suit = "K" ;
        }
        
        if (faceValue == 14) //converts int 14 to string A
        {
            suit = "A" ;
        }
        
        if (suitValue == 0) //converts int 0 to string spade
        {
            rank = "♠" ;
        }
        
        if (suitValue == 1) //converts int 1 to string club
        {
            rank = "♣" ;
        }
        
        if (suitValue == 2) //converts int 2 to string diamond
        {
            rank = "♦" ;
        }
        
        if (suitValue == 3) //converts int 3 to string heart
        {
            rank = "♥" ; 
        }
        
        String card = suit + rank ; //adds the Suit and Rank together to create a card
        
        return card ; 
    }
}
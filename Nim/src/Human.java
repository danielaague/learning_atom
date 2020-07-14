/**
 * File Human.java
 * 
 * I affirm that this program is entirely of my own work
 * and none of it is the work of another person.
 * 
 * Daniela Agueros
 * 6185850
 * COP 3337 U04
 * @author vioda
 */

import java.util.Scanner ;

/**
 * The Human class gets the name and asks how many marbles they would 
 * like to remove
 * @author vioda
 */
public class Human implements Player 
{

    private String name ; //player name

    /**
     * The human method assigns a player name to a string.
     * @param name human name.
     */
    public Human(String name) 
    {
        this.name = name ; //assigns player name to human 
    }

    /**
     * Responsible for ensuring human player does not removed an illegal
     * number of marbles.
     * @param num - the size of pile
     * @return - returns how many marbles were removed by human.
     */
    public int move(int num) 
    {

        Scanner scan = new Scanner(System.in) ;
        int marblesRemoved = 0 ; //sets to 0

        System.out.println("How many marbles would you like?") ;

        if (num == 1) // if there is one marble left in pile
        {
            marblesRemoved = scan.nextInt() ; 
            // human chooses how many marbles to remove
            
            // if human tries to remove more or less than one marble
            while(marblesRemoved != 1) 
            {
                System.out.println("There is only one marble left.") ;
                marblesRemoved = scan.nextInt() ; 
                // human gets to choose again
            }
            
            return marblesRemoved; // removes final marble
        }
        
        marblesRemoved = scan.nextInt(); 
        // human chooses how many marbles to remove
        
        // ensures that human does not remove more than half and less than 1
        while (marblesRemoved < 1 || marblesRemoved > num / 2) {
            
            System.out.println("Number must be at least one"
                    + " and less than half. Try again") ;

            marblesRemoved = scan.nextInt() ; 
            // asks human to make another choice

        }

        return marblesRemoved; // returns number of marbles removed
    }

    /**
     * PlayerName method returns name of human player.
     * @return name of human player.
     */
    @Override
    public String playerName() {
        return name;
    }
}

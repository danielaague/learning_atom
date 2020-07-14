/**
 * File BelowAverageComputer.java
 * 
 * I affirm that this program is entirely of my own work
 * and none of it is the work of another person.
 * 
 * Daniela Agueros
 * 6185850
 * COP 3337 U04
 * @author vioda
 */
import java.util.Random;

/**
 * Creates a computer player that removes anywhere from one to half of pile
 * @author vioda
 */
public class BelowAverageComputer implements Player
{

    Random rand = new Random();
    String name;

    /**
     * Assigns name to Below Average Computer
     * @param name - name of BelowAverageComputer
     */
    public BelowAverageComputer(String name) 
    {
        this.name = name;
    }

    /**
     * Removes x amount of marbles from 1 to half
     * @param num number of marbles in pile.
     * @return amount removed by BelowAverageComputer.
     */
    @Override
    public int move(int num) 
    {
        int marblesRemoved = 0; // intializes to zero
        Random rand = new Random();
        
        if (num == 1) // if there is only one marble left in pile.
        {
            marblesRemoved = 1; // remove last marble.
        }
        else
        {
            marblesRemoved = rand.nextInt(num / 2) + 1;
            // remove anywhere from one to half of pile
        }
        
        return marblesRemoved; // amount removed.
    }

    /**
     * Returns name assigned to BelowAverageComputer.
     * @return name of BelowAverageComputer
     */
    @Override
    public String playerName() 
    {
        return name;
    }
}

import java.util.Random;
import javax.swing.JOptionPane;

public class Tester{
    public static void main(String args[])
   {
      OrderedList list = new OrderedList();

      Random generator = new Random();

      // insert 10 random positive 2-digit ints into the list
      for (int i = 1; i <= 10; i++)
      {
         int num = generator.nextInt(90) + 10;
         System.out.println("Inserting " + num);
         list.insert(num);
      }

      // print the list
      System.out.println("\nThe list: " + list) ;  // calls list.toString
      
      // user-enters ints to be removed from the list
      String remove = JOptionPane.showInputDialog("Enter number to remove"
                                                  + "\n(or Cancel to quit)");
      while (remove != null)
      {
         int num = Integer.parseInt(remove);
         if (list.remove(num)) // num was on the list and has been deleted
         {
            System.out.println("\n" + num + " has been deleted") ;
            System.out.println("\nThe updated list: " + list) ;         
         }
         else
         {
            System.out.println("\nLo siento, " + num + " is not on the list");
         }
         remove = JOptionPane.showInputDialog("Next number to remove?" +
                                              "\n(Cancel to quit)") ;
      }
   }
} 

   



import java.util.Scanner;//class is last arg
import java.util.Random;
/**
 * Kristopher Colson
 * 8/23/22
 * Chapter 1 Notes
 * Notes from class
 * Who helped me:
*/
public class ch1Notes
{
    /* 
     * This is code notes for ch1
     */
    public ch1Notes()
    {

    }

    
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        //basic data types
        int x = 9,y,z;
        boolean choice = false;
        char letter = 'b';
        float number2 = 9;
        double number = 8.9, number3;
        short num = 6;// Int that takes less memory
        long numbbbbber = 9999; // Int that takes more memory
        
        //These are Objects
        //Class  ID     Memory Constructor
        String  word =    new   String("Kristopher Colson");
        Integer number1 = new   Integer(47);
        Double  anumber=  new   Double(45.8);
        
        
        System.out.print(word);
        
    }
}

import java.util.Scanner;

public class Alfredo
{
    public static void main (String[] args)
    {
            Scanner keyboard = new Scanner(System.in);

            System.out.println("Enter secret code: ");
            String code = keyboard.nextLine();

            if(code.equals("banana"))
            {
                System.out.println("Thank you!");
            }
     else
        
            if(code.equals("apple"))
        {
                System.out.println("Thank you!");
        }
    else 
    {
        System.out.println("Error");
    }
    
}
}
        

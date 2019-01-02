//LargestDouble.java
//Barrett:Travelle:A00380824:csc122822
//Lab Activity: LargestDouble

/*
 *The program works accurately.
 */

import java.util.Scanner;

/**
 *This program finds and displays the largest real
 *number among all those real values entered as 
 *command-line parameters
 */ 
public class LargestDouble
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        if (args.length == 0)
        {
            System.out.print("\nHello, my name is Travelle Barrett.\n"
                    +"This program finds and displays the largest real "
                    +"number among\nall those real values entered as "
                    +"command-line parameters. If\nyou'd like to see how "
                    +"it works, enter some real numbers on the\ncommand "
                    +"line when you run it.");
            System.out.print("\nPress Enter to continue ...");
            keyboard.nextLine();
        }
        else
        {
            double max = Double.MIN_VALUE, maxIndex = 0;
            for (int i = 0; i < args.length; i++)
            {
                if (Double.parseDouble(args[i]) > max)
                {
                    max = Double.parseDouble(args[i]);
                    maxIndex = i;          
                }   
            }
            System.out.print("\nHello, my name is Travelle Barrett.");
            System.out.println("\nThe largest value you entered (to one "
                    +"decimal place) is " + max + ".");
            System.out.print("Press Enter to continue ...");
            keyboard.nextLine();
        }
    }
   
}

        
    
    
    
    
    
    







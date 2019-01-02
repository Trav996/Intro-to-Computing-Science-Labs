//Hello.java

import java.util.Scanner;

public class Hello
{
    public static void main(String[] args)
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Hello, my name is Travelle Barrett.");
        System.out.print("\nPress Enter to continue ... ");
        keyboard.nextLine();  
        System.out.print("\nHow many hours do you study per week? ");
            int hours = keyboard.nextInt();
        keyboard.nextLine();
    }
}


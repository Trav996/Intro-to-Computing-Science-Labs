//AddSubtract.java
//Barrett:Travelle:A00380824:csc122822
//Lab Activity: AddSubtract

/*
 *The program works accurately.
 */

import java.util.Scanner;

/**
 *A program to add or subtract two integers entered on the command line.
 */ 

public class AddSubtract
{
    public static void main(String [] args)
    {
        if (args[1].contains("+"))
        {
            int sum;
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[2]);
            sum = num1 + num2;
            System.out.println(args[0] + " + " + args[2] + " = " + sum);
        }
        else if (args[1].contains("-"))
        {
            int subtract;
            int operand1 = Integer.parseInt(args[0]);
            int operand2 = Integer.parseInt(args[2]);
            subtract = operand1 - operand2;
            System.out.println(args[0] + " - " + args[2] + " = " + subtract);
        }
        else if (!(args[1].matches("\\d+")))
        {
            System.out.println(args[1] + " is a(n) invalid operator.");
        }

    }
}

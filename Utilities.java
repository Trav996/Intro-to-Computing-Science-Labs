//CSCI 1228 Lab Activity: numberOfDigitsDivisibleBy3
//Barrett:Travelle:A00380824:csc1226


import java.util.Scanner;

public class Utilities
{
    public static void main(String[] args)
    {
        for(int i = 0; i < args.length; i++)
        {
            System.out.println(numberOfDigitsDivisibleBy3(Integer
                        .parseInt(args[i]))); 
        }
    }

    /**
     Computes and returns the number of digits in an 
     integer n that are divisible by (or equivalently, multiples of) 3. 
     For example, if the input value is 2468, the returned value must be 1,
     while if the input value is 123456789, the returned value must be 3.
     @param n Contains a non-negative integer.
    */
    public static int numberOfDigitsDivisibleBy3
    (
     int n //in
    )
    {
        if (n % 3 == 0)
        {
            return n++;
        }
        else
        {
            return n / numberOfDigitsDivisibleBy3(n - 1);   
        }
        //return count;    
   }

}

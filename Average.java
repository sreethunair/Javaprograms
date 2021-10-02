/* Aim: Find the average of N positive integers, raising a user defined exception for each negative input.*/

import java.io.*;
import java.util.Scanner;
 class NegativeInputException  extends Exception  
{  
    public void show()  
    {  
      
      System.out.println("User Exception Catched:" );
       System.out.println("Enter the positive number only "); 
          
    }  
}

class Average
{
 public static void main(String arg[])
  {
    int sum=0,a,N;
    float avg=0;
  Scanner sc= new Scanner(System.in);
  System.out.println("Enter the limit");
  N=sc.nextInt();
  try
   {
     for(int i=1;i<=N;i++)
      {
         System.out.print("Enter input number " + (i + 1) + ": ");
         a = sc.nextInt();
        if(a < 0 )
          throw new NegativeInputException();
        sum=sum+a;
       }
     avg=sum/N;
    System.out.println("The average of "+ N +" numbers :"+avg);
    }
   catch(NegativeInputException e)
      {
        e.show();  
      }

   }
}
 


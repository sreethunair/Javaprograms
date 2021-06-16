import java.io.*;
import java.util.*;
class string
{
  public static void main(String[] args)
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the  string1:");
    String str1=sc.nextLine();
   System.out.println("Enter the string2:");
    String str2=sc.nextLine();
     System.out.println("\t");
    System.out.println("String1:"+str1);
    System.out.println("String2 :"+str2);
    System.out.println("\n");
    int len = str1.length();
    System.out.println("The length of string1: " +len);
    System.out.println("\n");
    String con = str1.concat(str2);
    System.out.println("Concatenation string: " + con);
    System.out.println("\n");
    char c=str2.charAt(3);
    System.out.println("The third character of "+str2+" is "+c);
     System.out.println("\n");
     if(str1.equals(str2))
      System.out.println( "Both strings  are equal");
   else
    System.out.println("Both strings  are not equal");
 }
}

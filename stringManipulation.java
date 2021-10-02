import java.util.*;
class stringManipulation
{
  public static void main(String[] args)
  {
   Scanner sc=new Scanner(System.in);
   System.out.println("Enter the 1st string:");
    String str1=sc.nextLine();
    System.out.println("Enter the 2nd string:");
    String str2=sc.nextLine();
    System.out.println("The 1st string is:"+str1);
    System.out.println("The 2nd string is:"+str2);
    int len = str1.length();
    System.out.println("The length of 1st string is: " +len);
   String join = str1.concat(str2);
    System.out.println("After Joined String is: " + join);
     char c=str2.charAt(3);
      System.out.println("The 3rd character of "+str2+" is "+c);
     if(str1.equals(str2))
      System.out.println( "The two string "+str1+" and "+str2+" are equal");
   else
    System.out.println("The two string "+str1+" and "+str2+"  are not equal");
 }
}
import java.io.*;
import java.util.*;
class sort
{
 public static void main(String arg[])
 {
  String temp;
  int i,j,n;
  Scanner sc=new Scanner(System.in);
  System.out.print("Enter no.of elements:");
  n = sc.nextInt();
  String a[]=new String[n];
  Scanner s1 = new Scanner(System.in);
  System.out.println("Enter the names:");
  for(i=0;i<n;i++)
   {
     a[i]=s1.nextLine();
   }
  for(i=0;i<n;i++)
   {
    for(j=i+1;j<n;j++)
     {
       if(a[i].compareTo(a[j])>0)
         {
           temp=a[i];
           a[i]=a[j];
           a[j]=temp;
         }
      }
   }
  System.out.println("1st element of the array is:"+a[0]);
  for(i=0;i<n-1;i++)
  { 
     System.out.print(a[i] + ",");
  }
 System.out.println(a[n-1]);
}
}
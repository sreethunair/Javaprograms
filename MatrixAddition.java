import java.io.*;
import java.util.*;
class MatrixAddition
{
  public static void main(String args[])
  {
  int i,j,m1,m2,n1,n2;
  int a[][] = new int[10][10],b[][] = new int[10][10],c[][] = new int[30][30];
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter the no.of rows and columns in 1st matrix : ");
  m1=sc.nextInt();
  n1=sc.nextInt();
  System.out.println("Enter the no.of rows and columns in 2nd matrix : ");
  m2=sc.nextInt();
  n2=sc.nextInt();
  System.out.println("Enter the elements of matrix1 : ");
  for(i=0;i<m1;i++)
   {
    for( j=0;j<n1;j++)
    {
      a[i][j]=sc.nextInt();
     }
    }
  System.out.println("Matrix1 : ");
  for(i=0;i<m1;i++)
   {
    for(j=0;j<n1;j++)
    {
      System.out.print(a[i][j]+" ");
     }
    System.out.println();
    }
  
  System.out.println("\n Enter the elements of matrix2 : ");
  for(i=0;i<m2;i++)
   {
    for(j=0;j<n2;j++)
    {
      b[i][j]=sc.nextInt();
     }
    }
    System.out.println("Matrix2 : ");
  for(i=0;i<m2;i++)
   {
    for(j=0;j<n2;j++)
    {
       System.out.print(b[i][j]+" ");
     }
      System.out.println();
    }

   
  for(i=0;i<m1;i++)
   {
    for(j=0;j<n1;j++)
    {
       c[i][j]=a[i][j]+b[i][j];
     }
    }
   System.out.println("After Addition :");
  for(i=0;i<m1;i++)
   {
    for(j=0;j<n1;j++)
    {
       System.out.print(c[i][j]+" ");
     }
     System.out.println();
    }
}
}
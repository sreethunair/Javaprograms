/*Aim: Write a program to write to a file, then read from the file and display the contents
on theconsole. */

import java.io.*;
import java.util.*;
public class WriteAndDisplayFile
  {
    public static void main(String args[])throws IOException,FileNotFoundException
    {
      int i;
      File f1=new File("C:\\Users\\sreethu\\Desktop\\sree\\java\\file\\writefile.txt");
      FileInputStream fin=new FileInputStream(f1);
      FileWriter myWriter = new FileWriter("C:\\Users\\sreethu\\Desktop\\sree\\java\\file\\writefile.txt");
       //myWriter.write("my name is ansar");    
 Scanner sc=new Scanner(System.in);
      System.out.println("Write a content to the files:");
      String a[]=new String[4];
      for ( i=0; i<4; i++)
      {
       a[i]=sc.nextLine();
       myWriter.write(a[i]+"\n");
      }
    myWriter.close();
    System.out.println(" the file content are:");
      do
      {
       
       i=fin.read();
       if (i !=-1)
       System.out.print((char)i);
       }while(i!=-1);
     fin.close();
   }
}
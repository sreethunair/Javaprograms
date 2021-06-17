import java.io.*;
import java.util.*;
class publisher
{
 String name,ISBN_number,location;

void read()
{
 Scanner sc= new Scanner(System.in);
 System.out.println(" Enter name of publisher:");
 name=sc.nextLine();
 System.out.println(" Enter the location:");
 location=sc.nextLine();
 System.out.println(" Enter the ISBN number:");
 ISBN_number=sc.nextLine();
 System.out.println("\n");
}
}
class book extends publisher
{
String author,title,category;
int price;
void read()
{
 super.read();
 Scanner sc= new Scanner(System.in);
 System.out.println(" Enter name of author name:");
 author=sc.nextLine();
 System.out.println(" Enter the book title:");
 title=sc.nextLine();
 System.out.println(" Enter the category of book:");
 category=sc.nextLine();
 System.out.println(" Enter the price of book:");
 price=sc.nextInt();
 System.out.println("\n");
}
void show()
{
 System.out.println("The book title is : "+title);
 System.out.println(" Name of the author :"+author);
 System.out.println("Category :"+category);
 System.out.println("Publishers name:"+name);
  System.out.println(" Publisher Location :"+location);
 System.out.println(" ISBN number is:"+ISBN_number);
 System.out.println("\n");
}
}
class bookdetails
{
 public static void main(String args[])
  {
int i,n;
   Scanner sc= new Scanner(System.in);
  System.out.println("No.of books to be entered:");

   n=sc.nextInt();
   book b[]=new book[n];
   for (i=0; i<n; i++)
   {
    b[i]=new book();
    b[i].read();
    }
    Scanner st= new Scanner(System.in);
     System.out.println("Enter the category of the book :");

     String ct=st.nextLine();
     boolean flag=false;
    for ( i=0; i<n; i++)
    {
      if(ct.equals(b[i].category))
       {
 System.out.println("\n");
             System.out.println(ct+" Category book  details:");
             b[i].show(); 
             flag=true;
       }
     else
       {
        continue;
       }
    }
 if(!flag)
    System.out.println("Not available");
  }
}
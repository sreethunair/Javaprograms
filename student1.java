import java.util.Scanner;
class student
{
 
 String n,p,c;
 int a,m1,m2,m3,total=0;
 Scanner sc=new Scanner(System.in);
 void read()
 {
  System.out.println("Enter the name:");
  n=sc.nextLine();
  System.out.println("Enter the age:");
  a=sc.nextInt();
  sc.nextLine();
  System.out.println("Enter the course:");
  c=sc.nextLine();
  System.out.println("Enter the place:");
  p=sc.nextLine();
 }
 void display()
 {
   System.out.println("\nThe details of the student:"); 
  System.out.println("Name :"+n);
  System.out.println("Age :"+a);
  System.out.println("Course :"+c);
  System.out.println("Place :"+p);
  System.out.println("Total Mark:"+total);
  } 
 void total()
 {
  System.out.println("Enter the 3 subject mark:");
  m1=sc.nextInt();
  m2=sc.nextInt();
  m3=sc.nextInt();
  total=m1+m2+m3;

 }
}
class student1
{
 public static void main(String arg[])
  {
    student s=new student();
     s.read();
     s.total();
     s.display();
  
  }
}
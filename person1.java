import java.io.*;
import java.util.*;
class person
{
  String name,gender,address;
  int age;
 person()
 {
 name=" ";
 gender=" ";
 age=0;
 address=" ";
 }

 void read()
 {
 Scanner sc= new Scanner(System.in);
 System.out.println(" Enter name of the person : ");
 name=sc.nextLine();
 System.out.println(" Enter age of the person : ");
  age=sc.nextInt();
 sc.nextLine();
 System.out.println(" Enter gender of the person : ");
gender=sc.nextLine();
 System.out.println(" Enter address of the person : ");
 address=sc.nextLine();
 System.out.println("\n");
 }
 void display()
 {
 System.out.println("The name is : "+name);
 System.out.println("gender:"+gender);
 System.out.println("Age of a person :"+age);
 System.out.println("Address :"+address);
 System.out.println("\n"); 
}
}


class employee extends person
{
  int empid,salary;
 String c_name,qualification;

 employee()
 {
 empid=0;
 c_name=" ";
 qualification=" ";
 salary=0;
 }

 void read()
 {
 super.read();
 Scanner sc= new Scanner(System.in);
 System.out.println(" Enter the employee id : ");
 empid=sc.nextInt();
 sc.nextLine();
 System.out.println(" Enter the company name : ");
 c_name=sc.nextLine();
 System.out.println(" Enter the qualification of the employee : ");
 qualification=sc.nextLine();
System.out.println(" Enter the  salary of employeee : ");
 salary=sc.nextInt();
 System.out.println("\n");
 }
 void display()
 {
   super.display();
 System.out.println("Employee id: "+empid);
 System.out.println("Company name:"+c_name);
 System.out.println("Qualification of a employee :"+qualification);
 System.out.println("Salary:"+salary);
 System.out.println("\n");
 }
}


 class Teacher extends employee
{
  int id;
String dept,sub;

 Teacher()
 {
 dept="";
 sub="";
 id=0;
 }
 void read()
 {
 super.read();
 Scanner sc= new Scanner(System.in);
 System.out.println(" Enter department name:");
 dept=sc.nextLine();
 System.out.println(" Enter subject name:");
 sub=sc.nextLine();
 System.out.println("Enter the teacher id :");
 id=sc.nextInt();
 System.out.println("\n");
 }
 void display()
 {
 super.display();
 System.out.println("Department :"+dept);
 System.out.println("Subject  :"+sub);
 System.out.println("teacher id :"+id);
 System.out.println("\n"); 
}
}
 class person1
 {
  public static void main(String args[])
  {
   Scanner sc= new Scanner(System.in);
  System.out.println("No.of teachers to be entered:");
  int n=sc.nextInt();
   Teacher t[]=new Teacher[n];
   for (int i=0; i<n; i++)
   {
    t[i]=new Teacher();
    t[i].read();
    }
   for (int i=0; i<n; i++)
   {
 System.out.println("\n");
    System.out.println("The details of employee:");
 System.out.println("\n");
    t[i].display();
   }
}
}
import java.util.*;

class Employee
{
 int empid;
 String name;
 int salary;
 String address;
 Employee()
 {
 empid=0;
 name=" ";
 salary=0;
 address=" ";
 }

 void read()
 {
 Scanner sc= new Scanner(System.in);
 System.out.println(" Enter empid");
 empid=sc.nextInt();
 sc.nextLine();
 System.out.println(" Enter name");
 name=sc.nextLine();
 System.out.println(" Enter salary");
 salary=sc.nextInt();
 sc.nextLine();
 System.out.println(" Enter address");
 address=sc.nextLine();
 }
 void display()
 {
 System.out.println("employee Id : "+empid);
 System.out.println("employee Name :"+name);
 System.out.println("Salary :"+salary);
 System.out.println("Address :"+address);
 }
}


 class Teacher extends Employee
{
 String dept;
 String subject;
 Teacher()
 {
 dept="";
 subject="";
 }
 void read()
 {
 super.read();
 Scanner sc= new Scanner(System.in);
 System.out.println(" Enter dept name");
 dept=sc.nextLine();
 System.out.println(" Enter subject name");
 subject=sc.nextLine();
 }
 void display()
 {
 super.display();
 System.out.println("Department :"+dept);
 System.out.println("Subject taught :"+subject);
 }
}
 class employees
 {
  public static void main(String args[])
  {
   Scanner sc= new Scanner(System.in);
  System.out.println("how many employee details to enter:");
  int count=sc.nextInt();
   Teacher t[]=new Teacher[count];
   for (int i=0; i<count; i++)
   {
    t[i]=new Teacher();
    t[i].read();
    }
   for (int i=0; i<count; i++)
   {
    System.out.println("the employee details:");
    t[i].display();
   }
}
}
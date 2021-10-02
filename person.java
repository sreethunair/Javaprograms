import java.util.*;
class person
{
  String name;
 String gender;
 int age;
 String address;

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
 System.out.println(" Enter the person name");
 name=sc.nextLine();
 System.out.println(" Enter the gender");
 gender=sc.nextLine();
 System.out.println(" Enter the age");
 age=sc.nextInt();
 sc.nextLine();
 System.out.println(" Enter address");
 address=sc.nextLine();
 }
 void display()
 {
 System.out.println("The person name is : "+name);
 System.out.println("gender:"+gender);
 System.out.println("Age of a person :"+age);
 System.out.println("Address :"+address);
 }
}




class employee extends person
{
  int empid;
 String company_name;
 String qualification;
 int salary;
 employee()
 {
 empid=0;
 company_name=" ";
 qualification=" ";
 salary=0;
 }

 void read()
 {
 super.read();
 Scanner sc= new Scanner(System.in);
 System.out.println(" Enter the employeee id:");
 empid=sc.nextInt();
 sc.nextLine();
 System.out.println(" Enter the company name:");
 company_name=sc.nextLine();
 System.out.println(" Enter the qualification of the employee:");
 qualification=sc.nextLine();
System.out.println(" Enter the  salary of employeee :");
 salary=sc.nextInt();
 }
 void display()
 {
   super.display();
 System.out.println("The employee id of the employee : "+empid);
 System.out.println("company name:"+company_name);
 System.out.println("the qualification of a employee :"+qualification);
 System.out.println("salary:"+salary);
 }
}


 class Teacher extends employee
{
 String dept;
 String subject;
 int id;
 Teacher()
 {
 dept="";
 subject="";
 id=0;
 }
 void read()
 {
 super.read();
 Scanner sc= new Scanner(System.in);
 System.out.println(" Enter dept name");
 dept=sc.nextLine();
 System.out.println(" Enter subject name");
 subject=sc.nextLine();
 System.out.println("teacher id :");
 id=sc.nextInt();
 }
 void display()
 {
 super.display();
 System.out.println("Department :"+dept);
 System.out.println("Subject  :"+subject);
 System.out.println("teacher id :"+id);
 }
}
 class personInheri
 {
  public static void main(String args[])
  {
   Scanner sc= new Scanner(System.in);
  System.out.println("how many teacher details to enter:");
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
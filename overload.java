import java.util.Scanner;
class over
{
    public void calculate(int n, char ch) 
    {
        if (ch == 's') 
	{
                System.out.println("The square of number is:");
		System.out.println(n*n);
	}
           
        else 
	{
                System.out.println("The cube of number is:");
		System.out.println(n*n*n);
        }
    }
    
    public void calculate(int n, int m, char ch) 
    {
        if (ch == 'p')
         {
            System.out.println("The product of 2 numbers is:");
	    System.out.println(n*m);
          }
        else
          {
            System.out.println("The sum of 2 numbers is:");
	    System.out.println(n+m);
          }
    }
    public void calculate(String str1, String str2)
    {
       if(str1==str2)
       {
            System.out.println("The strings are equal");
	}
	else
	{
		System.out.println("The strings are not equal");
	}
      }
}
class overload
{   
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        over obj = new over();
        
        System.out.print("Enter a number: ");
        int n1 = in.nextInt();
        obj.calculate(n1, 's');
        obj.calculate(n1, 't');
        
        System.out.print("Enter first number: ");
        n1 = in.nextInt();
        System.out.print("Enter second number: ");
        int n2 = in.nextInt();
        obj.calculate(n1, n2, 'p');
        obj.calculate(n1, n2, 'k');
        
	System.out.println("Enter string1:");
	String st1=in.next();
	System.out.println("Enter string2:");
	String st2=in.next();
	obj.calculate(st1,st2);
	
        
    }
}
import java.io.*;
class overload
{
    void calculate(int n,char ch)
     {
       if(ch=='s')
        {
          int a=n*n;
          System.out.println("the sqare of "+n +" is "+ a);
        }
        else
         {
           int a=n*n*n;
            System.out.println("the cube of "+n +" is "+ a);
         }
       }
     void calculate(int n,int m,char ch)
     { 
     if(ch=='p')
        {
          System.out.println("the product of "+n+" and "+m+" is "+(n*m));
        }
     else
      System.out.println("sum of "+n+" and "+m+" is "+(n+m));
    }
   void calculate(String str1, String str2)
  {
   if(str1.equals(str2))
      System.out.println( "The two string "+str1+" and "+str2+" are equal");
   else
    System.out.println("The two string "+str1+" and "+str2+" not are equal");
   }

 }
class methodOverload
{
 public static void main(String arg[])
  {
    overload ov=new overload();
    ov.calculate(6,'p');
    ov.calculate(6,4,'p');
    ov.calculate("Sree","Sree");
   }
}

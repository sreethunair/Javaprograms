import java.io.*;
import java.util.*;
class complex
{
int real,image;
complex(int real1,int image1)
{
real=real1;
image=image1;
}
void add(complex c1,complex c2)
{
real=c1.real+c2.real;
image=c1.image+c2.image;
System.out.println("Result is:"+real+"+"+image+"i");
}
}
class complex1
{
public static void main(String args[])
{
int a,b,c,d;
int e=0,f=0;
System.out.println("Enter the real  part  and imaginary part of  first complex number:");
Scanner ob=new Scanner(System.in);
a=ob.nextInt();
b=ob.nextInt();
System.out.println("Enter the real  part  and image part of second complex number:");
c=ob.nextInt();
d=ob.nextInt();
complex c1=new complex(a,b);
complex c2=new complex(c,d);
complex c3=new complex(e,f);
c3.add(c1,c2);
}
}

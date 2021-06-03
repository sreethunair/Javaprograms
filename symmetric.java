import java.util.Scanner;
class symmetric
{
  public static void main(String arg[])
  {
   	int f=0;
   	int a[][] = new int[10][10];
   	int temp[][] = new int[10][10];
  	Scanner sc=new Scanner(System.in);
  	System.out.println("Enter the number of row :");
  	int r=sc.nextInt();
  	System.out.println("Enter the number of column :");
  	int c=sc.nextInt();
  	System.out.println("Enter the elements");
  	for(int i=0;i<r;i++)
   	{
    		for(int j=0;j<c;j++)
    		{
     			 a[i][j]=sc.nextInt();
     		}
    	}
  System.out.println("Print the matrix :");
  for(int i=0;i<r;i++)
  {
  	for(int j=0;j<c;j++)
    	{
      		System.out.print(a[i][j]+" ");
     	}
    	System.out.println();
  }
  for(int i=0;i<r;i++)
  	{
    		for(int j=0;j<c;j++)
    		{
      			temp[j][i]=a[i][j];
     		}
    	}
  System.out.println("After interchanging the rows and colunms : ");
  for(int i=0;i<r;i++)
  {
  	for(int j=0;j<c;j++)
    	{
     		System.out.print(temp[i][j]+" ");
     	}
     	System.out.println();
  }

  for(int i=0;i<r;i++)
  	{
    		for(int j=0;j<c;j++)
    	{
      	if(temp[i][j]!=a[i][j])
        f=1;
        break;
         
     	}
  }
    	if(f==1)
      		System.out.println("Not symmetric matrix");
    	else
        	System.out.println("Symmetric matrix");
    
  }
}


OUTPUT :

Enter the number of row :
2
Enter the number of column :
2
Enter the elements
2 2
2 2
Print the matrix :
2 2
2 2
After interchanging the rows and colunms :
2 2
2 2
Symmetric matrix


Enter the number of row :
2
Enter the number of column :
2
Enter the elements
2 3
4 5
Print the matrix :
2 3
4 5
After interchanging the rows and colunms :
2 4
3 5
Not symmetric matrix
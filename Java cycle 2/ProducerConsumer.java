/*Aim:Producer/Consumer using ITC*/

class SharedBuffer
{
  int number=0;
  boolean value = false;
  synchronized int get()
  {
    if (value==false)
       try
        {
          wait();
        }
       catch (InterruptedException e)
        {  
          System.out.println("InterruptedException caught");
        }
   System.out.println("consume: " + number);
   value=false;
   notify();
   return number;
  }
 synchronized void put(int number)
  {
    if (value==true)
      try {
         wait();
        }
     catch (InterruptedException e)
      { 
        System.out.println("InterruptedException caught");
      }
  this.number=number;
  System.out.println("Produce: " + number);
  value=true;
  notify();
}
}
class ProducerX extends Thread
{
  SharedBuffer pc;
  ProducerX(SharedBuffer pc)
   {
     this.pc=pc;
     this.start();
    }
  public void run()
  {
   int i=0;
   while(true)
    {
     pc.put(++i);
     Thread.sleep(5000);
     } 
   }
}

class ConsumerX extends Thread
 {
  SharedBuffer pc;
  ConsumerX(SharedBuffer pc)
  {
   this.pc=pc;
   this.start();
  }
   public void run()
  {
    while(true)
     {
       pc.get();
     }
   }
}

class ProducerConsumer
 {
   public static void main(String arg[])
    {
       SharedBuffer pc=new  SharedBuffer();
       ProducerX P=new ProducerX(pc);
       ConsumerX C=new ConsumerX(pc);
     }
  }


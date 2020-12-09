//implementing Runnable Interface and Exception Handling(try-catch)
class Count implements Runnable
{
   Thread mythread ;
   Count()
   { 
      mythread = new Thread(this, "My Inventory");
      System.out.println("Value Cart" + mythread);
      mythread.start();
   }
   public void run()
   {
      try
      {
        for (int i=0 ;i<10;i++)
        {
          System.out.println("Billing for items: " + i);
          Thread.sleep(1000);
        }
     }
     catch(InterruptedException e)
     {
        System.out.println("Billing interrupted!");
     }
     System.out.println("Billing is completed." );
   }
}
class RunnableExample
{
    public static void main(String args[])
    {
       Count cnt = new Count();
       try
       {
          while(cnt.mythread.isAlive())
          {
            System.out.println("Billing will continue now : "); 
            Thread.sleep(1500);
          }
       }
       catch(InterruptedException e)
       {
          System.out.println("Billing interrupted!");
       }
       System.out.println("Billing is completed." );
    }
}
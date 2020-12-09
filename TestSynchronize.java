


//example of java synchronized method  
class Table{  
    String foodItems[]={"Milk","Coffee","Tea","Chocolate","Chips"};
    synchronized void printTable(int n){//synchronized method  
      for(int i=0;i<n;i++){  
        System.out.println("List of Items Available:"+ foodItems[i]);  
        try{  
         Thread.sleep(400);  
        }catch(Exception e){System.out.println(e);}  
      }  
     
    }  
   }  
     
   class MyThread1 extends Thread{  
   Table t;  
   MyThread1(Table t){  
   this.t=t;  
   }  
   public void run(){  
       System.out.println("Executing 1st Thread");
   t.printTable(5);  
   }  
     
   }  
   class MyThread2 extends Thread{  
   Table t;  
   MyThread2(Table t){  
   this.t=t;  
   }  
   public void run(){  
    System.out.println("Executing 2nd Thread");
   t.printTable(4);  
   }  
   }  
     
   public class TestSynchronize{  
   public static void main(String args[]){  
   Table obj = new Table();//only one object  
   MyThread1 t1=new MyThread1(obj);  
   MyThread2 t2=new MyThread2(obj);  
   t1.start();  
   t2.start();  
   }  
   }
TestSynchronize.java
Displaying Customer.java.
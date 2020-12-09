class Storage extends Thread{  
  public void run(){  
    System.out.println("Storage is empty. Fill up the storage");  
  }   
  public static void main(String args[]){  
    Storage obj=new Storage(); 
    
     obj.start();  
  }  
}
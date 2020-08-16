  
//1.Implement the concept of control statements and array in the list
//2.Implement the concept of class,data members,member functions and access specifier.
import java.util.*;

public class Department {
	static String DeptName="Value Cart";
	int pId;
	String productName;
	int priceList;
	
	public Department(int pId, String productName, int priceList){											//Member functions
		this.pId=pId;
		this.productName=productName;
		this.priceList=priceList;
	}
	
	public void getProduct(){
		
		if(priceList<=1000)
		
			System.out.println("No discount allowed\n The price of the "+productName+ " is:"+priceList);
		
		else if(priceList>1000 && priceList<=3000)
		
			System.out.println("10% discount allowed \nThe price of the "+productName+ " is:"+priceList);
		
		else
		
			System.out.println("20% discount allowed \nThe price of the "+productName+ " is:"+priceList);
		
	}
	
	
	public static void main(String args[]){																//Access Specifier
		//Data Members
		//Initialising Array
		int pId[];
		int items;
		int price[];
		String prodName[];
		int c=1;
		Scanner st=new Scanner(System.in);
		System.out.println("Welcome to " + DeptName);
		System.out.println("How many products you have in the store?");
		items=st.nextInt();
		pId=new int[items];
		prodName= new String[items];
		price=new int[items];
		
		for(int i=0;i<items;i++){                                                         	//Using for-loop and if statement as control statement
			pId[i]=c++;
			System.out.println("Enter the name of the item "+(i+1));
			prodName[i]=st.next();
			System.out.println("Enter the price of the "+prodName[i]);
			price[i]=st.nextInt();
			if(price[i]<=0){
				System.out.println("Price cannot be zero or less. Enter the price of the "+prodName[i]+" again");
				price[i]=st.nextInt();
			}
		}

		System.out.println("Product Id"+"Product Name"+"Price of the Product");
		for(int i=0;i<items;i++){
			System.out.println(pId[i]+"            "+prodName[i]+"            "+price[i]);
		}
		
		for(int i=0;i<items;i++){
			Department ob=new Department(pId[i],prodName[i],price[i]);							//Array of objects
			ob.getProduct();																	//Calling function
		}
		
	}
}
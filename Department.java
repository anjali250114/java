  
 
import java.util.*;

public class Department {
	static int pId;
	static String productName;
	static int priceList;
	
	static class name{												//static class
													
			static String vName;									//static variable
			
			static{													//static block
				vName="Value Cart";
			}
			static String display(){								//static function
				return vName;
				
			}
		}
	public Department(int pId){											//constructor
		Department.pId=pId;
	}
	
	public Department(int pId, String productName, int priceList) { 	// constructor overloading
		Department.pId = pId;
		Department.productName = productName;
		Department.priceList = priceList;
	}
	
	public void getproduct(int pId){									//function overloading
		if(pId>=01 && pId<=10)
			System.out.println("Products ranging from 01 to 10 comes under Food category");
		else if(pId>=11 && pId<=20)
			System.out.println("Products ranging from 11 to 20 comes under Beverages category");
		else if(pId>=21 && pId<=30)
			System.out.println("Products ranging from 21 to 30 comes under Cosmetics category");
	}
	public void getProduct(){													//function overloading
		
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
		Scanner st=new Scanner(System.in);
		System.out.println("Welcome to " + Department.name.display());
		System.out.println("How many products you have in the store?");
		items=st.nextInt();
		pId=new int[items];
		prodName= new String[items];
		price=new int[items];
		
		for(int i=0;i<items;i++){                                                         	//Using for-loop and if statement as control statement
			System.out.println("Enter the ProductID");                                                       
			pId[i]=st.nextInt();
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
			Department ob1=new Department(pId[i]);												//calling the constructor
			ob1.getproduct(pId[i]);																//calling the function
		}
	st.close();	
	}
}

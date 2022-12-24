package Store;

import java.util.Scanner;

public class Admin extends Customer{
	Scanner sc=new Scanner(System.in);
	Customer c=new Customer();
	Store s=new Store();
	static int flag=0;

	public void Admin() {
		// TODO Auto-generated method stub
			System.out.println("=======================================================");
			System.out.println("|           Welcome to Admin Panel                    |");
			System.out.println("|=====================================================|");
			System.out.println("_________________________________________________________________________________________________________________________________");
			System.out.println();
			String username="samiksha";
			String password="chavan";
			p.products();
			validate(username,password);
		
	}

	private boolean validate(String uname, String pass) {
		// TODO Auto-generated method stub
		
		System.out.println();
		System.out.print("Enter user name:");
		String s=sc.nextLine();
		System.out.print("Enter Password:");
		String s1=sc.nextLine();
		if(s.equals(uname) && s1.equals(pass)) {
			System.out.println();
			System.out.println("Login Successful!");
			System.out.println();
			adminActivity();
			return true;
		}
		else {
			System.out.println("Invalid Login Credientials.");
			System.exit(0);
			return false;
		}
	}

	private void adminActivity() {
		// TODO Auto-generated method stub
		int select;
		System.out.println();
		System.out.println("_________________________________________________________________________________________________________________________________");
		System.out.println();
		System.out.println("Admin can perform following actions: ");
		System.out.println();
		System.out.println(" 1.AddProduct \n 2.ViewProduct \n 3.DeleteProduct \n 4.ViewCustomers \n 5.DeleteCustomer \n 6.Main Menu \n 7.Exit");
		System.out.println();
		System.out.print("Select the action to be performed: ");
		select=sc.nextInt();
		System.out.println("_________________________________________________________________________________________________________________________________");
		System.out.println();
		
		switch(select) {
		case 1:
			AddProduct();
			break;
		case 2:
			ViewProduct();
			break;
		case 3:
			DeleteProduct();
			break;
		case 4:
			ViewCustomers();
			break;
		case 5:
			DeleteCustomer();
			break;
		case 6:
			s.mainActivity();
		case 7:
			
			System.exit(0);
		default:
			System.out.println("You Entered wrong choice.");
		
		}
	}

	private void DeleteCustomer() {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.print("Enter Customer Name To Delete The Customer:");
		
		String customerdel=sc.next();
		for(int i=0;i<CustomerName.size();i++) {
			if(customerdel.equals(CustomerName.get(i))) {
				flag=i;
				CustomerName.remove(i);
			}
		}
		for(int i=0;i<CustomerName.size();i++) {
			if(i==flag) {
				CustomerAddress.remove(i);
			}
		}
		for(int i=0;i<ProductPrice.size();i++) {
			if(i==flag) {
				PhoneNumber.remove(i);
				System.out.println("Customer Deleted Successfully.");	
			}
		}
		System.out.println();
		int select;
		System.out.println();
		System.out.println("_________________________________________________________________________________________________________________________________");
		System.out.println();
		System.out.println(" 1. Main Menu \n 2. Exit");
		System.out.print("Please select your option:");
		select=sc.nextInt();
		switch(select) {
			case 1:
				adminActivity();
				break;
			case 2:
				System.exit(0);
				break;
		}
		System.out.println();
	}

	private void ViewCustomers() {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("    Customer Name \t Address \t Mo. Number");
		System.out.println();
		for(int i=0;i<CustomerName.size();i++) {
			System.out.println(i+1 +".    "+CustomerName.get(i)+"\t\t  "+CustomerAddress.get(i)+"\t  "+PhoneNumber.get(i));
		}
		System.out.println();
		System.out.println("_________________________________________________________________________________________________________________________________");
		System.out.println();
		int select;
		System.out.println(" 1. Main Menu \n 2. Exit");
		System.out.print("Please select your option:");
		select=sc.nextInt();
		switch(select) {
			case 1:
				adminActivity();
				break;
			case 2:
				System.exit(0);
				break;
		}
		System.out.println();
	}

	private void DeleteProduct() {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.print("Enter Product No To Delete The Product:");
		int delete=sc.nextInt();
		for(int i=0;i<ProductID.size();i++) {
			if(delete==ProductID.get(i)) {
				flag=i;
				ProductID.remove(i);
			}
		}
		for(int i=0;i<ProductName.size();i++) {
			if(i==flag) {
				ProductName.remove(i);
			}
		}
		for(int i=0;i<ProductPrice.size();i++) {
			if(i==flag) {
				ProductPrice.remove(i);
			}
		}
		for(int i=0;i<AvailableQuantity.size();i++) {
			if(i==flag) {
				AvailableQuantity.remove(i);
				System.out.println();
				System.out.println("Product Removed Successfully.");
			}
		}
		int select;
		System.out.println();
		System.out.println("_________________________________________________________________________________________________________________________________");
		System.out.println();
		System.out.println(" 1. Main Menu \n 2. Exit");
		System.out.print("Please select your option:");
		select=sc.nextInt();
		switch(select) {
			case 1:
				adminActivity();
				break;
			case 2:
				System.exit(0);
				break;
		}
		System.out.println();
	}

	private void ViewProduct() throws IndexOutOfBoundsException {
		// TODO Auto-generated method stub
		System.out.println("    Product No. \t"+"Product Name \t"+"Available Quantity");
		for(int i=0;i<ProductName.size();i++) {
			System.out.println(i+1 +".     "+ProductID.get(i)+"\t\t "+ProductName.get(i)+"\t\t"+AvailableQuantity.get(i));
		}
		System.out.println();
		System.out.println("_________________________________________________________________________________________________________________________________");
		System.out.println();
		int select;
		System.out.println(" 1. Main Menu \n 2. Exit");
		System.out.print("Please select your option:");
		select=sc.nextInt();
		switch(select) {
			case 1:
				adminActivity();
				break;
			case 2:
				System.exit(0);
				break;
		}
		System.out.println();
	}

	private void AddProduct() {
		// TODO Auto-generated method stub
		System.out.println();
		System.out.println("Product ID is:"+PID++);
		ProductID.add(PID);
		System.out.print("Enter Product Name:");
		ProductName.add(sc.next());
		System.out.print("Enter Product Price:");
		ProductPrice.add(sc.nextInt());
		System.out.println("Enter Available Quantity:");
		AvailableQuantity.add(sc.nextInt());
		
		System.out.println();
		System.out.println("Product Added Successfully..");
		System.out.println();
		
		System.out.println();
		System.out.println("_________________________________________________________________________________________________________________________________");
		System.out.println();
		int select;
		System.out.println(" 1. Main Menu \n 2. Exit");
		System.out.print("Please select your option:");
		select=sc.nextInt();
		switch(select) {
			case 1:
				adminActivity();
				break;
			case 2:
				System.exit(0);
				break;
		}
		System.out.println();
	}


}

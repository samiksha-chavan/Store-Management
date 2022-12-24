package Store;

import java.util.LinkedList;
import java.util.Scanner;

public class Customer extends Product{
		
	Scanner sc=new Scanner(System.in);
	Product p=new Product();
	String phone,cName,cAddress;
	
		public void CustomerActivity() {
		// TODO Auto-generated method stub
		System.out.print("Enter Your Name:");
		cName=sc.next();
		CustomerName.add(cName);
		System.out.print("Enter Your Address:");
		cAddress=sc.next();
		CustomerAddress.add(cAddress);
		System.out.print("Enter Your Phone Number:");
		phone=sc.next();
		if(phone.length()==10) {
			PhoneNumber.add(phone);
			p.products();
			shopNow();
		}
		else {
			p.products();
			phoneNo();
		}
	}
	
	private void phoneNo() {
		// TODO Auto-generated method stub
		System.out.println("Invalid Phone Number");
		System.out.println("Phone Number Should Be 10 Digits");
		System.out.print("Enter Your Phone Number:");
		phone=sc.next();
		if(phone.length()==10) {
			PhoneNumber.add(phone);
			shopNow();
		}
		else {
			phoneNo();
		}
		
	}
	private void shopNow() {
		// TODO Auto-generated method stub
		int choice;
		System.out.println();
		
		System.out.println("Product List:");
		System.out.println();
		System.out.println(" 1.Pencil \n 2.Eraser \n 3.Pen \n 4.Sharpner \n 5.Notebook");
		System.out.print("Please Select The Products You Want To Buy:");
		choice=sc.nextInt();
		SelectedProducts.add(choice);
		switch(choice) {
		case 1:
			System.out.println("Available Pencils:"+AvailableQuantity.get(1));
			System.out.print("How Many Pencils You Want to Buy:");
			SelectedQuantity.add(1,sc.nextInt());
			Amount.set(1,SelectedQuantity.get(1)*ProductPrice.get(1));
			AvailableQuantity.set(choice, AvailableQuantity.get(choice)-SelectedQuantity.get(1));
			char ch;
			System.out.print("Do You Want to Buy Another Item: Y/N");
			ch=sc.next().charAt(0);
			switch(ch) {
				case 'Y':
					shopNow();
					break;
				case 'N':
					Bill();
					break;
			}
			break;
		case 2:
			System.out.println("Available Erasers:"+AvailableQuantity.get(2));
			System.out.print("How Many Erasers You Want to Buy:");
			SelectedQuantity.add(2,sc.nextInt());
			Amount.add(2,SelectedQuantity.get(2)*ProductPrice.get(2));
			System.out.print("Do You Want to Buy Another Item: Y/N");
			ch=sc.next().charAt(0);
			switch(ch) {
				case 'Y':
					shopNow();
					break;
				case 'N':
					Bill();
					break;
			}
			break;	
		case 3:
			System.out.println("Available Pens:"+AvailableQuantity.get(3));
			System.out.println("How Many Pens You Want to Buy:");
			SelectedQuantity.add(3,sc.nextInt());
			Amount.add(3,SelectedQuantity.get(3)*ProductPrice.get(3));
			System.out.print("Do You Want to Buy Another Item: Y/N");
			ch=sc.next().charAt(0);
			switch(ch) {
				case 'Y':
					shopNow();
					break;
				case 'N':
					Bill();
					break;
			}
			break;
		case 4:
			System.out.println("Available Sharpners:"+AvailableQuantity.get(4));
			System.out.print("How Many Sharpners You Want to Buy:");
			SelectedQuantity.add(4,sc.nextInt());
			Amount.add(4,SelectedQuantity.get(4)*ProductPrice.get(4));
			System.out.print("Do You Want to Buy Another Item: Y/N");
			ch=sc.next().charAt(0);
			switch(ch) {
				case 'Y':
					shopNow();
					break;
				case 'N':
					Bill();
					break;
			}
			break;
		case 5:
			System.out.println("Available Notebooks:"+AvailableQuantity.get(5));
			System.out.print("How Many Notebooks You Want to Buy:");
			SelectedQuantity.add(5,sc.nextInt());
			Amount.add(5,SelectedQuantity.get(5)*ProductPrice.get(5));
			System.out.print("Do You Want to Buy Another Item: Y/N");
			ch=sc.next().charAt(0);
			switch(ch) {
				case 'Y':
					shopNow();
					break;
				case 'N':
					Bill();
					break;
			}
			break;
		default:
			System.out.println("You Entered Wrong Choice.");
			System.exit(0);
		}
		
	}
	void Bill() {
		
		
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t"+"-------------------------------------------------------");
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t"+"|                                                     |");
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t"+"|                  CUSTOMER BILL                      |");
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t"+"|                                                     |");
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t"+"-------------------------------------------------------");
		System.out.println();
		System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t"+"Name : "+cName + "\t\t\t\t\t\t\t" +cAddress);
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t"+"Mobile No : "+phone);
		System.out.println();
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t"+"-------------------------------------------------------------------------------------");
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t");
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t"+"    "+"Product No."+"\t"+"Product name"+"\t"+"Price(1 qty)"+"\t"+"No.of.Items"+"\t|\t"+"Total");
		System.out.println();
		
		
		for(int i=0;i<SelectedProducts.size();i++) {
			
				System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t"+ProductID.get(SelectedProducts.get(i))+"\t"+ProductName.get(SelectedProducts.get(i))+"\t\t"+ProductPrice.get(SelectedProducts.get(i))+"\t\t"+SelectedQuantity.get(SelectedProducts.get(i))+"\t|\t"+Amount.get(SelectedProducts.get(i)));
			
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t"+"-------------------------------------------------------------------------------------");
		int GrandTotal=0;
		for(int i=0;i<SelectedProducts.size();i++) {
			GrandTotal=GrandTotal+Amount.get(SelectedProducts.get(i));
		}
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t\t"+"GRAND TOTAL \t\t :      "+GrandTotal);
		System.out.println();
		
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t"+"-------------------------------------------------------------------------------------");
		System.out.println();
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t"+"-----------------------------|| Thank You!Visit Again ||-----------------------------");
		System.out.println();
		System.out.println("\t\t\t\t\t\t\t\t\t\t\t"+"-------------------------------------------------------------------------------------");
		
	}
}


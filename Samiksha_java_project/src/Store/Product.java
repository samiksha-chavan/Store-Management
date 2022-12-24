package Store;
import java.util.LinkedList;
import java.util.Scanner;
public class Product {
	static int PID=100;
	
	public static LinkedList <Integer> ProductID=new <Integer> LinkedList();
	public static LinkedList <String> ProductName=new <String> LinkedList();
	public static LinkedList <Integer> ProductPrice=new <Integer> LinkedList();
	public static LinkedList <Integer> AvailableQuantity=new <Integer> LinkedList();
	public static LinkedList <Integer> SelectedQuantity=new <Integer> LinkedList();
	public static LinkedList <Integer> Amount=new <Integer> LinkedList();
	public static LinkedList <Integer> SelectedProducts=new <Integer> LinkedList();
	public static LinkedList <Integer> CaseCount=new <Integer> LinkedList();
	
	public static LinkedList <String> CustomerName=new <Integer> LinkedList();
	public static LinkedList <String> CustomerAddress=new <Integer> LinkedList();
	public static LinkedList <String> PhoneNumber=new <Integer> LinkedList();
	
	public static void products(){
		ProductID.add(PID++);
		ProductName.add("Pencil  ");
		ProductPrice.add(15);
		AvailableQuantity.add(200);
		SelectedQuantity.add(null);
		Amount.add(null);
		
		ProductID.add(PID++);
		ProductName.add("Eraser  ");
		ProductPrice.add(5);
		AvailableQuantity.add(200);
		SelectedQuantity.add(null);
		Amount.add(null);
		
		ProductID.add(PID++);
		ProductName.add("Pen     ");
		ProductPrice.add(10);
		AvailableQuantity.add(200);
		SelectedQuantity.add(null);
		Amount.add(null);
		
		ProductID.add(PID++);
		ProductName.add("Sharpner ");
		ProductPrice.add(5);
		AvailableQuantity.add(200);
		SelectedQuantity.add(null);
		Amount.add(null);
		
		
		ProductID.add(PID++);
		ProductName.add("Notebook");
		ProductPrice.add(70);
		AvailableQuantity.add(200);
		SelectedQuantity.add(null);
		Amount.add(null);
		
		
		ProductID.add(PID);
		ProductName.add("Sharpner1");
		ProductPrice.add(5);
		AvailableQuantity.add(200);
		SelectedQuantity.add(null);
		Amount.add(null);
		
		
		CustomerName.add("Govind");
		CustomerAddress.add("Pune  ");
		PhoneNumber.add("7228100208");
		AvailableQuantity.add(200);
		
		
		CustomerName.add("Tushar");
		CustomerAddress.add("Mumbai");
		PhoneNumber.add("9834447181");
		AvailableQuantity.add(200);
		
	}


	}

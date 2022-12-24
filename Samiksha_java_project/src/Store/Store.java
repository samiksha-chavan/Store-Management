package Store;
import java.util.Scanner;

public class Store {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\t==================================");
		System.out.println("\t                              ");
		System.out.println("\t  WELCOME TO SAHITYA STATIONERY ");
		System.out.println("\t                              ");
		System.out.println("\t==================================");
		
		mainActivity();
	}
	static void mainActivity() {
		Scanner sc=new Scanner(System.in);
		Admin a=new Admin();
		Customer c=new Customer();
		
		System.out.println("_________________________________________________________________________________________________________________________________");
		System.out.println();
		System.out.println("1.Admin \t 2.Customer \t 3.Logout");
		System.out.println();
		System.out.print("Please Enter your user type:");
		int select=sc.nextInt();
		switch(select) {
		case 1:
			a.Admin();
			break;
		case 2:
			c.CustomerActivity();
			break;
		case 3:
			System.out.println("-----|| You have logged out from the system ||----");
			System.exit(0);
		default:
			System.out.println("You Entered wrong choice.");
			System.exit(0);
		}
	}
}



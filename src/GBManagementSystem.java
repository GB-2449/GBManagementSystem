import java.util.Scanner;

public class GBManagementSystem{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Method m = new Method(sc);
		
		int num = -1;
		while(num != 5){
			System.out.println("GB Management System Menu");
			System.out.println("1. ADD");
			System.out.println("2. Delete");
			System.out.println("3. Edit");
			System.out.println("4. View");
			System.out.println("5. Exit");
			num = sc.nextInt();
			if(num == 1)
				m.Add();
			else if(num == 2)
				m.Delete();
			else if(num == 3)
				m.Edit();
			else if(num == 4)
				m.View();
			else if(num == 5)
				break;
		}
	}
}
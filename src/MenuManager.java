import java.util.Scanner;

public class MenuManager{

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		GBManager gbManager = new GBManager(sc);
		
		int num = -1;
		while(num != 5){
			showMenu();
			num = sc.nextInt();
			
			switch(num) {
			case 1:
				gbManager.Add();
				break;
			case 2:
				gbManager.Delete();
				break;
			case 3:
				gbManager.Edit();
				break;
			case 4:
				gbManager.Views();
				break;
			case 5:
				break;
			default:
				continue;
			}
		}
	}
	
	public static void showMenu() {
		System.out.println("GB Management System Menu");
		System.out.println("1. ADD");
		System.out.println("2. Delete");
		System.out.println("3. Edit");
		System.out.println("4. Views");
		System.out.println("5. Exit");
	}
}
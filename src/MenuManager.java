import java.util.InputMismatchException;
import java.util.Scanner;

public class MenuManager{

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		GBManager gbManager = new GBManager(input);
		selectMenu(input, gbManager);
	}
	
	public static void selectMenu(Scanner input, GBManager gbManager) {
		int num = -1;
		while(num != 5){
			try {
				showMenu();
				num = input.nextInt();
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
			catch(InputMismatchException e){
				System.out.println("Please input 1 ~ 5 !");
				if(input.hasNext()) {
					input.next();
				}
				num = -1;
				System.out.println(num);
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
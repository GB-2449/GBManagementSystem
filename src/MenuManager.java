import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.InputMismatchException;
import java.util.Scanner;
import log.EventLogger;

public class MenuManager{
	static EventLogger logger = new EventLogger("Log.txt");
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		GBManager gbManager = getObject("gbmanager.ser");
		if (gbManager == null) {
			gbManager = new GBManager(input);		
		}
		else {
			gbManager.setScanner(input);
		}
		selectMenu(input, gbManager);
		putObject(gbManager, "gbmanager.ser");

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
					logger.log("Add GB");
					break;
				case 2:
					gbManager.Delete();
					logger.log("Delete GB");
					break;
				case 3:
					gbManager.Edit();
					logger.log("Edit GB");
					break;
				case 4:
					gbManager.Views();
					logger.log("Views GB");
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
	
	public static GBManager getObject(String filename) {
		GBManager gbManager = null;
		
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);
			
			gbManager = (GBManager) in.readObject();
			
			in.close();
			file.close();
			
		} catch (FileNotFoundException e) {
			return gbManager;
		} catch (IOException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		return gbManager;
	}
	
	public static void putObject(GBManager gbManager, String filename) {
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);
			
			out.writeObject(gbManager);
			out.close();
			file.close();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
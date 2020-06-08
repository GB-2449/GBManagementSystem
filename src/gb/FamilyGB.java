package gb;

import java.util.Scanner;

public class FamilyGB extends GB {
	
	public FamilyGB(GBKind kind){
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setGBName(input);
		setGBPhone(input);
		setGBEmail(input);
		setGBHobby(input);
	}
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind : " + skind + " name : " + name + " phone : " + phone);
		System.out.println("email : " + email + " hobby : " + hobby);
	}
}

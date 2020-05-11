package gb;

import java.util.Scanner;

public class CompanyGB extends GB{

	protected String companyEmail;
	
	public CompanyGB(GBKind kind){
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setGBName(input);
		setGBPhone(input);
		setGBEmailwithYN(input);
		setCompanyEmailwithYN(input);
		setGBHobby(input);
	}
	
	public void setGBEmailwithYN(Scanner input) {
		char answer = 'x';
		while (answer != 'Y' && answer != 'Y' && answer != 'N' && answer != 'n') {
			System.out.println("Have an email? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'Y' || answer == 'y') {
				setGBEmail(input);
				break;
			}
			else if (answer == 'N' || answer == 'n' ) {
				this.setEmail("");
				break;
			}
			else {

			}
		}
	}
	
	public void setCompanyEmailwithYN(Scanner input) {
		char answer = 'x';
		while (answer != 'Y' && answer != 'Y' && answer != 'N' && answer != 'n') {
			System.out.println("Have an company email? (Y/N)");
			answer = input.next().charAt(0);
			if (answer == 'Y' || answer == 'y') {
				setGBEmail(input);
				break;
			}
			else if (answer == 'N' || answer == 'n' ) {
				this.setEmail("");
				break;
			}
			else {
				
			}
		}
	}
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind : " + skind + "name : " + name + "phone : " + phone);
		System.out.println("email : " + email + "company email : " + email + "hobby : " + hobby);
	}
	

}

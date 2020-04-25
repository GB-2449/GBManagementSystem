package gb;

import java.util.Scanner;

public class CompanyGB extends GB {
//	protected String companyPhone;
	protected String companyEmail;
	
	public CompanyGB(GBKind kind){
		super(kind);
	}
	public void getUserInput(Scanner sc) {
		System.out.println("name : ");
		String name = sc.next();
		this.setName(name);

		System.out.println("phone : ");
		int phone = sc.nextInt();
		this.setPhone(phone);

		char answer = 'x';
		while (answer != 'Y' && answer != 'Y' && answer != 'N' && answer != 'n') {
			System.out.println("Have an email? (Y/N)");
			answer = sc.next().charAt(0);
			if (answer == 'Y' || answer == 'y') {
				System.out.println("email : ");
				String email = sc.next();
				this.setEmail(email);
				break;
			}
			else if (answer == 'N' || answer == 'n' ) {
				this.setEmail("");
				break;
			}
			else {
				
			}
		}
		answer = 'x';
		while (answer != 'Y' && answer != 'Y' && answer != 'N' && answer != 'n') {
			System.out.println("Have an company email? (Y/N)");
			answer = sc.next().charAt(0);
			if (answer == 'Y' || answer == 'y') {
				System.out.println("company email : ");
				String email = sc.next();
				this.setEmail(email);
				break;
			}
			else if (answer == 'N' || answer == 'n' ) {
				this.setEmail("");
				break;
			}
			else {
				
			}
		}

		System.out.println("hobby : ");
		String hobby = sc.next();
		this.setHobby(hobby);
	}
	public void printInfo() {
		String skind = "none";
		switch(this.kind) {
		case Family:
			skind = "Family";
			break;
		case Friend:
			skind = "Friend";
			break;
		case Company:
			skind = "Company";
			break;
		default:
			break;
		}
		System.out.println("kind : " + skind);
		System.out.println("name : " + name);
		System.out.println("phone : " + phone);
//		System.out.println("company phone : " + phone);
		System.out.println("email : " + email);
		System.out.println("company email : " + email);
		System.out.println("hobby : " + hobby);
		System.out.println("hobby : " + hobby);
	}
}
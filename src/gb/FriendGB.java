package gb;

import java.util.Scanner;

import exception.EmailFormatException;

public class FriendGB extends GB {
	
	public FriendGB(GBKind kind){
		super(kind);
	}
	
	public void getUserInput(Scanner input) {
		setGBName(input);
		setGBPhone(input);
		setGBEmailwithYN(input);
		setGBHobby(input);
	}
	
	public void setGBEmailwithYN(Scanner input) {
		char answer = 'x';
		while (answer != 'Y' && answer != 'Y' && answer != 'N' && answer != 'n') {
			System.out.println("Have an email? (Y/N)");
			answer = input.next().charAt(0);
			try {
				if (answer == 'Y' || answer == 'y') {
					System.out.println("email : ");
					String email = input.next();
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
			catch(EmailFormatException e){
				System.out.println("Incorrect Email Format. put the email address that contain @");
			}

		}
	}
	
	public void printInfo() {
		String skind = getKindString();
		System.out.println("kind : " + skind + " name : " + name + " phone : " + phone);
		System.out.println("email : " + email + " hobby : " + hobby);
	}
}

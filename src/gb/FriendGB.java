package gb;

import java.util.Scanner;

public class FriendGB extends GB {
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

		System.out.println("hobby : ");
		String hobby = sc.next();
		this.setHobby(hobby);
	}
}

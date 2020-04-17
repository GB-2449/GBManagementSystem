package gb;

import java.util.Scanner;

public class GB{

	protected GBKind kind = GBKind.Family;
	protected String name;
	protected int phone;
	protected String email;
	protected String hobby;
	
	public GB(){
		
	}
	
	public GB(String name, int phone){
		this.name = name;
		this.phone = phone;
	}
	
	public GB(String name, int phone, String email, String hobby){
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.hobby = hobby;
	}
	
	
	public GBKind getKind() {
		return kind;
	}

	public void setKind(GBKind kind) {
		this.kind = kind;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getHobby() {
		return hobby;
	}

	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	
	public void printInfo() {
		System.out.println("name : " + name);
		System.out.println("phone : " + phone);
		System.out.println("email : " + email);
		System.out.println("hobby : " + hobby);
	}
	
	public void getUserInput(Scanner sc) {
		System.out.println("name : ");
		String name = sc.next();
		this.setName(name);
		
		System.out.println("phone : ");
		int phone = sc.nextInt();
		this.setPhone(phone);
		
		System.out.println("email : ");
		String email = sc.next();
		this.setEmail(email);
		
		System.out.println("hobby : ");
		String hobby = sc.next();
		this.setHobby(hobby);
	}
}

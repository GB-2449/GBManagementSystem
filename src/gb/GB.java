package gb;

import java.io.Serializable;
import java.util.Scanner;

import exception.EmailFormatException;

public abstract class GB implements GBInput, Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 835038756262160973L;
	
	protected GBKind kind = GBKind.Family;
	protected String name;
	protected int phone;
	protected String email;
	protected String hobby;
	
	public GB(){
	}
	public GB(GBKind kind){
		this.kind = kind;
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
	
	public GB(GBKind kind, String name, int phone, String email, String hobby){
		this.kind = kind;
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
	public void setEmail(String email) throws EmailFormatException {
		if(!email.contains("@") && !email.equals("")) {
			throw new EmailFormatException();
		}
		this.email = email;
	}
	
	public String getHobby() {
		return hobby;
	}
	public void setHobby(String hobby) {
		this.hobby = hobby;
	}
	public abstract void printInfo();
	
	public void setGBName(Scanner input) {
		System.out.println("이름 : ");
		String name = input.next();
		this.setName(name);
	}
	
	public void setGBPhone(Scanner input) {
		System.out.println("전화번호 : ");
		int phone = input.nextInt();
		this.setPhone(phone);
	}

	public void setGBEmail(Scanner input) {
		String email = "";
		while(!email.contains("@")) {
			System.out.println("이메일 : ");
			email = input.next();
			try {
				this.setEmail(email);
			} catch (EmailFormatException e) {
				System.out.println("Incorrect Email Format. put the email address that contain @");
			}
		}
	}
	
	public void setGBHobby(Scanner input) {
		System.out.println("취미 : ");
		String hobby = input.next();
		this.setHobby(hobby);
	}
	
	public String getKindString() {
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
		return skind;
	}
}
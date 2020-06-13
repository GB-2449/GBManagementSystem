package gb;

import java.util.Scanner;

import exception.EmailFormatException;

public interface GBInput {
	
	public void setName(String name);
	public void setPhone(int phone);
	public void setEmail(String email) throws EmailFormatException;
	public void setHobby(String hobby);
	
	public String getName();
	public int getPhone();
	public String getEmail();
	public String getHobby();
	
	public void getUserInput(Scanner input);
	
	public void printInfo();
	
	public void setGBName(Scanner input);
	public void setGBPhone(Scanner input);
	public void setGBEmail(Scanner input);
	public void setGBHobby(Scanner input);
}
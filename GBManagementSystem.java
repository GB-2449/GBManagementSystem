import java.util.Scanner;

public class MenuManagement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = 5;

		while(num != 6){
			System.out.println("GB Management System Menu");
			System.out.println("1. ADD");
			System.out.println("2. Delete");
			System.out.println("3. Edit");
			System.out.println("4. View");
			System.out.println("5. Show Menu");
			System.out.println("6. Exit");
			num = sc.nextInt();
			if(num == 1)
				Add();
			else if(num == 2)
				Delete();
			else if(num == 3)
				Edit();
			else if(num == 4)
				View();
			else if(num == 5)
				continue;
			else if(num == 6)
				break;
		}
	}

	public static void Add() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("이름 : ");
		String name = sc.next();
		System.out.println("전화번호 : ");
		int PhoneNumber = sc.nextInt();
		System.out.println("이메일 : ");
		String Email = sc.next();
		System.out.println("취미 : ");
		String Hobby = sc.next();
		
		System.out.println("이름 : " + name);
		System.out.println("전화번호 : " + PhoneNumber);
		System.out.println("이메일 : " + Email);
		System.out.println("취미 : " + Hobby);
	}
	
	public static void Delete() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("삭제할 이름을 입력하세요.");
		String i = sc.next();
	}
	
	public static void Edit() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("편집할 이름을 입력하세요.");
		String i = sc.next();
		
	}
	
	public static void View() {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("찾고싶은 이름을 입력하세요.");
		String i = sc.next();
		
	}
}

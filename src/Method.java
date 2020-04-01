import java.util.Scanner;

public class Method {
	GB gb;
	Scanner sc;
	
	Method(Scanner sc){
		this.sc = sc;
	}
	
	public void Add() {
		gb = new GB();
		
		System.out.println("이름 : ");
		gb.name = sc.next();
		System.out.println("전화번호 : ");
		gb.phone = sc.nextInt();
		System.out.println("이메일 : ");
		gb.email = sc.next();
		System.out.println("취미 : ");
		gb.hobby = sc.next();
		System.out.println("입력된 정보는 ");
		gb.printInfo();
	}
	
	public void Delete() {
		System.out.println("삭제할 정보의 전화번호를 입력하세요.");
		
		int phone = sc.nextInt();

		if (gb == null) {
			System.out.println("삭제할 정보가 없습니다.");
			return;
		}
		else if (gb.phone == phone){
			gb = null;
			System.out.println("정보가 삭제되었습니다.");
		}
	}
	public void Edit() {
		System.out.println("편집할 정보의 전화번호를 입력하세요.");
		int phone = sc.nextInt();
		System.out.println("편집 대상의 전화번호는 " + phone);
		if(gb == null) {
			System.out.println("편집할 정보가 없습니다.");
		}
		else if (gb.phone == phone) {
			int num = -1;
			while(num != 5){
				System.out.println("GB Management System Menu");
				System.out.println("1. 이름 편집");
				System.out.println("2. 전화번호 편집");
				System.out.println("3. 이메일 편집");
				System.out.println("4. 취미 편집");
				System.out.println("5. 종료");
				num = sc.nextInt();
				if(num == 1) {
					System.out.println("이름 : ");
					gb.name = sc.next();
				}
				else if(num == 2) {
					System.out.println("전화번호 : ");
					gb.phone = sc.nextInt();
				}
				
				else if(num == 3) {
					System.out.println("이메일 : ");
					gb.email = sc.next();
				}
					
				else if(num == 4) {
					System.out.println("취미 : ");
					gb.hobby = sc.next();
				}
					
				else if(num == 5)
					break;
			}
		}
	}
	
	public void View() {
		System.out.println("찾고싶은 정보의 전화번호를 입력하세요.");
		int phone = sc.nextInt();
		if(gb == null) {
			System.out.println("저장된 정보가 없습니다.");
		}
		else if (gb.phone == phone){
			gb.printInfo();
		}
	}
}

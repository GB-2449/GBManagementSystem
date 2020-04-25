import java.util.ArrayList;
import java.util.Scanner;

import gb.CompanyGB;
import gb.FriendGB;
import gb.GB;
import gb.GBKind;

public class Method {
	ArrayList<GB> gbs = new ArrayList<GB>();
	Scanner sc;
	
	Method(Scanner sc){
		this.sc = sc;
	}
	
	public void Add() {
		int kind = 0;
		GB gb;
		while (kind != 1 && kind != 2) {
			
			System.out.println("1. for Family");
			System.out.println("2. for Friend");
			System.out.println("3. for Company");
			System.out.print("Select Number for GB Kind / 1 ~ 3 : ");
			kind = sc.nextInt();
			if (kind == 1) {
				gb = new GB(GBKind.Family);
				gb.getUserInput(sc);
				gbs.add(gb);
				break;
			}
			else if (kind == 2) {
				gb = new FriendGB(GBKind.Friend);
				gb.getUserInput(sc);
				gbs.add(gb);
				break;
			}
			else if (kind == 3) {
				gb = new CompanyGB(GBKind.Company);
				gb.getUserInput(sc);
				gbs.add(gb);
				break;
			}
			else {
				System.out.println("Select Number for GB Kind : ");
			}
		}
	}
	
	public void Delete() {
		System.out.println("삭제할 정보의 전화번호를 입력하세요.");
		
		int phone1 = sc.nextInt();
		int index = -1;
		for (int i = 0; i<gbs.size(); i++) {
			if (gbs.get(i).getPhone() == phone1) {
				index = i;
				break;
			}
		}
		if (index >= 0) {
			gbs.remove(index);
			System.out.println(phone1 + " 폰 번호와 관련된 정보 삭제!");
			return;
		}
		else { 
			System.out.println("등록된 정보가 없습니다.");
			return;
		}
	}	
	public void Edit() {
		System.out.println("편집할 정보의 전화번호를 입력하세요.");
		int phone1 = sc.nextInt();
		for(int i = 0; i<gbs.size(); i++) {
			GB gb = gbs.get(i);
			if (gb.getPhone() == phone1) {
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
						String name = sc.next();
						gb.setName(name);
					}
					else if(num == 2) {
						System.out.println("전화번호 : ");
						int phone = sc.nextInt();
						gb.setPhone(phone);
					}

					else if(num == 3) {
						System.out.println("이메일 : ");
						String email = sc.next();
						gb.setEmail(email);
					}

					else if(num == 4) {
						System.out.println("취미 : ");
						String hobby = sc.next();
						gb.setHobby(hobby);
					}

					else if(num == 5) {
						break;
					}
				}
			}		
		}
	}
	
	public void Views() {
		System.out.println("registered GB : " + gbs.size());
		for (int i=0; i<gbs.size(); i++) {
			gbs.get(i).printInfo();
		}
	}
}
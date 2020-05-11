import java.util.ArrayList;
import java.util.Scanner;

import gb.CompanyGB;
import gb.FamilyGB;
import gb.FriendGB;
import gb.GBKind;
import gb.GBInput;

public class GBManager {
	ArrayList<GBInput> gbs = new ArrayList<GBInput>();
	Scanner input;
	
	GBManager(Scanner sc){
		this.input = sc;
	}
	
	public void Add() {
		int kind = 0;
		GBInput gbInput;
		while (kind != 1 && kind != 2) {
			
			System.out.println("1. for Family");
			System.out.println("2. for Friend");
			System.out.println("3. for Company");
			System.out.print("Select Number for GB Kind / 1 ~ 3 : ");
			kind = input.nextInt();
			if (kind == 1) {
				gbInput = new FamilyGB(GBKind.Family);
				gbInput.getUserInput(input);
				gbs.add(gbInput);
				break;
			}
			else if (kind == 2) {
				gbInput = new FriendGB(GBKind.Friend);
				gbInput.getUserInput(input);
				gbs.add(gbInput);
				break;
			}
			else if (kind == 3) {
				gbInput = new CompanyGB(GBKind.Company);
				gbInput.getUserInput(input);
				gbs.add(gbInput);
				break;
			}
			else {
				System.out.println("Select Number for GB Kind : ");
			}
		}
	}
	
	public void Delete() {
		System.out.println("������ ������ ��ȭ��ȣ�� �Է��ϼ���.");
		int phone1 = input.nextInt();
		int index = findIndex(phone1);
		removefromGB(index, phone1);
	}
	
	public int findIndex(int phone1) {
		int index = -1;
		for (int i = 0; i<gbs.size(); i++) {
			if (gbs.get(i).getPhone() == phone1) {
				index = i;
				break;
			}
		}
		return index;
	}
	
	public int removefromGB(int index, int phone1) {
		if (index >= 0) {
			gbs.remove(index);
			System.out.println(phone1 + " �� ��ȣ�� ���õ� ���� ����!");
			return 1;
		}
		else { 
			System.out.println("��ϵ� ������ �����ϴ�.");
			return -1;
		}
	}
	
	public void Edit() {
		System.out.println("������ ������ ��ȭ��ȣ�� �Է��ϼ���.");
		int phone1 = input.nextInt();
		for(int i = 0; i<gbs.size(); i++) {
			GBInput gb = gbs.get(i);
			if (gb.getPhone() == phone1) {
				int num = -1;
				while(num != 5){
					showEditMenu();
					num = input.nextInt();
					switch(num) {
					case 1:
						gb.setGBName(input);
						break;
					case 2:
						gb.setGBPhone(input);
						break;
					case 3:
						gb.setGBEmail(input);
						break;
					case 4:
						gb.setGBHobby(input);
						break;
					case 5:
						break;
					default:
						continue;
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
	

	
	public void showEditMenu() {
		System.out.println("GB Management System Menu");
		System.out.println("1. �̸� ����");
		System.out.println("2. ��ȭ��ȣ ����");
		System.out.println("3. �̸��� ����");
		System.out.println("4. ��� ����");
		System.out.println("5. ����");
	}
}
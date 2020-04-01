import java.util.Scanner;

public class Method {
	GB gb;
	Scanner sc;
	
	Method(Scanner sc){
		this.sc = sc;
	}
	
	public void Add() {
		gb = new GB();
		
		System.out.println("�̸� : ");
		gb.name = sc.next();
		System.out.println("��ȭ��ȣ : ");
		gb.phone = sc.nextInt();
		System.out.println("�̸��� : ");
		gb.email = sc.next();
		System.out.println("��� : ");
		gb.hobby = sc.next();
		System.out.println("�Էµ� ������ ");
		gb.printInfo();
	}
	
	public void Delete() {
		System.out.println("������ ������ ��ȭ��ȣ�� �Է��ϼ���.");
		
		int phone = sc.nextInt();

		if (gb == null) {
			System.out.println("������ ������ �����ϴ�.");
			return;
		}
		else if (gb.phone == phone){
			gb = null;
			System.out.println("������ �����Ǿ����ϴ�.");
		}
	}
	public void Edit() {
		System.out.println("������ ������ ��ȭ��ȣ�� �Է��ϼ���.");
		int phone = sc.nextInt();
		System.out.println("���� ����� ��ȭ��ȣ�� " + phone);
		if(gb == null) {
			System.out.println("������ ������ �����ϴ�.");
		}
		else if (gb.phone == phone) {
			int num = -1;
			while(num != 5){
				System.out.println("GB Management System Menu");
				System.out.println("1. �̸� ����");
				System.out.println("2. ��ȭ��ȣ ����");
				System.out.println("3. �̸��� ����");
				System.out.println("4. ��� ����");
				System.out.println("5. ����");
				num = sc.nextInt();
				if(num == 1) {
					System.out.println("�̸� : ");
					gb.name = sc.next();
				}
				else if(num == 2) {
					System.out.println("��ȭ��ȣ : ");
					gb.phone = sc.nextInt();
				}
				
				else if(num == 3) {
					System.out.println("�̸��� : ");
					gb.email = sc.next();
				}
					
				else if(num == 4) {
					System.out.println("��� : ");
					gb.hobby = sc.next();
				}
					
				else if(num == 5)
					break;
			}
		}
	}
	
	public void View() {
		System.out.println("ã����� ������ ��ȭ��ȣ�� �Է��ϼ���.");
		int phone = sc.nextInt();
		if(gb == null) {
			System.out.println("����� ������ �����ϴ�.");
		}
		else if (gb.phone == phone){
			gb.printInfo();
		}
	}
}

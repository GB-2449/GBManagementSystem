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
		System.out.println("�Էµ� ���� ");
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

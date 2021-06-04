package advance.dev;

import java.util.*;

public class MainApp {
	public static void input(Person[] persons) {
		Scanner sc = new Scanner(System.in);
		Person[] tc = new Teacher[1];
		for (int i = 0; i < tc.length; i++) {
			System.out.println("Nhap ten gv: ");
			String tengv = sc.next();
			System.out.println("Nhap sdt: ");
			String sdt = sc.next();
			System.out.println("Nhap ma gv: ");
			String magv = sc.next();
			System.out.println("Nhap tuoi gv: ");
			int tuoigv = sc.nextInt();
			System.out.println("Nhap He so luong: ");
			double hsLuong = sc.nextDouble();
			persons[i] = new Teacher(tengv, sdt, tuoigv, magv, hsLuong);
		}
		Person[] sv = new Student[2];
		for (int i = 0; i < sv.length; i++) {
			System.out.println("Nhap ten sv: ");
			String tensv = sc.next();
			System.out.println("Nhap sdt");
			String sdtsv = sc.next();
			System.out.println("Nhap tuoi sv: ");
			int tuoi = sc.nextInt();
			System.out.println("Nhap diem toan: ");
			double toan = sc.nextDouble();
			System.out.println("Nhap diem ly: ");
			double ly = sc.nextDouble();
			System.out.println("Nhap diem hoa: ");
			double hoa = sc.nextDouble();
			System.out.println("Nhap ma sv: "); 
			String masv = sc.next();
			System.out.println("Nhap lop: ");
			String lop = sc.next();
			persons[i] = new Student(tensv, sdtsv, tuoi, toan, ly, hoa, masv, lop);
		}
	}
	public static void print(Person[] persons) {
		for (int i = 0; i < persons.length; i++) {
			System.out.println(persons[i]);
		}
	}
	public static void main(String[] args) {
		Person[] persons = new Person[3];
		input(persons);
		print(persons);
	}
}

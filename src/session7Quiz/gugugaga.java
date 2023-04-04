package session7Quiz;

import java.util.Scanner;

class Person{
	public String name;
	public int born_date;
	
	public Person(String name, int born_date) {
		this.name = name;
		this.born_date = born_date;
	}
	public void sleep(int decrement){
		System.out.println("Person Sleeping in Class");
	}
}

class Mahasiswa extends Person{
	public int student_id;
	public int point;
	
	public Mahasiswa(String name, int born_date, int student_id, int point) {
		super(name, born_date);
		this.student_id = student_id;
		this.point = point;
	}
	
	public void helpingDosen() {
		point = point + 10;
		System.out.println("After Helping Dosen = " + point);
	}
}

class Dosen extends Person{
	public int code_dosen;
	public int point;
	
	public Dosen(String name, int born_date, int code_dosen, int point) {
		super(name, born_date);
		this.code_dosen = code_dosen;
		this.point = point;
	}
	
	public void selfDev() {
		System.out.println("selfDev");
	}
	
	public void teach() {	
		System.out.println("teach");
	}
	
	public void p2m() {
		System.out.println("p2m");
	}
	
	public void research() {
		System.out.println("research");
	}
	
	public void otherWorks() {
		System.out.println("otherWorks");
	}
}
public class gugugaga {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p = new Person("Bro", 12);
		Mahasiswa m = new Mahasiswa("Sis", 23, 123456789, 85);
		Dosen d = new Dosen("BroSis", 31, 239, 90);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Which class do you wish to see : ");
		System.out.println("1. Person");
		System.out.println("2. Mahasiswa");
		System.out.println("3. Dosen");
		System.out.println("4. Exit");
		System.out.print("Input the Index -> ");
		int index = sc.nextInt();
		
		do {
		if(index == 1) {
			System.out.println("Name: " + p.name);
			System.out.println("Born Date: " + p.born_date);
			p.sleep(10);
			break;
		}
		else if(index == 2) {
			System.out.println("Name: " + m.name);
			System.out.println("Born Date: "+ m.born_date);
			System.out.println("Student ID: " + m.student_id);
			System.out.println("Point: " + m.point);
			m.helpingDosen();
			break;
		}
		else if(index == 3) {
			System.out.println("Name: " + d.name);
			System.out.println("Born Date: " + d.born_date);
			System.out.println("Dosen Code: " + d.code_dosen);
			System.out.println("Point: " + d.point);
			d.selfDev();
			d.teach();
			d.p2m();
			d.research();
			d.otherWorks();	
			break;
		}
		} while(index != 4);
	}

}

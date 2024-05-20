import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	
	public static class Student{
		String name;
		int date;
		int month;
		int year;
		
		Student(String name, int date, int month, int year){
			this.name=name;
			this.date=date;
			this.month=month;
			this.year=year;
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n= sc.nextInt();
		sc.nextLine();
		Student[] students = new Student[n];
		
		for(int i=0; i<n; i++) {
			String info = sc.nextLine();
			String[] temp = info.split(" ");
			String name = temp[0];
			int date = Integer.parseInt(temp[1]);
			int month = Integer.parseInt(temp[2]);
			int year = Integer.parseInt(temp[3]);
			students[i]=new Student(name, date, month, year);
		}
		
		Arrays.sort(students, Comparator
				.comparing((Student s) -> s.year)
				.thenComparing((Student s) -> s.month)
				.thenComparing((Student s) -> s.date)
				);
		
		System.out.println(students[n-1].name);
		System.out.println(students[0].name);
	}
}
package day1assesments;




import java.util.Scanner;

public class grading {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter percentage marks");
		double percentage = scan.nextDouble();

		if(percentage >= 90){
			System.out.println("Distinction: Grade A+");
		}else if(percentage < 90 && percentage >= 80){
			System.out.println("First class with Distinction : Grade A");
		}else if(percentage < 80 && percentage >= 65){
			System.out.println("First class: Grade B+");
		}else if(percentage <65 && percentage >= 50){
			System.out.println("Second class: Grade B");
		}else if(percentage <50){
			System.out.println("Third Class");
		
		}
	}

}
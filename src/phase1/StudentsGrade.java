package phase1;
import java.util.Scanner;


public class StudentsGrade {

	public static void main(String[] args) {
		int marks;
		Scanner obj=new Scanner(System.in);
		System.out.println("enter the marks");
		marks =obj.nextInt();
		if(marks >=90)
			System.out.println("Grade A");
		else if(marks >=80 && marks>70)
			System.out.println("Grade B");
		else if(marks >=70 && marks<80)
			System.out.println("Grade C");
		else if(marks >=60 && marks<70)
			System.out.println("Grade D");
		else
			System.out.println("Fail");
		

	}

}

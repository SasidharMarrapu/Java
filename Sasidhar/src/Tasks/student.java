package Tasks;

import java.util.Scanner;
public class student {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int no_of_students = sc.nextInt();
		
		int grade_A = 0, grade_B = 0, grade_C = 0, grade_D = 0, grade_F = 0;
		
		for(int i = 1; i <= no_of_students; i++) {
			int marks;
			while(true) {
				System.out.println("Enter marks for student " + i + ": ");
				marks = sc.nextInt();
				if(marks >= 0 && marks <=100) {
					break;
				}
				else {
					System.out.println("Invalid input.");
				}
			}
			if(marks >= 90) {
				grade_A++;
			}
			else if (marks >= 80) {
                grade_B++;
            }
			else if (marks >= 70) {
                grade_C++;
            }
			else if (marks >= 60) {
                grade_D++;
            }
			else {
                grade_F++;
            }
			
		}
		
		System.out.println("Total number of students: " + no_of_students);
        System.out.println("Number of students with grade A: " + grade_A);
        System.out.println("Number of students with grade B: " + grade_B);
        System.out.println("Number of students with grade C: " + grade_C);
        System.out.println("Number of students with grade D: " + grade_D);
        System.out.println("Number of students with grade F: " + grade_F);

	} 

}

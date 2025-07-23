package departmental_Performance_Analyzer;

import java.util.Scanner; 
public class studentPerformance { 
	    public static void main(String[] args) { 
	        Scanner sc = new Scanner(System.in); 
	  
	        System.out.print("Enter number of departments: "); 
	        int depCount = sc.nextInt(); 
	 
	        System.out.print("Enter number of students per department: "); 
	        int studentCount = sc.nextInt(); 
	 
	        System.out.print("Enter number of subjects: "); 
	        int subjectCount = sc.nextInt(); 
	 
	        
	        String[][] names = new String[depCount][studentCount]; 
	        int[][][] marks = new int[depCount][studentCount][subjectCount]; 
	 
	        
	        for (int d = 0; d < depCount; d++) { 
	            System.out.println(" Input for Department " + (d + 1) + ": "); 
	            for (int s = 0; s < studentCount; s++) { 
	                sc.nextLine(); 
	                System.out.print("Enter name of Student " + (s + 1) + ": "); 
	                names[d][s] = sc.nextLine(); 
	 
	                for (int sub = 0; sub < subjectCount; sub++) { 
	                    System.out.print("Enter marks for Subject " + (sub + 1) + ": "); 
	                    marks[d][s][sub] = sc.nextInt(); 
	                } 
	            } 
	        } 
	        for (int d = 0; d < depCount; d++) { 
	            System.out.println(" Department " + (d + 1) + " Report "); 
	 
	            int departmentTotal = 0; 
	            int passCount = 0; 
	            int topperScore = -1; 
	            String departmentTopper = ""; 
	 
	            for (int s = 0; s < studentCount; s++) { 
	                int studentTotal = 0; 
	                boolean isPass = true; 
	 
	                for (int sub = 0; sub < subjectCount; sub++) { 
	                    studentTotal += marks[d][s][sub]; 
	                    if (marks[d][s][sub] < 35) { 
	                        isPass = false; 
	                    } 
	                } 
	 
	                float average = (float) studentTotal / subjectCount; 
	                char grade = average >= 90 ? 'A' : 
	                             average >= 75 ? 'B' : 
	                             average >= 60 ? 'C' : 
	                             average >= 35 ? 'D' : 'F'; 
	 
	                if (studentTotal > topperScore) { 
	                    topperScore = studentTotal; 
	                    departmentTopper = names[d][s]; 
	                } 
	 
	                if (isPass) passCount++; 
	 
	                departmentTotal += studentTotal; 
	 
	                System.out.println("Name: " + names[d][s]); 
	                System.out.println("Total: " + studentTotal + " | Avg: " + average + " | Grade: " + grade); 
	                System.out.println("Status: " + (isPass ? "PASS" : "FAIL")); 
	                System.out.println("-------------------"); 
	            } 
	 
	            float departmentAvg = (float)departmentTotal / (studentCount * subjectCount); 
	            float passPercentage = (float)passCount / studentCount * 100; 
	 
	            System.out.println("Department Average Score: " + departmentAvg); 
	            System.out.println("Pass Percentage: " + passPercentage + "%"); 
	            System.out.println("Topper: " + departmentTopper);
	            
	        } 
	    } 
}

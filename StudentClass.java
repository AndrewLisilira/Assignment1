//bsc/ele/02/17 Andrew Lisilira
import java.util.Scanner;

public class StudentClass {
	//declaring variables
    private double[] grades;
    private double sum;
    private String studentName;
    private int numberOfStudents;
	//initialising the input Scanner class
    Scanner input = new Scanner(System.in);

	//getting grades from input 
    public double[] getGrades() {
		
        grades = new double[3];
        for (int x = 0; x<grades.length; x++){
            System.out.println("Enter grade "+( x + 1));
            grades[x] = input.nextDouble();
        }
        return grades;
    }

    public void setGrades(double[] grades) {
        this.grades = grades;
    }
	
	//calculating total sum of the grades
    public double getSum() {
        for (int x = 0; x < grades.length; x++){
            sum += grades[x];
        }
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }
	
    public String getStudentName() {
        System.out.println("Enter student's name : ");
        studentName = input.nextLine();
        return studentName;
    }
	
	//getting name of the student
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
	
	//getting current number of students in the class
    public int getNumberOfStudents() {
        System.out.println("Enter current number of students : ");
        numberOfStudents = input.nextInt();
        return numberOfStudents;
    }

    public void setNumberOfStudents(int numberOfStudents) {
        this.numberOfStudents = numberOfStudents;
    }
	
	//calculating average of the whole grades
    public double getAverage(){
       return getSum() / grades.length;
    }
	//overall output method
    public void outputMethod(){
        System.out.println("The average grade of "+this.studentName+" is "+ getAverage()+", and there are "+this.numberOfStudents+" current students");
    }
}

package codsoft.tasks.task2;

import javax.swing.*;
import java.util.Scanner;

public class GradeCalculator {
    public static void inputMarks(){
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name");
        String student_name = in.next();
        System.out.println("Please enter marks out of 100");
        Scanner sc = new Scanner(System.in);
        int numberOfSubjects = sc.nextInt();

        int[] obtainedMark = new int[numberOfSubjects];
        int totalMarks = 0;

        double averageOfMarks = 0;

        for(int i = 1;i < numberOfSubjects;i++){
            System.out.println("Enter the "+i+" subject marks");
            obtainedMark[i] = sc.nextInt();
            totalMarks += obtainedMark[i];
            averageOfMarks = (totalMarks) / i;
        }
        System.out.println("Total marks obtained by "+student_name+" is "+totalMarks);
            System.out.println("The average marks obtained is " + averageOfMarks + " %");

            if (averageOfMarks >= 97 && averageOfMarks <= 100) {
                System.out.println("You secured A+");
            } else if (averageOfMarks >= 93 && averageOfMarks <= 96) {
                System.out.println("You secured A");
            } else if (averageOfMarks >= 90 && averageOfMarks <= 92) {
                System.out.println("You secured A-");
            } else if (averageOfMarks >= 80 && averageOfMarks <= 89) {
                System.out.println("You secured B");
            } else if (averageOfMarks >= 70 && averageOfMarks <= 79) {
                System.out.println("You secured C-");
            }  else if (averageOfMarks >= 60 && averageOfMarks <= 69) {
                System.out.println("You secured D");

            } else {
                System.out.println("You failed");
            }

    }
    public static void main(String[] args) {
        inputMarks();
    }
}

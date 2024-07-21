package codsoft.tasks.task2;

import java.util.Scanner;

public class GradeCalculator {
    public static void inputMarks(){
        System.out.println("Please enter marks out of 100");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter science marks");
        int scienceMark = sc.nextInt();
        System.out.println("Enter math marks:");
        int mathMark = sc.nextInt();
        System.out.println("Enter computer marks:");
        int computerMark = sc.nextInt();
        System.out.println("Enter geology marks:");
        int geologyMark = sc.nextInt();
        System.out.println("Enter history marks:");
        int historyMark = sc.nextInt();


        int totalMarks = scienceMark + mathMark + computerMark + geologyMark + historyMark;
        System.out.println("The total marks obtained is "+totalMarks);

        int averageOfMarks = (totalMarks) / 5;
        System.out.println("The average marks obtained is "+averageOfMarks + " %");

        if(averageOfMarks >= 97 && averageOfMarks <= 100){
            System.out.println("You secured A+");
        } else if (averageOfMarks >= 93 && averageOfMarks <= 96) {
            System.out.println("You secured A");
        }else if(averageOfMarks >= 90 && averageOfMarks <= 92){
            System.out.println("You secured A-");
        }else if(averageOfMarks >= 87 && averageOfMarks <= 89){
            System.out.println("You secured B+");
        } else if (averageOfMarks>=83 && averageOfMarks <= 86) {
            System.out.println("You secured B");
        }else if(averageOfMarks >= 80 && averageOfMarks <= 82){
            System.out.println("You secured B-");
        }else if(averageOfMarks >= 77 && averageOfMarks <= 79){
            System.out.println("you secured C+");
        }else if(averageOfMarks >= 73 && averageOfMarks <= 76){
            System.out.println("You secured C");
        }else if(averageOfMarks >= 70 && averageOfMarks <= 72){
            System.out.println("You secured C-");
        }else if(averageOfMarks >= 67 && averageOfMarks <= 69){
            System.out.println("You secured D+");
            
        } else if (averageOfMarks >= 65 && averageOfMarks <= 66) {
            System.out.println("You secured D");
            
        }else{
            System.out.println("You failed");
        }
    }
    public static void main(String[] args) {
        inputMarks();
    }
}

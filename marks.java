import java.util.Scanner;

public class marks{

    public static void main (String[] args){
        Scanner scanner = new Scanner(System.in);
        float quiz;
        float assignment;
        float mid;
        float Final;
        float total;
        float average;
        System.out.print("Enter quiz marks: ");
        quiz = scanner.nextFloat();
        if(quiz<0||quiz>100){
            System.out.println("Invalid quiz marks");
        }
        System.out.print("Enter assignment marks: ");
        assignment = scanner.nextFloat();
        if(assignment<0||assignment>100){
            System.out.println("Invalid assignment marks");
        }
        System.out.print("Enter mid marks: ");
        mid = scanner.nextFloat();
        if(mid<0||mid>100){
            System.out.println("Invalid mid terms marks");
        }
        System.out.print("Enter final marks: ");
        Final = scanner.nextFloat();
        if(Final<0||Final>100){
            System.out.println("Invalid final marks");
        }
        total = quiz + assignment + mid + Final;
        if(total<0||total>400){
            System.out.println("Invalid total marks");
        }
        average = total/ 4;
        if(average<0||average>100){
            System.out.println("Invalid average marks");
        }
        System.out.println("Total marks: " + total);
    
        System.out.println("average is "+average);
      
        
}
}
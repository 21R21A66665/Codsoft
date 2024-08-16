import java.util.*;

public class Task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of subjects: ");
        int N = sc.nextInt();
        int subjects[] = new int[N];
        int temp= 0;
        for (int i = 0; i < N; i++) {
            System.out.println("Enter the marks obtained in subject " + (i + 1) + " :");
            subjects[i] = sc.nextInt();
            temp += subjects[i];
        }
        System.out.println("---YOUR RESULT---");
        System.out.println("The total marks obtained in all subjects is: " + temp);
        double percentage = (double) temp / (N * 100) * 100;
        System.out.println("The Average percentage is: " + percentage + "%");
        String grade = gra(percentage);
        System.out.println("The Grade Result: " + grade);
    }

    public static String gra(double percentage) {
        if (percentage >= 90) {
            return "O";
        } else if (percentage >= 80) {
            return "A+";
        } else if (percentage >= 70) {
            return "A";
        } else if (percentage >= 60) {
            return "B+";
        } else if (percentage >= 50) {
            return "B";
        } else if (percentage >= 40) {
            return "C";
        } else {
            return "F";
        }
    }
}

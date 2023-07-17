import java.util.Scanner;

class TestScoreAverage {
    public static void main(String[] args) {

        System.out.println("Programmer: Michael");
        System.out.println();

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter test score ⁠1:        ");
        double score1 = scanner.nextDouble();

        System.out.print("Enter test score ⁠2:        ");
        double score2 = scanner.nextDouble();

        System.out.print("Enter test score ⁠3:        ");
        double score3 = scanner.nextDouble();

        double average = (score1 + score2 + score3) / 3;

        System.out.printf("%s, the average score is %.2f\n", name, average);

        char letterGrade;
        if (average >= 90 && average <= 100) {
            letterGrade = 'A';
        } else if (average >= 80 && average <= 89) {
            letterGrade = 'B';
        } else if (average >= 70 && average <= 79) {
            letterGrade = 'C';
        } else if (average >= 60 && average <= 69) {
            letterGrade = 'D';
        } else {
            letterGrade = 'F';
        }

        System.out.println("The letter grade is " + letterGrade);

        scanner.close();
    }
}
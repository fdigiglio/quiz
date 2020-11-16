import java.util.Scanner;

public class Main {

    public static void main(String[] arg){

        Scanner input = new Scanner(System.in);
        int score = 0;
        int questions = 0;

        System.out.println("Are you ready for the quiz?");
        System.out.println("Lets get rolling!");

        System.out.println("===============================================================");

        System.out.println("Q1) What NBA team was runner up in the finals?");
        System.out.println("\t 1) Miami Heat \n \t 2) Denver Nuggest \n \t 3) Denver Nuggets");
        int answer1 = input.nextInt();

        if (answer1 == 1){
            System.out.println("Correct!!");
            score++;
            questions++;
        } else {
            System.out.println("Wrong");
            questions++;
        }

        System.out.println("===============================================================");

        System.out.println("Q2) Who was the 1st overall pick in the 2019 NBA draft?");
        System.out.println("\t 1) Tyler Herro \n \t 2) Zion Williamson \n \t 3) R.J Barret");
        int answer2 = input.nextInt();

        if (answer2 == 2){
            System.out.println("Correct!!");
            score++;
            questions++;
        } else {
            System.out.println("Wrong");
            questions++;
        }

        System.out.println("===============================================================");

        System.out.println("Q3) Who led the league in scoring?");
        System.out.println("\t 1) James Harden \n \t 2) LeBron James \n \t 3) Giannis");
        int answer3 = input.nextInt();

        if (answer3 == 1){
            System.out.println("Correct!!");
            score++;
            questions++;
        } else {
            System.out.println("Wrong");
            questions++;
        }

        double percentage = 100 * ((double)(score) / (double)(questions));

        System.out.println("You're score is a: " + score + "/" + questions);
        System.out.println("You're percentage is: " + percentage + "%");

    }
}
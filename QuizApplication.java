
import java.util.Scanner;
import java.util.Timer;
import java.util.TimerTask;

public class QuizApplication {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String[] questions = {
            "Who Invented Java?", "What is Default value of an int variable in Java?", "Which operator is used to compare two value in Java?"
        };

        String[][] Options = {
            {"1. Dennis Ritchie", "2. James Gosling", "3. Bjarne Stroustrup", "4. Guido van Rossum"},
            {"1. 1", "2. -1", "3. 0", "4. null"},
            {"1. =", "2. ==", "3.  ===", "4. !="}
        };
        int[] correct_ans = {2, 3, 2};

        int score = 0;

        for (int i = 0; i < questions.length; i++) {
            System.out.println("question" + (i + 1) + ":" + questions[i]);

            for (String option : Options[i]) {
                System.out.println(option);
            }
            System.out.println("you have 30 seconds for answer");
            System.out.println("Enter your answer (1 - 4):");

            Timer timer = new Timer();
            TimerTask task = new TimerTask() {

                @Override
                public void run() {
                    System.out.println("time's up!");
                    System.exit(0);
                }

            };

            timer.schedule(task, 9000);

            System.out.println("Enter answer:");
            int user_answer = sc.nextInt();
            timer.cancel();

            if (user_answer == correct_ans[i]) {
                System.out.println("correct..");
                score++;
            } else {
                System.out.println("Wrong.. , Correct answer is : " + correct_ans[i]);
            }

            System.out.println();

        }
        System.out.println("Quiz Complete.");
        System.out.println("Your Score :" + score + "/" + questions.length);

    }
}

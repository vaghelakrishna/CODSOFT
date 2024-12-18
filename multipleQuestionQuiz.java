import java.util.Timer;
import java.util.TimerTask;
import java.util.Scanner;


public class multipleQuestionQuiz{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String[] questions = {
            "Who Invented Java?" , "what is 5+3?" , "what is 2-2?"
        };

        String[][] Options = {
            {"1. me" , "2. you","3. James Gosling" , "4. we"},   
            {"1. 3" , "2. 3.5","3. 8" , "4. 6"},   
            {"1. 0" , "2. 4","3.  8" , "4. 3"}
        };
            int[] correct_ans = {3,3,1};

            int score = 0 ;

            for (int i = 0 ; i<questions.length;i++){
                System.out.println("question" + (i + 1)+ ":" + questions[i]);

                for (String option : Options[i]){
                System.out.println(option);
                }
                System.out.println("you have 30 seconds for answer");
                  System.out.println("Enter your answer (1 - 4):");

                Timer timer = new Timer();
                TimerTask task = new TimerTask(){
    
                @Override
                public void run(){
                  System.out.println("time's up!");
                  System.exit(0);
                }

                };

                timer.schedule(task,9000);
                
                System.out.println("Enter answer:");
                int user_answer = sc.nextInt();
                 timer.cancel();

                if(user_answer == correct_ans[i]){
                    System.out.println("correct..");
                    score++;
                }
                else{
                   System.out.println("Wrong.. , Correct answer is : " +correct_ans[i]);
                }

                System.out.println();

            }
        System.out.println("Quiz Comlete.");
        System.out.println("Your Score :" + score +"/" + questions.length);
 
    }
}
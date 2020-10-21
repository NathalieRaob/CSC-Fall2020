import java.util.Scanner;

public class QuizDemo 
{
   public static void main(String args[])
   {
       Scanner Keyboard = new Scanner(System.in);
       int question = Keyboard.nextInt();
       Keyboard.nextLine();
       String questions;
       
       Quiz quiz = new Quiz();
       for(int i = 0; i < question; ++i)
       {
           System.out.print("Enter question to add: ");
           questions = Keyboard.nextLine();
           quiz.addQuestion(questions);
       }
       quiz.giveQuiz();
       quiz.display();
   }
}
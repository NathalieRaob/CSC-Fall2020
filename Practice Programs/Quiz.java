import java.util.Scanner;

public class Quiz

{
   private String[] question;
   private String[] answers;
   private int count;
   
   Quiz()
   {
      question = new String[25];
      answers = new String[25];
      count = 0;
   }
   
   public void addQuestion(String question)
   {  
       //   if(count < 25)
//       {
//          question[count] = question;
//       } 
      
         Scanner Keyboard = new Scanner(System.in);
         // System.out.println("Add Questions");
         question = Keyboard.nextLine();
   }
   
   public void giveQuiz()
   { 
      Scanner Keyboard = new Scanner(System.in);
      int count = 1;
      String answer; 
      
      for (int i =0; i<count; i++)
      {
         //count ++ ;
         System.out.println(count + " - " + question[i]);
         answers[i] = Keyboard.nextLine();
         System.out.println(answers);
         
      }
   }
   
   public void display()
   {
      System.out.println("*************************************************************");
      for(int i=0; i<count; i++)
      {
         System.out.println("Question "+ count + ":" + question[i]);
         System.out.println("Answer: "+ answers[i]);
         System.out.println();
      }
   }
   
   
   
   }
   
   
import java.util.Scanner;

class QuizDemo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Questions must be less or equal than 25.");
        System.out.print("Enter number of questions: ");
        int noQuestions = in.nextInt();
        in.nextLine();
        Quiz quiz = new Quiz();
        for (int j = 0; j < noQuestions; j++) {
            System.out.print("Enter question to add: ");
            quiz.add(in.nextLine());
        }
        quiz.giveQuiz();
        quiz.display();
    }
}

class Quiz {
    private String[] questions;
    private String[] answers;
    private int noQuestions;
    private final int max_question = 25;

    public Quiz() {
        questions = new String[max_question];
        answers = new String[max_question];
        noQuestions = 0;
    }

    public void add(String question) {
        if (noQuestions < max_question) {
            questions[noQuestions++] = question;
        }
    }

    public void giveQuiz() {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < noQuestions; i++) {
            System.out.println("QUESTION: " + questions[i]);
            System.out.print("ANSWER: ");
            answers[i] = in.nextLine();
        }
    }

    public void display() {
        for (int i = 0; i < noQuestions; i++) {
            System.out.println("Question: " + questions[i]);
            System.out.println("Your Answer: " + answers[i]);
            System.out.println();
        }
    }
}
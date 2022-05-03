package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Quiz {
    private ArrayList<Question> questions = new ArrayList<Question>();
    private int numberOfQuestionCorrect = 0;
    private Scanner scanner = new Scanner(System.in);


    public Quiz () {

    }


    public void addQuestion(Question question){
        this.questions.add(question);

    }

    public void runQuiz(){

        for (Question question :questions ){

            System.out.println(question.getquestion());

            String userAnswer = this.getUserAnswer();

            boolean usergetquestionCorrect = question.checkAnswer(userAnswer);

            if (usergetquestionCorrect){
                this.numberOfQuestionCorrect++;
            }
        }

        double percentageCorrect =(  (double) this.numberOfQuestionCorrect / (double) this.questions.size()) *  100;
        system.out.printIn("User Grade:" + percentageCorrect + "%");
    }
    private String getUserAnswer(){
        String userAnswer = scanner.nextLine();
        return userAnswer;
    }
}

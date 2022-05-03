package com.company;

public class QuizRunner {
    public static <MultipleChoice> void main(String[] args){
        Quiz myQuiz = new Quiz();

        MultipleChoice mymultiplechoicequestion = new MultipleChoice("what sound does a dog make?\nA:Bark\nB:Quack\nplease just type a single letter as an answer","A");
        myQuiz.addQuestion(mymultiplechoicequestion);

        Checkbox mycheckboxQuestion = new Checkbox("select all that apply, which animals can fly\nA:penguins ,\nB: Dove");
        myQuiz.addQuestion(mycheckboxQuestion);

        TrueFalse myTrueFalseQuestion = new TrueFalse(  "Dogs are omnivores? \n True or False?" , "True");
        myQuiz.addQuestion(myTrueFalseQuestion);

        myQuiz.runQuiz();
    }
}

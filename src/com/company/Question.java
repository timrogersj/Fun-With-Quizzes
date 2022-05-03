package com.company;

public abstract class Question {

    private final String theQuestion;
    private final String theAnswer;


    public  Question(String Question , String answer){
        this.theQuestion = Question;
        this.theAnswer = answer;
    }

    public String getTheQuestion() { return this.theQuestion; }

    public String getTheAnswer() { return this.theAnswer; }

    public abstract boolean checkAnswer(String answer);


}

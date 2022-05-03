package com.company;

import java.util.Scanner;

public abstract class Checkbox extends Question {
    public Checkbox(String question, String answer){
        super(question, answer);
    }

    @Override
    public boolean checkAnswer(String answer){

        String actualAnswer = this.getTheAnswer();
        if(answer.toUpperCase().equals(actualAnswer.toUpperCase())){
            return true;
        }
        return false;
    }
}

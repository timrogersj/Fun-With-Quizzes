package com.company;

import java.util.Scanner;

public class MultipleChoice extends Question {
    public MultipleChoice(String Question, String answer) {
        super(Question, answer);
    }

    @Override
    public boolean checkAnswer(String answer) {

        String actualAnswer = this.getTheAnswer();

        if (answer.toUpperCase().equals(actualAnswer.toUpperCase())) {
            return true;
        }else{
            return false;
        }

    }

}
package com.company;

import java.util.Scanner;

public abstract class Question {

    private int pointValue;
    private String text;
    private int descendantTracker = 0;

    public Question(int pointValue, String text) {
        this.pointValue = pointValue;
        this.text = text;
        descendantTracker ++;
    }

    public void displayQuestion () {
        System.out.println(text);
    }

    public void setPointValue(int x) {
        this.pointValue = x;
    }

    public int getPointValue()  {
        return this.pointValue;
    }

    public abstract void displayAnswers ();

    public abstract int getAnswers();
}
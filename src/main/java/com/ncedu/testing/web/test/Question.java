package com.ncedu.testing.web.test;

import java.util.ArrayList;

public class Question {
    private int id;
    private String text;
    private ArrayList<String> answers = new ArrayList<>();

    public Question(String question, ArrayList<String> answers) {
        this.text = question;
        this.answers = answers;
    }

    public Question(int id, String question, ArrayList<String> answers) {
        this.id = id;
        this.text = question;
        this.answers = answers;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}

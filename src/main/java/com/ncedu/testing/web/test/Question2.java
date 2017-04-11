package com.ncedu.testing.web.test;

import java.util.ArrayList;

public class Question2 {
    private long id;
    private String text;
    private String options;
    private String cAnswer;
    private ArrayList<String> answers;


    public Question2(long id, String text, String options, String cAnswer) {
        this.id = id;
        this.text = text;
        this.options = options;
        this.cAnswer = cAnswer;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getcAnswer() {
        return cAnswer;
    }

    public void setcAnswer(String cAnswer) {
        this.cAnswer = cAnswer;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public void setAnswers() {
        String[] answ = options.split("-");
        for(String ans : answ){
            answers.add(ans);
        }
    }
}

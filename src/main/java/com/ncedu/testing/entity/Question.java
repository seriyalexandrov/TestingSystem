package com.ncedu.testing.entity;

import javax.persistence.*;
import java.util.ArrayList;

@Entity
@Table(name = "questions")
public class Question {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "question_id")
    private Long id;

    @Column(name ="text")
    private String text;

    @Column(name = "options")
    private String options;

    @Column(name = "correct_answer")
    private String cAnswer;

    @ManyToOne(optional=false)
    @JoinColumn(name = "TEST_ID",referencedColumnName = "TEST_ID")
    private Test test;

    private ArrayList<String> answers = new ArrayList<>();

    public Question(String text, String options, String cAnswer, Test test) {
        this.text = text;
        this.options = options;
        this.cAnswer = cAnswer;
        this.test = test;
        this.answers = new ArrayList<String>();
        String[] answ = options.split("-");
        for(String ans : answ){
            this.answers.add(ans);
        }
    }

    public Question() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Question question = (Question) o;

        if (!id.equals(question.id)) return false;
        if (!options.equals(question.options)) return false;
        return test.equals(question.test);

    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + options.hashCode();
        result = 31 * result + test.hashCode();
        return result;
    }

    public void genAnswers() {
        String[] answ = options.split("-");
        for(String ans : answ){
            answers.add(ans);
        }
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    public String getcAnswer() {
        return cAnswer;
    }

    public void setcAnswer(String cAnswer) {
        this.cAnswer = cAnswer;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public ArrayList<String> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<String> answers) {
        this.answers = answers;
    }
}

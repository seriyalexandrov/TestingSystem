package com.ncedu.testing.entity;

import javax.persistence.*;

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
    @JoinColumn(name="TEST_ID",referencedColumnName = "TEST_ID")
    private Test test;

    public Question(String text, String options, String cAnswer, Test test) {
        this.text = text;
        this.options = options;
        this.cAnswer = cAnswer;
        this.test = test;
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
}

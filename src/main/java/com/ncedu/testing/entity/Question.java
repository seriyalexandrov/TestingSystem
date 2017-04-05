package com.ncedu.testing.entity;

import javax.persistence.*;

@Entity
@Table(name = "questions")
public class Question {
    @Id
    @Column(name = "question_id")
    private Long id;
    @Column(name = "options")
    private String options;

    @ManyToOne(optional=false)
    @JoinColumn(name="TEST_ID",referencedColumnName = "TEST_ID")
    private Test test;

    public Question(Long id, String options, Double points, Double test_id) {
        this.id = id;
        this.options = options;
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

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
}

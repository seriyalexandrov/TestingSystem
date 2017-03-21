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
    @Column(name = "points")
    private Double points;
    @Column(name = "test_id")
    private Double test_id;

    public Question(Long id, String options, Double points, Double test_id) {
        this.id = id;
        this.options = options;
        this.points = points;
        this.test_id = test_id;
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
        if (!points.equals(question.points)) return false;
        return test_id.equals(question.test_id);

    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + options.hashCode();
        result = 31 * result + points.hashCode();
        result = 31 * result + test_id.hashCode();
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

    public Double getPoints() {
        return points;
    }

    public void setPoints(Double points) {
        this.points = points;
    }

    public Double getTest_id() {
        return test_id;
    }

    public void setTest_id(Double test_id) {
        this.test_id = test_id;
    }
}

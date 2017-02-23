package com.ncedu.testing.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by dreikaa on 2/20/17.
 */
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

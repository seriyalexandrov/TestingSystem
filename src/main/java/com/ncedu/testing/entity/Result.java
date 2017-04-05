package com.ncedu.testing.entity;

import javax.persistence.*;

/**
 * Created by maxim on 05.04.2017.
 */
@Entity
@Table(name = "results")
public class Result {
    @Id
    @Column(name = "result_id")
    private Long id;

    @Column(name = "points")
    private Double points;

    @ManyToOne(optional=false)
    @JoinColumn(name="TEST_ID",referencedColumnName = "TEST_ID")
    private Test test;

    @ManyToOne(optional=false)
    @JoinColumn(name="USER_ID",referencedColumnName = "USER_ID")
    private Test user;

    public Result() {
    }

    public Result(Long id, Double points, Test test, Test user) {
        this.id = id;
        this.points = points;
        this.test = test;
        this.user = user;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Double getPoints() {
        return points;
    }

    public void setPoints(Double points) {
        this.points = points;
    }

    public Test getTest() {
        return test;
    }

    public void setTest(Test test) {
        this.test = test;
    }

    public Test getUser() {
        return user;
    }

    public void setUser(Test user) {
        this.user = user;
    }

}

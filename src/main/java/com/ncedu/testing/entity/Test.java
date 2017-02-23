package com.hibernate.skill.checker.entitys;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by dreikaa on 2/20/17.
 */
@Entity
@Table(name = "tests")
public class Test {
    @Id
    @Column(name = "test_id")
    private Long id;
    @Column(name = "test_name")
    private String name;
    @Column(name = "test_info")
    private String info;

    public Test(Long id, String name, String info) {
        this.id = id;
        this.name = name;
        this.info = info;
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Test() {
    }
}

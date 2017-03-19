package com.ncedu.testing.entity;

import javax.persistence.*;

/**
 * Created by dreikaa on 2/20/17.
 */
@Entity
@Table(name = "courses")
public class Course {
    @Id
    @Column(name = "course_id")
    private Long id;
    @Column(name = "course_name")
    private String name;
    @Column(name = "course_info")
    private String info;

    public Course(Long id, String name, String info) {
        this.id = id;
        this.name = name;
        this.info = info;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Course course = (Course) o;

        if (!id.equals(course.id)) return false;
        if (!name.equals(course.name)) return false;
        return info.equals(course.info);

    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + info.hashCode();
        return result;
    }

    @GeneratedValue(strategy = GenerationType.AUTO)
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

    public Course() {

    }
}

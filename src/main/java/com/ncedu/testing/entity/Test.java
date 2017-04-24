package com.ncedu.testing.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "tests")
public class Test {
    @Id
    @Column(name = "test_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "test_name")
    private String name;

    @Column(name = "test_info")
    private String info;

    @ManyToOne(optional=false)
    @JoinColumn(name="COURSE_ID",referencedColumnName = "COURSE_ID")
    private Course course;

    @OneToMany(mappedBy = "test")
    private List<Question> questionList;

    public Test(String name, String info, Course course) {
        this.name = name;
        this.info = info;
        this.course = course;
    }

    public Test() {
    }

    public Long getId() {

        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Test test = (Test) o;

        if (!id.equals(test.id)) return false;
        if (!name.equals(test.name)) return false;
        if (!course.equals(test.course)) return false;
        return info.equals(test.info);

    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + info.hashCode();
        result = 31 * result + course.hashCode();
        return result;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
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

    public List<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }
}

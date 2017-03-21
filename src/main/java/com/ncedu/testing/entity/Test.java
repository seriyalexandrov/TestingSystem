package com.ncedu.testing.entity;

import javax.persistence.*;

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

    public Test() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
        return info.equals(test.info);

    }

    @Override
    public int hashCode() {
        int result = id.hashCode();
        result = 31 * result + name.hashCode();
        result = 31 * result + info.hashCode();
        return result;
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
}

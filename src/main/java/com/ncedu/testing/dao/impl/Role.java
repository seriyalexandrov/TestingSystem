//package com.ncedu.testing.dao.impl;
//
//import com.ncedu.testing.entity.User;
//
//import javax.persistence.*;
//import java.util.Set;
//
//@Entity
//@Table(name = "role")
//public class Role {
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    private Long id;
//    private String name;
//    private Set<User> users;
//
//    public Role(String name) {
//        this.name = name;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    @ManyToMany(mappedBy = "roles")
//    public Set<User> getUsers() {
//        return users;
//    }
//
//    public void setUsers(Set<User> users) {
//        this.users = users;
//    }
//}

package com.gfa.springplussql.model;

import jakarta.persistence.*;

@Entity //(name = "foxes")
@Table(name = "foxes")
public class Fox {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;
    private String color;

    @Column(name = "age_in_months")
    private int age;

    public Fox(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }

    public Fox() { //requiered by Hibernate
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

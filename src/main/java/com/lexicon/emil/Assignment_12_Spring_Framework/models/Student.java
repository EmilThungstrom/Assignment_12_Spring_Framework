package com.lexicon.emil.Assignment_12_Spring_Framework.models;

public class Student {

    public int Id;
    public String name;

    public Student(int id, String name) {
        Id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", name='" + name + '\'' +
                '}';
    }
}

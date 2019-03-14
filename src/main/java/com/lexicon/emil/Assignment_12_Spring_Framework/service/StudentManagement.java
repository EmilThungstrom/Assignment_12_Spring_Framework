package com.lexicon.emil.Assignment_12_Spring_Framework.service;

import com.lexicon.emil.Assignment_12_Spring_Framework.models.Student;

import java.util.List;

public interface StudentManagement {
    Student create();
    Student save(Student student);
    Student find(int id);
    void remove(int id);
    List<Student> findAll();
    Student edit(Student student);
}

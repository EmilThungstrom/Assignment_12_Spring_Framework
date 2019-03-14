package com.lexicon.emil.Assignment_12_Spring_Framework.data_access;

import com.lexicon.emil.Assignment_12_Spring_Framework.models.Student;

import java.util.List;

public interface StudentDao {

    Student save(Student student);
    Student findId(int id);
    List<Student> findAll();
    void delete(int id);
}

package com.lexicon.emil.Assignment_12_Spring_Framework.data_access;

import com.lexicon.emil.Assignment_12_Spring_Framework.models.Student;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;
import java.util.Optional;

@Component
public class StudentDaoList implements StudentDao {

    private List<Student> students;

    public StudentDaoList() {
        students = new LinkedList<>();
    }
    @Override
    public Student save(Student student) {
        students.add(student);
        return student;
    }

    @Override
    public Student findId(int id) {
        Optional<Student> student = students.stream().filter(s -> s.Id == id).findFirst();

        if (student.isPresent())
            return student.get();
        else
            return null;
    }

    @Override
    public List<Student> findAll() {
        return students;
    }

    @Override
    public void delete(int id) {
        Optional<Student> student = students.stream().filter(s -> s.Id == id).findFirst();

        if (student.isPresent())
            students.remove(student.get());
    }
}

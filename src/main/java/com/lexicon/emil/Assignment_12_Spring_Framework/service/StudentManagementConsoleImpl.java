package com.lexicon.emil.Assignment_12_Spring_Framework.service;

import com.lexicon.emil.Assignment_12_Spring_Framework.data_access.StudentDao;
import com.lexicon.emil.Assignment_12_Spring_Framework.models.Student;
import com.lexicon.emil.Assignment_12_Spring_Framework.util.UserInputService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class StudentManagementConsoleImpl implements StudentManagement {

    private final UserInputService inputService;
    private final StudentDao studentDao;

    @Autowired
    public StudentManagementConsoleImpl(UserInputService inputService, StudentDao studentDao) {
        this.inputService = inputService;
        this.studentDao = studentDao;
    }

    @Override
    public Student create() {
        return new Student(inputService.getInt(), inputService.getString());
    }

    @Override
    public Student save(Student student) {
        return studentDao.save(student);
    }

    @Override
    public Student find(int id) {
        return studentDao.findId(id);
    }

    @Override
    public void remove(int id) {
        studentDao.delete(id);
    }

    @Override
    public List<Student> findAll() {
        return studentDao.findAll();
    }

    @Override
    public Student edit(Student student) {
        studentDao.delete(student.Id);
        return studentDao.save(student);
    }
}

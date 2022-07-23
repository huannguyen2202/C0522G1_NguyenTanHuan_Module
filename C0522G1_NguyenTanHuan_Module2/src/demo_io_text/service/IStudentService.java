package demo_io_text.service;

import demo_io_text.model.Student;

import java.util.List;

public interface IStudentService {
    void add();
    List<Student> findAll();
}

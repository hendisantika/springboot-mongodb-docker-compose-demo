package com.hendisantika.studentservice.service;

import com.hendisantika.studentservice.entity.Student;

import java.util.Optional;

/**
 * Created by IntelliJ IDEA.
 * Project : student-service
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 24/09/20
 * Time: 20.06
 */
public interface StudentService {
    Iterable<Student> findAll();

    Student save(Student student);

    Optional<Student> findByID(String id);

    void removeStudent(String id);
}

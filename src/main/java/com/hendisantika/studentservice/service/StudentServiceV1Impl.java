package com.hendisantika.studentservice.service;

import com.hendisantika.studentservice.entity.Student;
import com.hendisantika.studentservice.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Created by IntelliJ IDEA.
 * Project : student-service
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 24/09/20
 * Time: 20.07
 */
@Service("v1")
@Primary
@RequiredArgsConstructor
public class StudentServiceV1Impl implements StudentService {

    private final StudentRepository studentRepository;

    @Override
    public Iterable<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Optional<Student> findByID(String id) {
        return studentRepository.findById(id);
    }

    @Override
    public void removeStudent(String id) {
        Student st = new Student();
        st.setId(id);
        studentRepository.delete(st);
    }
}

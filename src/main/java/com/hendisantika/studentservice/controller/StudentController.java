package com.hendisantika.studentservice.controller;

import com.hendisantika.studentservice.entity.Student;
import com.hendisantika.studentservice.service.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by IntelliJ IDEA.
 * Project : student-service
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 24/09/20
 * Time: 20.11
 */
@RestController
@RequestMapping(value = "/api/")
@RequiredArgsConstructor
public class StudentController {

    @Qualifier("v2")
    private final StudentService studentServiceV2;

    @Qualifier("v1")
    private final StudentService studentServiceV1;

    @PostMapping(value = "/v1/student")
    public Student addNewStudent(@RequestBody Student student) {
        return studentServiceV1.save(student);
    }

    @GetMapping(value = "/v1/student")
    public Iterable<Student> studentV1() {
        return studentServiceV1.findAll();
    }

    @GetMapping(value = "/v2/student")
    public Iterable<Student> studentV2() {
        return studentServiceV2.findAll();
    }
}

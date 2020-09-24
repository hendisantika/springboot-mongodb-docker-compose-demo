package com.hendisantika.studentservice.controller;

import com.hendisantika.studentservice.entity.Student;
import com.hendisantika.studentservice.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import static org.springframework.http.MediaType.APPLICATION_JSON_VALUE;

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
@RequestMapping(value = "/api/", consumes = APPLICATION_JSON_VALUE, produces = APPLICATION_JSON_VALUE)
public class StudentController {

    @Autowired
    @Qualifier("v2")
    StudentService studentserviceV2;
    @Autowired
    @Qualifier("v1")
    private StudentService studentserviceV1;

    @RequestMapping(value = "/v1/student", method = RequestMethod.GET)
    public Iterable<Student> studentV1() {
        return studentserviceV1.findAll();
    }

    @RequestMapping(value = "/v2/student", method = RequestMethod.GET)
    public Iterable<Student> studentV2() {
        return studentserviceV2.findAll();
    }
}

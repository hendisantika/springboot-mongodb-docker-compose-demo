package com.hendisantika.studentservice.entity;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Created by IntelliJ IDEA.
 * Project : student-service
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 24/09/20
 * Time: 20.02
 */
@Document
@Data
@NoArgsConstructor
public class Student {

    @Id
    private String id;
    private Integer registration;
    private String name;

    public Student(String id, Integer registration, String name) {
        super();
        this.id = id;
        this.registration = registration;
        this.name = name;
    }

    public Student(String name) {
        super();
        this.name = name;
    }

}

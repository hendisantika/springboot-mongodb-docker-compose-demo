package com.hendisantika.studentservice.repository;

import com.hendisantika.studentservice.entity.Student;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * Created by IntelliJ IDEA.
 * Project : student-service
 * User: hendisantika
 * Email: hendisantika@gmail.com
 * Telegram : @hendisantika34
 * Date: 24/09/20
 * Time: 20.06
 */
public interface StudentRepository extends MongoRepository<Student, String> {
}

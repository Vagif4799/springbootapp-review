package com.vagif;

import com.vagif.Dao.StudentRepository;
import com.vagif.entity.Student;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTest {

    @Autowired
    private StudentRepository studentRepository;

    @Test
   public void testCreateStudent() {

        Student student = new Student();
        student.setName("John");
        student.setCourse("Java Web Services");
        student.setFee(30d);

        studentRepository.save(new Student());

    }

}
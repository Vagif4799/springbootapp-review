package com.vagif.Dao;

import com.vagif.entity.Student;

import java.util.HashMap;
import java.util.Map;

public class StudentDao {

    private static Map<Integer, Student> students;

    static {
        students = new HashMap<Integer, Student>() {
            {
                put(1, new Student(1, "Vagif", "Guliyev"));
                put(2, new Student(2, "Emin", "Alizade"));
                put(3, new Student(3, "Ayyub", "Najafzade"));
            }
        };
    }

}

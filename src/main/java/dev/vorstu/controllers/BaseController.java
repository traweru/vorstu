package dev.vorstu.controllers;

import dev.vorstu.dto.Student;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
@RequestMapping("api/base")
public class BaseController {

    private final List<Student> students = new ArrayList<>();

    @PostConstruct
    private void init() {
        students.add(new Student("User1", "W1", "111"));
        students.add(new Student("User2", "W2", "222"));
        students.add(new Student("User3", "W3", "333"));
    }

    @GetMapping("getAllStudents")
    public List<Student> getAllStudents() {
        return students;
    }

    @GetMapping("check")
    public String greetJava() {
        return "Hello world " + new Date();
    }
}

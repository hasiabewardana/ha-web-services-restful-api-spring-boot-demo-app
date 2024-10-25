package com.example.hawebservicesrestfulapispringbootdemoapp.hello_world_api.web;

import com.example.hawebservicesrestfulapispringbootdemoapp.hello_world_api.domain.Course;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Arrays;
import java.util.List;

@org.springframework.web.bind.annotation.RestController
public class RestController {

    @GetMapping("/course")
    public List<Course> getAllCourses() {
        return Arrays.asList(
                new Course(1, "Learn Spring"),
                new Course(2, "Learn Java"),
                new Course(3, "Learn Docker"),
                new Course(4, "Learn Python")
        );
    }
}

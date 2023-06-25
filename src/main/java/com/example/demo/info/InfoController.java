package com.example.demo.info;

import com.example.demo.info.model.Project;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class InfoController {
    @GetMapping("/info")
    public Object projectInfo(){
        Project project = new Project();
        project.projectName = "preword";
        project.author = "hello-bryan";
        project.createdDate = new Date();
        return project;
    }
}

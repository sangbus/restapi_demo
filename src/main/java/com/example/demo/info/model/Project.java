package com.example.demo.info.model;

import lombok.Data;

import java.util.Date;

@Data
public class Project {
    public String projectName;
    public String author;
    public Date createdDate;
}

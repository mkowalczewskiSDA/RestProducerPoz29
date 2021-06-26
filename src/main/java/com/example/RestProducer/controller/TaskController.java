package com.example.RestProducer.controller;

import com.example.RestProducer.model.dto.TaskDTO;
import com.example.RestProducer.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    TaskService taskService;

    @GetMapping
    public List<TaskDTO> findAll() {
        return taskService.findAll();
    }

}

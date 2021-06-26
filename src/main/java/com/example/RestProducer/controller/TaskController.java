package com.example.RestProducer.controller;

import com.example.RestProducer.model.dto.TaskDTO;
import com.example.RestProducer.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {

    @Autowired
    TaskService taskService;

    @GetMapping
    public List<TaskDTO> findAll() {
        List<TaskDTO> test = taskService.findAll();
        return test;
    }

    @PutMapping("/{id}")
    public TaskDTO update(@PathVariable Integer id, @RequestBody TaskDTO dto) {
        return taskService.update(id, dto);
    }

}

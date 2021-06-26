package com.example.RestProducer.service;

import com.example.RestProducer.model.dto.TaskDTO;
import com.example.RestProducer.repository.TaskRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

public class TaskServiceImpl implements TaskService {

    @Autowired
    TaskRepository taskRepository;
    @Autowired
    ModelMapper modelMapper;

    @Override
    public List<TaskDTO> findAll() {
        return taskRepository.findAll()
                .stream()
                .map(task -> modelMapper.map(task, TaskDTO.class))
                .collect(Collectors.toList());
    }
}

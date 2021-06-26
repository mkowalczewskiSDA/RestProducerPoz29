package com.example.RestProducer.service;

import com.example.RestProducer.model.Task;
import com.example.RestProducer.model.dto.TaskDTO;
import com.example.RestProducer.repository.TaskRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    TaskRepository taskRepository;
    @Autowired
    ModelMapper modelMapper;

    @Override
    public List<TaskDTO> findAll() {
        var list = taskRepository.findAll();
        var returnList = list
                .stream()
                .map(task -> modelMapper.map(task, TaskDTO.class))
                .collect(Collectors.toList());
        System.out.println("test");
        return returnList;
    }

    @Override
    public TaskDTO update(Integer id, TaskDTO taskDTO) {
        Task task = taskRepository.getById(id);
        task.setCompleted(taskDTO.isCompleted());
        taskRepository.save(task);
        return modelMapper.map(task, TaskDTO.class);
    }
}

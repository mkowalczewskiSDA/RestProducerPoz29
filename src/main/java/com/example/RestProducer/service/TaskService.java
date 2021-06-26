package com.example.RestProducer.service;

import com.example.RestProducer.model.dto.TaskDTO;

import java.util.List;

public interface TaskService {

    List<TaskDTO> findAll();

    TaskDTO update(Integer id, TaskDTO taskDTO);
}

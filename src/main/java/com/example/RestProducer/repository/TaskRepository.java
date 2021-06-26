package com.example.RestProducer.repository;

import com.example.RestProducer.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Integer> {
}

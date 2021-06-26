package com.example.RestProducer.model.dto;

import com.example.RestProducer.model.User;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class TaskDTO {
    private Integer id;
    private String description;
    private boolean completed;
    private Integer completionPercentage;
    private User user;
}

package com.example.taskboard.dto;

import com.example.taskboard.model.*;
import lombok.*;
import java.time.LocalDateTime;

@Getter @Setter @NoArgsConstructor @AllArgsConstructor
public class TaskDtos {
    private String title;
    private String description;
    private String priority;
    private Long assigneeId;
    private String status;
    private LocalDateTime dueDate;
}





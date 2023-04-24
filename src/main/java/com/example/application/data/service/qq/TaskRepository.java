package com.example.application.data.service.qq;

import com.example.application.data.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface TaskRepository
        extends
            JpaRepository<Task, Long>,
            JpaSpecificationExecutor<Task> {

}

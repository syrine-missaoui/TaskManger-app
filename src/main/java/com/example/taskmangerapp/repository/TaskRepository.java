package com.example.taskmangerapp.repository;

import com.example.taskmangerapp.entity.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task,Long> {

}

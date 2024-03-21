package com.example.taskmangerapp.resolver;

import com.example.taskmangerapp.entity.Task;
import com.example.taskmangerapp.service.TaskService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import org.springframework.stereotype.Component;

@Component
public class MutationResolver implements GraphQLMutationResolver {

    private final TaskService taskService;

    public MutationResolver(TaskService taskService) {
        this.taskService = taskService;
    }

    public MutationResolver() {

    }

    public Task createTask(String title, String description, String dueDate) {
        return taskService.createTask(title, description, dueDate);
    }

    public Task updateTask(Long id, String title, String description, String dueDate) {
        return taskService.updateTask( title, description, dueDate);
    }

    public Task deleteTask(Long id) {
        return taskService.deleteTask(id);
    }

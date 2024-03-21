package com.example.taskmangerapp.resolver;

import com.example.taskmangerapp.entity.Task;
import com.example.taskmangerapp.service.TaskService;
import graphql.kickstart.tools.GraphQLMutationResolver;
import graphql.kickstart.tools.GraphQLQueryResolver;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class QueryResolver implements GraphQLQueryResolver {
    private final TaskService taskService;

    public QueryResolver(TaskService taskService) {
        this.taskService = taskService;
    }
    public List<Task> getAllTasks() {
        return taskService.getAllTasks();
    }
    public Task getTaskById(Long id) {
        return taskService.getTaskById(id);
    }








}}

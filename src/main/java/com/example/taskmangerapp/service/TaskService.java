package com.example.taskmangerapp.service;
import com.example.taskmangerapp.entity.Task;
import com.example.taskmangerapp.repository.TaskRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TaskService {
    private final TaskRepository taskRepository;
@Autowired
    public TaskService(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    public List<Task>getAllTasks(){
        return taskRepository.findAll();
    }
    public Task getTaskById(Long id){
        return taskRepository.findById(id).orElse(null);
    }

    public  Task createTask(Task task){
        return taskRepository.save(task);
    }
    public Task updateTask(Long id,Task updatedtask){
    Task existingTask=taskRepository.findById(id).orElse(null);
       if(existingTask!=null){
           existingTask.setTitle(updatedtask.getTitle());
           existingTask.setDescription(updatedtask.getDescription());
           existingTask.setDueDate(updatedtask.getDueDate());
           return taskRepository.save(existingTask);
       }
       return null;
    }

    public boolean deleteTask(Long id){
        Task  existingTask =taskRepository.findById(id).orElse(null);
        if(existingTask!=null){
            taskRepository.delete(existingTask);
            return true;
        }
        return false;
    }



}


package com.tary.Task.Manager.services;

import com.tary.Task.Manager.entities.Task;
import com.tary.Task.Manager.repositories.TaskRepository;
import com.tary.Task.Manager.task.TaskEventProducer;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    private final TaskRepository taskRepository;
    private final TaskEventProducer taskEventProducer;

    public TaskService(TaskRepository taskRepository, TaskEventProducer taskEventProducer){
        this.taskRepository = taskRepository;
        this.taskEventProducer = taskEventProducer;
    }

    public List<Task> getAllTasks(){
        return taskRepository.findAll();
    }

    public Optional<Task> getTaskById(Long id){
        return taskRepository.findById(id);
    }

    public Task CreateTask(Task task){
        Task savedTask = taskRepository.save(task);
        taskEventProducer.sendTaskEvent("Task criada: " + savedTask);
        return savedTask;
    }

    public Task updateTask(Long id, Task updatedTask){
        return taskRepository.findById(id)
                .map(task -> {
                    task.setTitle(updatedTask.getTitle());
                    task.setDescription(updatedTask.getDescription());
                    task.setCompleted(updatedTask.isCompleted());
                    Task savedTask = taskRepository.save(task);
                    taskEventProducer.sendTaskEvent("Task atualizada: " + savedTask);
                    return savedTask;

                })
                .orElseThrow(() -> new RuntimeException("Task Not Found"));
    }

    public void deleteTask(Long id){
        taskRepository.deleteById(id);
        taskEventProducer.sendTaskEvent("Task deletada: ID" + id);
    }
}
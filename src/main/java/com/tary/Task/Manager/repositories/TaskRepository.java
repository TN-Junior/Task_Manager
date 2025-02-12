package com.tary.Task.Manager.repositories;

import com.tary.Task.Manager.entities.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Long> {
}

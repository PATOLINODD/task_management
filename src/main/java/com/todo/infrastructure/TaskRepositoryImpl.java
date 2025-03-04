/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.todo.infrastructure;

import com.todo.domain.entities.Task;
import com.todo.domain.entities.Employe;
import com.todo.domain.repositories.TaskRepository;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author manin
 */
public class TaskRepositoryImpl implements TaskRepository {

    @Override
    public boolean alocateUser(Employe user, Task task) {
    }

    @Override
    public Task save(Task task) {
    }

    @Override
    public boolean finishTask(UUID id) {
    }

    @Override
    public List<Task> getPendents() {
    }

    @Override
    public Task toDomain(Object obj) {
    }

    @Override
    public Object fromDomain(Employe user, Class objClass) {
    }
    
}

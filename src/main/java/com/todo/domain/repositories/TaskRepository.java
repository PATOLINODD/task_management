/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.todo.domain.repositories;

import com.todo.domain.entities.Task;
import com.todo.domain.entities.Employe;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author manin
 */
public interface TaskRepository {
    
    public boolean alocateUser(Employe user, Task task);
    public Task save(Task task);
    public boolean finishTask(UUID id);
    public List<Task> getPendents();
    public Task toDomain(Object obj);
    public Object fromDomain(Employe user, Class objClass);
}

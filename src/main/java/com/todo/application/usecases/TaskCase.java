/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.todo.application.usecases;

import com.todo.domain.entities.Task;
import com.todo.domain.entities.Employe;
import com.todo.domain.exceptions.InvalidDepartmentException;
import com.todo.domain.repositories.TaskRepository;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author manin
 */
public class TaskCase {
    private TaskRepository taskRep;
    
    public TaskCase(TaskRepository taskRep){
        this.taskRep = taskRep;
    }
    
    public boolean alocateUser(Employe user, Task task) throws InvalidDepartmentException{
        if(!user.taksHasSameDep(task)) throw new InvalidDepartmentException("Não é possivel alocar esse usuario nessa tarefa. Pessoa não pertence a esse departamento.");
        return this.taskRep.alocateUser(user, task);
    }
    
    public Task save(Task task){
        return this.taskRep.save(task);
    }
    
    public boolean finishTask(UUID id){
        return this.taskRep.finishTask(id);
    }
    
    public List<Task> getPendents(){
        return this.taskRep.getPendents();
    }
}

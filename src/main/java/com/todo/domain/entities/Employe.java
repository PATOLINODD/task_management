/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.todo.domain.entities;

import java.util.List;
import java.util.UUID;

/**
 *
 * @author manin
 */
public class Employe {

    private UUID id;
    private String name;
    private String department;
    private List<Task> tasks;
    
    public Long get_total_spent_hours(){
        return tasks.stream().map(task -> task.getDuration()).reduce((acc, cur) -> acc + cur).get();
    }
    
    public Long get_average_spent_hours(){
        return this.get_total_spent_hours() / tasks.size();
    }
    
    public boolean isEmpty(){
        return this.name.isBlank() || this.department.isBlank();
    }
    
    public boolean taksHasSameDep(Task task){
        return task.getDepartment().equals(this.department);
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public void setTasks(List<Task> tasks) {
        this.tasks = tasks;
    }

    
}

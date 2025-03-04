/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.todo.presentation.dtos;

import java.util.UUID;

/**
 *
 * @author manin
 */
public class EmployeDTO {
    
    private UUID id;
    private String name;
    private String department;
    private Long averageSpentHours;
    private Long totalSpentHours;

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

    public Long getAverageSpentHours() {
        return averageSpentHours;
    }

    public void setAverageSpentHours(Long averageSpentHours) {
        this.averageSpentHours = averageSpentHours;
    }

    public Long getTotalSpentHours() {
        return totalSpentHours;
    }

    public void setTotalSpentHours(Long totalSpentHours) {
        this.totalSpentHours = totalSpentHours;
    }
    
}

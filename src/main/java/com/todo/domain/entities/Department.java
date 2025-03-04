/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.todo.domain.entities;

/**
 *
 * @author manin
 */
public class Department {
    
    private String department;
    private int quantityUsers;
    private int quantityTasks;

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getQuantityUsers() {
        return quantityUsers;
    }

    public void setQuantityUsers(int quantityUsers) {
        this.quantityUsers = quantityUsers;
    }

    public int getQuantityTasks() {
        return quantityTasks;
    }

    public void setQuantityTasks(int quantityTasks) {
        this.quantityTasks = quantityTasks;
    }
    
    
}

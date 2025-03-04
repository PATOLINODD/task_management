/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.todo.domain.repositories;

import com.todo.domain.entities.Department;

/**
 *
 * @author manin
 */
public interface DepartmentRepository {
    
    public Department get(String dep);
}

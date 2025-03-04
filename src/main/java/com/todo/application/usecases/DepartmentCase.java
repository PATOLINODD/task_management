/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.todo.application.usecases;

import com.todo.domain.entities.Department;
import com.todo.domain.repositories.DepartmentRepository;

/**
 *
 * @author manin
 */
public class DepartmentCase {
    
    private DepartmentRepository depRep;
    
    public DepartmentCase(DepartmentRepository depRep){
        this.depRep = depRep;
    }
    
    public Department get(String dep){
        return this.depRep.get(dep);
    }

}


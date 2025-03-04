/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.todo.domain.repositories;

import com.todo.domain.entities.Employe;
import com.todo.domain.exceptions.NullOrEmptyPointerException;
import jakarta.persistence.EntityExistsException;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author manin
 */
public interface EmployeRepository {
    
    /**
     * Method returns all employes from database
     * @return List<User>
     */
    public List getAll();
    /**
     * Method returns true if it has success to delete the object target or false if instead
     * @param user_id
     * @return 
     */
    public boolean delete(UUID user_id);
    /**
     * Method returns true if it has success to update the target or false if instead
     * @param user
     * @return 
     */
    public boolean update(Employe user);
    /**
     * Mehtod returns an object if it has success to persist this object into database or null if instead.
     * Throws NullOrEmpyPointerException if the object is null or the fields are not filled.
     * Throws EntityExistsException if the object already exists in the database.
     * @param employe
     * @param objClass
     * @return object
     * @exception NullOrEmptyPointerException, EntityExistsException
     */
    public Object save(Employe employe) throws NullOrEmptyPointerException, EntityExistsException;
    /**
     * Method used to parse some object to model object. If the fields do not match, it will throw an exception
     * @param obj
     * @return Object
     * @exception InvalidObjectToParseExcpetion
     */
    public Object toModel(Object obj) throws InvalidObjectToParseException;
    /**
     * Method used to parse employe object to another object.
     * @param obj
     * @return Object
     */
    public Object fromModel(Object obj);
}

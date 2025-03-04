/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.todo.application.usecases;

import com.todo.domain.entities.Employe;
import com.todo.domain.exceptions.NullOrEmptyPointerException;
import java.util.List;
import java.util.UUID;
import com.todo.domain.repositories.EmployeRepository;

/**
 *
 * @author manin
 */
public class EmployeCase {
    private EmployeRepository userRep;
    
    public EmployeCase(EmployeRepository userRep){
        this.userRep = userRep;
    }
    
    public Employe save(Employe user) throws NullOrEmptyPointerException {
        if(user == null || user.isEmpty()) throw new NullOrEmptyPointerException("Erro ao tentar salvar essa pessoa. Talvez não exista valores preenchidos.");
        return this.userRep.save(user, user.getClass());
    }
    
    public List<Employe> getAll(){
        return this.userRep.getAll();
    }
    
    public boolean update(Employe user){
        return this.userRep.update(user);
    }
    
    public boolean delete(UUID user_id){
        return this.userRep.delete(user_id);
    }
    
}

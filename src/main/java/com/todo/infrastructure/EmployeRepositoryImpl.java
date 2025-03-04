/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.todo.infrastructure;

import com.todo.domain.entities.Employe;
import com.todo.domain.exceptions.NullOrEmptyPointerException;
import java.util.List;
import java.util.UUID;
import com.todo.domain.repositories.EmployeRepository;
import com.todo.presentation.dtos.EmployeDTO;
import com.todo.presentation.models.EmployeModel;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityManager;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author manin
 */
@ApplicationScoped
public class EmployeRepositoryImpl implements EmployeRepository {
    
    private static final Logger log = Logger.getLogger(EmployeRepositoryImpl.class.getName());

    @Inject
    private EntityManager entityManager;
    
    @Override
    public List getAll(Class objClass) {
        log.log(Level.INFO, "Entering in method getAll");
        entityManager.createQuery("SELECT emp FROM employes emp", EmployeModel.class)
                .getResultList().stream().map(this::fromDomain);
    }

    @Override
    public boolean delete(UUID user_id) {
        log.log(Level.INFO, "Entering in method delete");
        return false;

    }

    @Override
    public boolean update(Employe user) {
        log.log(Level.INFO, "Entering in method update");
        return false;

    }

    @Override
    public Object save(EmployeDTO employe) throws NullOrEmptyPointerException, EntityExistsException {
        log.log(Level.INFO, "Entering in method save");
        Employe domainEmp = this.toDomain();
        if(employe == null || employe.isEmpty()) throw new NullOrEmptyPointerException("Esse trabalhador deve ter todos os dados preenchidos. Verifique os dados e tente novamente.");
        try {
            this.entityManager.persist(employe);
        } catch (EntityExistsException e) {
            log.log(Level.SEVERE, "Error to try persist the object into database!", e);
            throw new EntityExistsException("The object already exists");
        }
        return employe;
    }

    @Override
    public Object toModel(Object empDTO) {
        Employe domainEmp = new Employe();
        domainEmp.setName(((EmployeModel)empDTO).getName());
        domainEmp.setDepartment(((EmployeModel)empDTO).getDepartment());
        return domainEmp;
    }

    @Override
    public Object fromModel() {
    }

}

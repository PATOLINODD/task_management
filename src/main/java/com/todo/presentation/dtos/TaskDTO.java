/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.todo.presentation.dtos;

import java.time.LocalDate;
import java.util.UUID;

/**
 *
 * @author manin
 */
public class TaskDTO {

    private String title;
    private String description;
    private String department;
    private LocalDate end_date;
    private Long duration;
    private boolean isFinished;
}

package com.example.application.data.entity;

import jakarta.persistence.Entity;

@Entity
public class Task extends AbstractEntity {

    private String taskObjective;
    private boolean taskStatus;
    private String firstName;
    private String lastName;

    public String getTaskObjective() {
        return taskObjective;
    }

    public void setTaskObjective(String txt) {
        this.taskObjective = txt;
    }

    public boolean isTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(boolean status) {
        this.taskStatus = status;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}

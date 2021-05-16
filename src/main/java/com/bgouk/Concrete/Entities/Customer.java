package com.bgouk.Concrete.Entities;

import com.bgouk.Abstract.IEntity;

import java.time.LocalDate;

public class Customer implements IEntity {
    private int id;
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;
    private Long nationalityId;

    public Customer(int id, String firstName, String lastName, LocalDate dateOfBirth, Long nationalityId) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.nationalityId = nationalityId;
    }


    public Customer() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public void setNationalityId(Long nationalityId) {
        this.nationalityId = nationalityId;
    }

    public Long getNationalityId() {
        return nationalityId;
    }
}
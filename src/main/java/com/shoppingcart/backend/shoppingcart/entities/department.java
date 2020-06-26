/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shoppingcart.backend.shoppingcart.entities;

/**
 *
 * @author maradona
 */
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.Column;

@Entity
@Table(name="department")
public
        class department {
    @Id
    @Column(name="department_id")
    private Long department_id;
    
    @Column(name="name")
    private String name;
    
    @Column(name="description")
    private String description;

    public
    department() {
    }

    public
    department(Long department_id, String name, String description) {
        this.department_id = department_id;
        this.name = name;
        this.description = description;
    }

    public
    Long getDepartment_id() {
        return department_id;
    }

    public
    void setDepartment_id(Long department_id) {
        this.department_id = department_id;
    }

    public
    String getName() {
        return name;
    }

    public
    void setName(String name) {
        this.name = name;
    }

    public
    String getDescription() {
        return description;
    }

    public
    void setDescription(String description) {
        this.description = description;
    }
    
    @Override
    public
    String toString() {
        return "department{" + "department_id=" + department_id + ", name=" + name + ", description=" + description + '}';
    }
}
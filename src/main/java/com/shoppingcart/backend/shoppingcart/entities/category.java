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
@Table(name="category")
public
        class category {
    @Id
    @Column(name="category_id")
    private Long category_id;
    
    @Column(name="department_id")
    private int department_id;
    
    @Column(name="name")
    private String name;
    
    @Column(name="description")
    private String description;

    public
    category() {
    }

    public
    category(Long category_id, int department_id, String name, String description) {
        this.category_id = category_id;
        this.department_id = department_id;
        this.name = name;
        this.description = description;
    }

    public
    Long getCategory_id() {
        return category_id;
    }

    public
    void setCategory_id(Long category_id) {
        this.category_id = category_id;
    }

    public
    int getDepartment_id() {
        return department_id;
    }

    public
    void setDepartment_id(int department_id) {
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
        return "category{" + "category_id=" + category_id + ", department_id=" + department_id + ", name=" + name + ", description=" + description + '}';
    }
    
}
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
@Table(name="attribute")
public
        class attribute {
    
    @Id
    @Column(name="attribute_id")
    private Long attribute_id;
    
    @Column(name="name")
    private String name;

    public
    attribute() {
    }

    public
    attribute(Long attribute_id, String name) {
        this.attribute_id = attribute_id;
        this.name = name;
    }

    public
    Long getAttribute_id() {
        return attribute_id;
    }

    public
    void setAttribute_id(Long attribute_id) {
        this.attribute_id = attribute_id;
    }

    public
    String getName() {
        return name;
    }

    public
    void setName(String name) {
        this.name = name;
    }

    @Override
    public
    String toString() {
        return "attribute{" + "attribute_id=" + attribute_id + ", name=" + name + '}';
    }
    
    
}
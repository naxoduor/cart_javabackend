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
@Table(name="attribute_value")
public
        class attribute_value {
    @Id
    @Column(name="attribute_value_id")
    private Long attribute_value_id;
    
    @Column(name="attribute_id")
    private int attribute_id;
    
    @Column(name="value")
    private String value;

    public
    attribute_value() {
    }

    public
    attribute_value(Long attribute_value_id, int attribute_id, String value) {
        this.attribute_value_id = attribute_value_id;
        this.attribute_id = attribute_id;
        this.value = value;
    }

    public
    Long getAttribute_value_id() {
        return attribute_value_id;
    }

    public
    void setAttribute_value_id(Long
                               
                               attribute_value_id) {
        this.attribute_value_id = attribute_value_id;
    }

    public
    int getAttribute_id() {
        return attribute_id;
    }

    public
    void setAttribute_id(int attribute_id) {
        this.attribute_id = attribute_id;
    }

    public
    String getValue() {
        return value;
    }

    public
    void setValue(String value) {
        this.value = value;
    }

    @Override
    public
    String toString() {
        return "attribute_value{" + "attribute_value_id=" + attribute_value_id + ", attribute_id=" + attribute_id + ", value=" + value + '}';
    }
    
    
}
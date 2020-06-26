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
import java.time.LocalDateTime; 

@Entity
@Table(name="order")
public
        class order {
    @Id
    @Column(name="orer_id")
    private Long order_id;
    
    @Column(name="total_amount")
    private double total_amount;
    
    @Column(name="created_on")
    private LocalDateTime created_on;
    
    @Column(name="shipped_on")
    private LocalDateTime shipped_on;
    
    @Column(name="status")
    private int status;
    
    @Column(name="comments")
    private String comments;
    
    @Column(name="customer_id")
    private int customer_id;
    
    @Column(name="auth_code")
    private String auth_code;
    
    @Column(name="reference")
    private String reference;
    
    @Column(name="shipping_region_id")
    private int shipping_region_id;
    
    @Column(name="tax_i")
    private int tax_id;

    public
    order() {
    }

    public
    order(Long order_id, double total_amount, LocalDateTime created_on, LocalDateTime shipped_on, int status, String comments, int customer_id, String auth_code, String reference, int shipping_region_id, int tax_id) {
        this.order_id = order_id;
        this.total_amount = total_amount;
        this.created_on = created_on;
        this.shipped_on = shipped_on;
        this.status = status;
        this.comments = comments;
        this.customer_id = customer_id;
        this.auth_code = auth_code;
        this.reference = reference;
        this.shipping_region_id = shipping_region_id;
        this.tax_id = tax_id;
    }

    public
    Long getOrder_id() {
        return order_id;
    }

    public
    void setOrder_id(Long order_id) {
        this.order_id = order_id;
    }

    public
    double getTotal_amount() {
        return total_amount;
    }

    public
    void setTotal_amount(double total_amount) {
        this.total_amount = total_amount;
    }

    public
    LocalDateTime getCreated_on() {
        return created_on;
    }

    public
    void setCreated_on(LocalDateTime created_on) {
        this.created_on = created_on;
    }

    public
    LocalDateTime getShipped_on() {
        return shipped_on;
    }

    public
    void setShipped_on(LocalDateTime shipped_on) {
        this.shipped_on = shipped_on;
    }

    public
    int getStatus() {
        return status;
    }

    public
    void setStatus(int status) {
        this.status = status;
    }

    public
    String getComments() {
        return comments;
    }

    public
    void setComments(String comments) {
        this.comments = comments;
    }

    public
    int getCustomer_id() {
        return customer_id;
    }

    public
    void setCustomer_id(int customer_id) {
        this.customer_id = customer_id;
    }

    public
    String getAuth_code() {
        return auth_code;
    }

    public
    void setAuth_code(String auth_code) {
        this.auth_code = auth_code;
    }

    public
    String getReference() {
        return reference;
    }

    public
    void setReference(String reference) {
        this.reference = reference;
    }

    public
    int getShipping_region_id() {
        return shipping_region_id;
    }

    public
    void setShipping_region_id(int shipping_region_id) {
        this.shipping_region_id = shipping_region_id;
    }

    public
    int getTax_id() {
        return tax_id;
    }

    public
    void setTax_id(int tax_id) {
        this.tax_id = tax_id;
    }

    @Override
    public
    String toString() {
        return "order{" + "order_id=" + order_id + ", total_amount=" + total_amount + ", created_on=" + created_on + ", shipped_on=" + shipped_on + ", status=" + status + ", comments=" + comments + ", customer_id=" + customer_id + ", auth_code=" + auth_code + ", reference=" + reference + ", shipping_region_id=" + shipping_region_id + ", tax_id=" + tax_id + '}';
    }   
}
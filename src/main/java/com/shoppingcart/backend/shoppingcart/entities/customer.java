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
@Table(name="customer")
public
        class customer {
    @Id
    @Column(name="customer_id")
    private Long customer_id;
    
    @Column(name="name")
    private String name;
    
    @Column(name="email")
    private String email;
    
    @Column(name="password")
    private String password;
    
    @Column(name="credit_card")
    private String credit_card;
    
    @Column(name="adress_1")
    private String address_1;
    
    @Column(name="address_2")
    private String address_2;
    
    @Column(name="city")
    private String city;
    
    @Column(name="region")
    private String region;
    
    @Column(name="postal_code")
    private String postal_code;
    
    @Column(name="country")
    private String country;
    
    @Column(name="shipping_region_id")
    private int shipping_region_id;
    
    @Column(name="day_phone")
    private String day_phone;
    
    @Column(name="eve_phone")
    private String eve_phone;
    
    @Column(name="mob_phone")
    private String mob_phone;   

    public
    customer() {
    }

    public
    customer(Long customer_id, String name, String email, String password, String credit_card, String address_1, String address_2, String city, String region, String postal_code, String country, int shipping_region_id, String day_phone, String eve_phone, String mob_phone) {
        this.customer_id = customer_id;
        this.name = name;
        this.email = email;
        this.password = password;
        this.credit_card = credit_card;
        this.address_1 = address_1;
        this.address_2 = address_2;
        this.city = city;
        this.region = region;
        this.postal_code = postal_code;
        this.country = country;
        this.shipping_region_id = shipping_region_id;
        this.day_phone = day_phone;
        this.eve_phone = eve_phone;
        this.mob_phone = mob_phone;
    }

    public
    Long getCustomer_id() {
        return customer_id;
    }

    public
    void setCustomer_id(Long customer_id) {
        this.customer_id = customer_id;
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
    String getEmail() {
        return email;
    }

    public
    void setEmail(String email) {
        this.email = email;
    }

    public
    String getPassword() {
        return password;
    }

    public
    void setPassword(String password) {
        this.password = password;
    }

    public
    String getCredit_card() {
        return credit_card;
    }

    public
    void setCredit_card(String credit_card) {
        this.credit_card = credit_card;
    }

    public
    String getAddress_1() {
        return address_1;
    }

    public
    void setAddress_1(String address_1) {
        this.address_1 = address_1;
    }

    public
    String getAddress_2() {
        return address_2;
    }

    public
    void setAddress_2(String address_2) {
        this.address_2 = address_2;
    }

    public
    String getCity() {
        return city;
    }

    public
    void setCity(String city) {
        this.city = city;
    }

    public
    String getRegion() {
        return region;
    }

    public
    void setRegion(String region) {
        this.region = region;
    }

    public
    String getPostal_code() {
        return postal_code;
    }

    public
    void setPostal_code(String postal_code) {
        this.postal_code = postal_code;
    }

    public
    String getCountry() {
        return country;
    }

    public
    void setCountry(String country) {
        this.country = country;
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
    String getDay_phone() {
        return day_phone;
    }

    public
    void setDay_phone(String day_phone) {
        this.day_phone = day_phone;
    }

    public
    String getEve_phone() {
        return eve_phone;
    }

    public
    void setEve_phone(String eve_phone) {
        this.eve_phone = eve_phone;
    }

    public
    String getMob_phone() {
        return mob_phone;
    }

    public
    void setMob_phone(String mob_phone) {
        this.mob_phone = mob_phone;
    }

    @Override
    public
    String toString() {
        return "customer{" + "customer_id=" + customer_id + ", name=" + name + ", email=" + email + ", password=" + password + ", credit_card=" + credit_card + ", address_1=" + address_1 + ", address_2=" + address_2 + ", city=" + city + ", region=" + region + ", postal_code=" + postal_code + ", contry=" + country + ", shipping_region_id=" + shipping_region_id + ", day_phone=" + day_phone + ", eve_phone=" + eve_phone + ", mob_phone=" + mob_phone + '}';
    }
    
    
    
}
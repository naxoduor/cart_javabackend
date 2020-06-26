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
@Table(name="product")
public
        class product {

    @Id
    @Column(name="product_id")
    private
            Long product_id;
    
    @Column(name="description")
    private
            String description;
    
    @Column(name="price")
    private
            double price;
    
    @Column(name="discounted_price")
    private
            double discounted_price;
    
    @Column(name="delivery_cost")
    private
            double delivery_cost;
    
    @Column(name="image")
    private
            String image;
    
    @Column(name="image_2")
    private
            String image_2;
    
    @Column(name="thumbnail")
    private
            String thumbnail;
    
    @Column(name="display")
    private
            int display;
    
    public
    product() {
    }

    public
    product(Long product_id, String name, String description, double price, double discounted_price, double delivery_cost, String image, String image_2, String thumbnail, int display) {
        this.product_id = product_id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.discounted_price = discounted_price;
        this.delivery_cost = delivery_cost;
        this.image = image;
        this.image_2 = image_2;
        this.thumbnail = thumbnail;
        this.display = display;
    }
    private
            String name;

    public
            Long getProduct_id() {
        return product_id;
    }

    public
            void setProduct_id(Long product_id) {
        this.product_id = product_id;
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

    public
            double getPrice() {
        return price;
    }

    public
            void setPrice(double price) {
        this.price = price;
    }

    public
            double getDiscounted_price() {
        return discounted_price;
    }

    public
            void setDiscounted_price(double discounted_price) {
        this.discounted_price = discounted_price;
    }

    public
            double getDelivery_cost() {
        return delivery_cost;
    }

    public
            void setDelivery_cost(double delivery_cost) {
        this.delivery_cost = delivery_cost;
    }

    public
            String getImage() {
        return image;
    }

    public
            void setImage(String image) {
        this.image = image;
    }

    public
            String getImage_2() {
        return image_2;
    }

    public
            void setImage_2(String image_2) {
        this.image_2 = image_2;
    }

    public
            int getDisplay() {
        return display;
    }

    public
            void setDisplay(int display) {
        this.display = display;
    }

    @Override
    public
    String toString() {
        return "product{" + "product_id=" + product_id + ", description=" + description + ", price=" + price + ", discounted_price=" + discounted_price + ", delivery_cost=" + delivery_cost + ", image=" + image + ", image_2=" + image_2 + ", thumbnail=" + thumbnail + ", display=" + display + ", name=" + name + '}';
    }
    

}
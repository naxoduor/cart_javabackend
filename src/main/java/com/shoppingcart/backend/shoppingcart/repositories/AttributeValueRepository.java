/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.shoppingcart.backend.shoppingcart.repositories;

/**
 *
 * @author maradona
 */
import org.springframework.data.jpa.repository.JpaRepository;
import com.shoppingcart.backend.shoppingcart.entities.attribute_value;
public
        interface AttributeValueRepository extends JpaRepository<attribute_value, Long>{
    
}

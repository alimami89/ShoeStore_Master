/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.util.Date;

/**
 *
 * @author user
 */
public class History {
    private Shoe shoe;
    private Customer customer;
    private Date givenShoe;
    
    public History(){
        
    }
    
    public Shoe getShoe() {
        return shoe;
    }

    public void setShoe(Shoe shoe) {
        this.shoe = shoe;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public Date getGivenShoe() {
        return givenShoe;
    }

    public void setGivenShoe(Date givenShoe) {
        this.givenShoe = givenShoe;
    }
}

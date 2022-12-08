/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shoppingcart.cop4331_shoppingcart;

import java.io.Serializable;

/**
 * Default product type that, implements ProductBase
 * @author Group 12
 */
public class Product implements ProductBase, Serializable {

    private String name;
    private String description;
    private int inventory;
    private double price;
    private double cost;

    public Product() {
        name = null;
        description = null;
        inventory = 0;
        price = 0;
        cost = 0;
    }

    /**
     * Sets the name
     *
     * @param val String that becomes the name
     */
    @Override
    public void SetName(String val) {
        name = val;
    }

    /**
     * Sets the Description
     *
     * @param val String the becomes the description
     */
    @Override
    public void SetDescription(String val) {
        description = val;
    }
    
    /**
     * Sets the inventory
     *
     * @param val Int that becomes the inventory
     */
    @Override
    public void SetInventory(int val) {
        inventory = val;
    }
    
    /**
     * Sets the price
     *
     * @param val double that becomes the price
     */
    @Override
    public void SetPrice(double val) {
        price = val;
    }
    
    @Override
    public void SetCost(double val) {
        cost = val;
    }

    /**
     * Gets the name
     *
     * @return String of items name
     */
    @Override
    public String Getname() {
        return name;
    }
    
    /**
     * Gets the description
     *
     * @return String of the items description
     */
    @Override
    public String GetDescription() {
        return description;
    }
    
    /**
     * Gets inventory
     *
     * @return int of the item inventory
     */
    @Override
    public int GetInventory() {
        return inventory;
    }
    
    /**
     * Gets the price
     *
     * @return double of the items price price
     */
    @Override
    public double GetPrice() {
        return price;
    }
    
    /**
     *
     * @return
     */
    @Override
    public double GetCost() {
        return cost;
    }
    
    /**
     * returns copy of the product
     *
     * @return Product type that is a copy of itself
     */
    public Product Getcopy() {
        Product n = new Product();
        n.SetPrice(price);
        n.SetDescription(description);
        n.SetName(name);
        n.SetInventory(inventory);

        return n;
    }
}
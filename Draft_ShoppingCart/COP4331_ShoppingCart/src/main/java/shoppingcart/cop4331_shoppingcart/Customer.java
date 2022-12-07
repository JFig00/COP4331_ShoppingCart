/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shoppingcart.cop4331_shoppingcart;

import java.io.Serializable;

/**
 * A User object type that implements User interface and is responsible for
 * Customer account
 *
 * @author Group 12
 */
public class Customer implements User, Serializable {

    private String name;
    private String username;
    private String password;
    private int arrayNum;
    private final ProductCollect<Product> prod;
    
    
    
    

    /**
     * Constructor class, initialize all values to zero
     */
    public Customer() {
        this.arrayNum = 0;
        this.prod = new ProductCollect();
    }
    
    /**
     * Sets name
     *
     * @param val String to set name too
     */
    @Override
    public void SetName(String val) {
        this.name = val;
    }

    /**
     * Sets password
     *
     * @param val String to set password to
     */
    @Override
    public void SetPassword(String val) {
        this.password = val;
    }

    /**
     * Sets Username
     *
     * @param val String to set username too
     */
    @Override
    public void SetUsername(String val) {
        this.username = val;
    }

    /**
     * Gets name of product
     *
     * @return String of name
     */
    @Override
    public String GetName() {

        return this.name;
    }

    /**
     * Gets password of user
     *
     * @return String of password
     */
    @Override
    public String GetPassword() {
        return this.password;
    }

    /**
     * Gets Username of user
     *
     * @return String of username
     */
    @Override
    public String GetUsername() {
        return this.username;
    }
    
    /**
     * returns the list of of products
     *
     * @return PDList of products
     */
    @Override
    public ProductCollect<Product> ProdList() {
        return (ProductCollect<Product>) this.prod;
    }

    /**
     * Add product to product
     *
     * @param val product you want to add
     */
    @Override
    public void Add(Product val) {
        this.prod.add(val);
        this.arrayNum++;
    }

    /**
     * Remove Product
     *
     * @param val Product you wish to remove
     */
    @Override
    public void Remove(Product val) {
        this.prod.remove(val);
        this.arrayNum--;
    }

    /**
     * returns the number of total products
     *
     * @return int of total products
     */
    @Override
    public int num() {
        return arrayNum;
    }
}
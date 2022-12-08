/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shoppingcart.cop4331_shoppingcart;

import java.io.Serializable;

/**
 * A User object type that implements User interface and is responsible for Seller account
 * @author Group 12
 */
public class Seller implements User, Serializable {

    private String name;
    private String username;
    private String password;
    private int arrayNum;
    private double revenue;
    private final ProductCollect<Product> prod;
    
    public Seller() {
        arrayNum = 0;
        revenue = 0;
        prod = new ProductCollect();
    }
    
    /**
     * Sets name
     *
     * @param val String to set name too
     */
    @Override
    public void SetName(String val) {
        name = val;
    }

    /**
     * Sets password
     *
     * @param val String to set password to
     */
    @Override
    public void SetPassword(String val) {
        password = val;

    }

    /**
     * Sets Username
     *
     * @param val String to set username too
     */
    @Override
    public void SetUsername(String val) {
        username = val;
    }
    
    /**
     *
     * @param val
     */
    public void SetRevenue (double val) {
        revenue = val;
    }
    
    /**
     * Gets name
     *
     * @return String of name
     */
    @Override
    public String GetName() {

        return name;
    }

    /**
     * Gets password
     *
     * @return String of password
     */
    @Override
    public String GetPassword() {
        return password;
    }

    /**
     * Gets Username
     *
     * @return String of username
     */
    @Override
    public String GetUsername() {
        return username;
    }
    
    /**
     *
     * @return
     */
    public double GetRevenue() {
        return revenue;
    }
    
    
    /**
     * returns the list of of products
     *
     * @return PDList of products
     */
    @Override
    public ProductCollect<Product> ProdList() {
        return (ProductCollect<Product>) prod;
    }

    /**
     * Add product to product list
     *
     * @param val product you want to add
     */
    @Override
    public void Add(Product val) {
        prod.add(val);
        arrayNum++;
    }

    /**
     * Remove Product
     *
     * @param val Product you wish to remove
     */
    @Override
    public void Remove(Product val) {
        prod.remove(val);
        arrayNum--;
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

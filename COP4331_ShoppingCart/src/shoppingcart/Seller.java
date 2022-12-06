/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcart;

import java.io.Serializable;

/**
 * A User object type that implements User interface and is responsible for Seller account
 * @author Group 12
 */
public class Seller implements User, Serializable {

    private final ProductCollect<Product> prod;
    private int arrayNum;
    private String username;
    private String name;
    private String password;

    public Seller() {
        arrayNum = 0;
        prod = new ProductCollect();
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
     * Gets Usename
     *
     * @return String of username
     */
    @Override
    public String GetUsername() {
        return username;
    }
}

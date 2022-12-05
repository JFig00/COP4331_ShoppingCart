/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shoppingcart.groupproject;

import java.io.Serializable;

/**
 * A User object type that implements User interface and is responsible for Seller account
 * @author Joshua Sohan
 */
public class Seller implements User, Serializable{
    private final PDList<Product> prod;
    private int arrayNum;
    private String username;
    private String name;
    private String password;
    
    public Seller(){
        arrayNum = 0;
        prod = new PDList();
    }

    /**
     * Add prodcut to product
     * @param val Prodcut you want to add
     */
    @Override
    public void Add(Product val) {
        prod.add(val);
        arrayNum++;
    }

    /**
     * Remove Product
     * @param val Product you wish to remove
     */
    @Override
    public void Remove(Product val) {
        prod.remove(val);
        arrayNum--;
    }
    
    /**
     * returns the number of total products
     * @return int of total products
     */
    @Override
    public int num() {
        return arrayNum;
    }    
    
    /**
     * returns the list of of products
     * @return PDList of products
     */
    @Override
    public PDList<Product> ProdList() {
        return (PDList<Product>) prod;
    }

    /**
     * Sets name
     * @param val String to set name too
     */
    @Override
    public void SetName(String val) {
        name = val;
    }

    /**
     * Sets password
     * @param val String to set password to
     */
    @Override
    public void SetPassword(String val) {
        password = val;

    }

    /**
     * Sets Username
     * @param val String to set username too
     */
    @Override
    public void SetUsername(String val) {
        username = val;
    }

    /**
     * Gets name
     * @return String of name
     */
    @Override
    public String GetName() {
        
        return name;
    }

    /**
     * Gets password
     * @return String of password
     */
    @Override
    public String GetPassword() {
        return password;
    }

    /**
     * Gets Usename
     * @return String of username
     */
    @Override
    public String GetUsername() {
        return username;
    }
}
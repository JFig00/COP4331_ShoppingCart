/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package shoppingcart.groupproject;

/**
 *Product interface that helps create new product types
 * @author Joshua Sohan
 */
public interface Prod {
    
    public void SetName(String val);
    public void SetPrice(double val);
    public void SetDescription(String val);
    public void SetInventory(int val);
    public double GetPrice();
    public String GetDescription();
    public String Getname();
    public int GetInventory();
}
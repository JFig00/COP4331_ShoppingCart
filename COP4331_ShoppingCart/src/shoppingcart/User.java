/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcart;

/**
 * Interface that helps create new user types
 * @author Joshua Sohan
 */
public interface User {
    
    void Add(Product val);
    void Remove(Product val);
    PDList<Product> ProdList();
    int num();
    void SetName(String val);
    void SetPassword(String val);
    void SetUsername(String val);
    String GetName();
    String GetPassword();
    String GetUsername();

}

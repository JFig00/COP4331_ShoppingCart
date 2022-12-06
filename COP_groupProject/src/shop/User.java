/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shop;

/**
 * Interface that helps create new user types
 *
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
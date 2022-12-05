/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package shoppingcart.groupproject;

import java.util.Collection;
import javax.swing.JPanel;

/**
 * Interface to create a LinkedList adaptation
 * @author Joshua sohan
 */
public interface ProdList<E> {
    
    void  add(E e);
    void remove(E e);
    E getItem(int i);
    int size();
    boolean isEmpty();
    void removeAll();
    void addAll(Collection <? extends E> c);
}
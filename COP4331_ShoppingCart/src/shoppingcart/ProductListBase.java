/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcart;

import java.util.Collection;

/**
 * Interface to create a LinkedList adaptation
 * 
 * @author Group 12
 * @param <E>
 */
public interface ProductListBase<E> {

    void add(E e);

    void remove(E e);

    E getItem(int i);

    int size();

    boolean isEmpty();

    void removeAll();

    void addAll(Collection<? extends E> c);
}

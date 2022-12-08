/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shoppingcart.cop4331_shoppingcart;

import java.util.*;
import java.io.Serializable;


/**
 * Collection Type object that adapts a LinkedList, implements ProdList
 * 
 * @author Group 12
 * @param <E>
 */
public class ProductCollect<E> implements ProductListBase<E>, Iterable<E>, Serializable {

    private final LinkedList<E> list;

    /**
     *
     */
    public ProductCollect(){
        list = new LinkedList();
    }
    
    /**
     *
     * @param e
     */
    @Override
    public void remove(E e) {
        list.remove(e);
    }

    /**
     *
     * @param i
     * @return
     */
    @Override
    public E getItem( int i) {
       return  list.get(i);
    }

    /**
     *
     * @return
     */
    @Override
    public int size() {
        return list.size();
     }

    /**
     *
     * @return
     */
    @Override
    public boolean isEmpty() {
        return list.isEmpty();
    }

    /**
     *
     * @param e
     */
    @Override
    public void add(E e) {
        list.add(e);
    }

    /**
     *
     * @return
     */
    @Override
    public Iterator<E> iterator() {
        return list.iterator();
    }    
    
    /**
     *
     * @param c
     */
    @Override
    public void addAll(Collection<? extends E> c) {
        for (E temp : c){
            list.add(temp);
        }
    }

    /**
     *
     */
    @Override
    public void removeAll() {
        list.clear();
    }
}
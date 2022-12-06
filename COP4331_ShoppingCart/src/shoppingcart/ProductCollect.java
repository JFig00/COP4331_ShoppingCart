/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shoppingcart;

import java.io.Serializable;
import java.util.*;

/**
 * Collection Type object that adapts a LinkedList, implements ProdList
 * @author Johnny Figueroa, Joshua Gardner, Jordan Perrin
 * @param <E>
 */
public class ProductCollect<E> implements ProductListBase<E>, Iterable<E>, Serializable {

    private final LinkedList<E> lst;

    /**
     *
     */
    public ProductCollect(){
        lst = new LinkedList();
    }
    
    /**
     *
     * @param e
     */
    @Override
    public void remove(E e) {
        lst.remove(e);
    }

    /**
     *
     * @param i
     * @return
     */
    @Override
    public E getItem( int i) {
       return  lst.get(i);
    }

    /**
     *
     * @return
     */
    @Override
    public int size() {
        return lst.size();
     }

    /**
     *
     * @return
     */
    @Override
    public boolean isEmpty() {
        return lst.isEmpty();
    }

    /**
     *
     * @param e
     */
    @Override
    public void add(E e) {
        lst.add(e);
    }

    /**
     *
     * @return
     */
    @Override
    public Iterator<E> iterator() {
        return lst.iterator();
    }    
    
    /**
     *
     * @param c
     */
    @Override
    public void addAll(Collection<? extends E> c) {
        for (E temp : c){
            lst.add(temp);
        }
    }

    /**
     *
     */
    @Override
    public void removeAll() {
        lst.clear();
    }
}

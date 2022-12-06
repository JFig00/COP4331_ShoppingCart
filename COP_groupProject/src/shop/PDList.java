/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shop;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * Collection Type object that adapts a LinkedList, implements ProdList
 * @author Joshua Sohan
 * @param <E>
 */
public class PDList<E> implements ProdList<E>, Iterable<E>, Serializable {

    private final LinkedList<E> lst;

    /**
     * Class constructor
     */
    public PDList(){
        lst = new LinkedList();
    }
    
    /**
     * Removes first occurence of object
     * @param e object to be removed
     */
    @Override
    public void remove(E e) {
        lst.remove(e);
    }

    /**
     * gets item at specific index
     * @param i index to get item
     * @return object at that index
     */
    @Override
    public E getItem( int i) {
       return  lst.get(i);
    }

    /**
     * Gets the size
     * @return int of how many items are in PDList
     */
    @Override
    public int size() {
        return lst.size();
     }

    /**
     * tells you if it is empty
     * @return boolean on whether its true or not
     */
    @Override
    public boolean isEmpty() {
        return lst.isEmpty();
    }

    
    /**
     * Adds element to PDList
     * @param e element you wish to add
     */
    @Override
    public void add(E e) {
        lst.add(e);
    }

    /**
     * allows you to iterate
     * @return Iterator
     */
    @Override
    public Iterator<E> iterator() {
        return lst.iterator();
    }    
    
    /**
     * adds a collection of objects to PDList
     * @param c any Collection containing the same object types
     */
    @Override
    public void addAll(Collection<? extends E> c) {
        for (E temp : c){
            lst.add(temp);
        }
    }

    @Override
    public void removeAll() {
        lst.clear();
    }
}

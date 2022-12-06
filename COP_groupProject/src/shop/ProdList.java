/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package shop;
import java.util.Collection;

/**
 * Interface to create a LinkedList adaptation
 *
 * @author Joshua sohan
 * @param <E>
 */
public interface ProdList<E> {

    void add(E e);

    void remove(E e);

    E getItem(int i);

    int size();

    boolean isEmpty();

    void removeAll();

    void addAll(Collection<? extends E> c);
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linklistapp;

/**
 *
 * @author iarzs
 */
public class Node<E> {

    private E element; // reference to the element stored at this node
    private Node<E> next; // reference to the subsequent node in the list

    public Node(E e, Node<E> n) {
        element = e;
        next = n;
    }

    public E getElement() {
        return element;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> n) {
        next = n;
    }
}

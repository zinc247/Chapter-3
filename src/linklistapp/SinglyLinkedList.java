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
public class SinglyLinkedList<E> {

    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public SinglyLinkedList() {
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return (size == 0) ? true : false;
    }

    public E first() {
        if (isEmpty()) {
            return null;
        }
        return head.getElement();
    }

    public E last() {
        if (isEmpty()) {
            return null;
        }
        return tail.getElement();
    }

    public void addFirst(E e) {
        Node<E> tmp = new Node(e, head);
        if (isEmpty()) {
            tail = tmp;
        }
        head = tmp;
        size++;
    }

    public void addLast(E e) {
        Node<E> tmp = new Node(e, null);
        if (isEmpty()) {
            head = tmp;
        } else {
            tail.setNext(tmp);
        }
        tail = tmp;
        size++;
    }

    public E removeFirst() {
        if (isEmpty()) {
            return null;
        }
        E data = head.getElement();
        head = head.getNext();
        size--;
        if (isEmpty()) {
            tail = null;
        }
        return data;
    }

    public E removeLast() {
        if (isEmpty()) {
            return null;
        }
        E data = tail.getElement();
        if (size == 1) {
            head = tail = null;
        } else {
            Node<E> tmp = head;
            while (tmp.getNext() != tail) {
                tmp = tmp.getNext();
            }
            tmp.setNext(null);
            tail = tmp;
        }
        size--;
        return data;
    }

    public void printList() {
        Node<E> tmp = head;
        while (tmp != null) {
            System.out.println(tmp.getElement());
            tmp = tmp.getNext();
        }
    }
}

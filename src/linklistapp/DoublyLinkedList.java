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
public class DoublyLinkedList<E> {

    private class Node<E> {

        private E element;
        private Node<E> prev;
        private Node<E> next;

        public Node(E e, Node<E> p, Node<E> n) {
            element = e;
            prev = p;
            next = n;
        }

        public E getElement() {
            return element;
        }

        public Node<E> getPrev() {
            return prev;
        }

        public Node<E> getNext() {
            return next;
        }

        public void setPrev(Node<E> p) {
            prev = p;
        }

        public void setNext(Node<E> n) {
            next = n;
        }
    }
    private Node<E> head = null;
    private Node<E> tail = null;
    private int size = 0;

    public DoublyLinkedList() {
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void addFirst(E e) {
        Node<E> tmp = new Node(e, null, null);
        if (isEmpty()) {
            tail = tmp;
        } else {
            tmp.setNext(head);
            head.setPrev(tmp);
        }
        head = tmp;
        size++;
    }

    public void addLast(E e) {
        Node<E> tmp = new Node(e, null, null);
        if (isEmpty()) {
            head = tmp;
        } else {
            tmp.setPrev(tail);
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
        head.getNext().setPrev(null);
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
            tail.getPrev().setNext(null);
            tail = tail.getPrev();
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

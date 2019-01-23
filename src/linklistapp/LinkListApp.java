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
public class LinkListApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //SinglyLinkedList list = new SinglyLinkedList();
        //CircularlyLinkedList list = new CircularlyLinkedList();
        DoublyLinkedList list = new DoublyLinkedList();
        list.addFirst("Ahmad");
        list.addFirst("Fahd");
        list.addLast("Bilal");
        list.addLast("Saad");
        list.removeFirst();
        list.removeLast();
        list.printList();
    }
    
}

package Defination;

import ADT.linkedListADT;

public class defination<Person> implements linkedListADT<Person> {

    private Node<Person> head = null;
    private int size = 0;

    public Node<Person> getNode(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.getNext();
        }
        return temp;
    }

    private void addFirst(Person details) {
        head = new Node<Person>(head, details);
        size++;

    }

    public boolean add(Person details) {
        return true;
    }

    public Person delete(int index) {
        return null;
    }

    public void search(String person) {

    }

    public void viewAllDetails() {

    }

    private static class Node<Person> {
        private Node next = null;
        private Person data = null;

        public Node(Person data) {
            this.data = data;

            this.next = null;
        }

        public Node(Node next, Person data) {
            this.next = next;
            this.data = data;

        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }

        public Person getData() {
            return data;
        }

        public void setData(Person data) {
            this.data = data;
        }
    }






}
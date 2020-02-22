package Defination;

import ADT.linkedListADT;

public class defination<Person> implements linkedListADT<Person> {

    public Person add(Person details) {
        return null;
    }

    public Person delete(int index) {
        return null;
    }

    public void search(String person) {

    }

    public void viewAllDetails() {

    }

    private class Node {
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
    }

















}
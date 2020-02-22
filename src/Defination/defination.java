package Defination;

import ADT.linkedListADT;

import java.util.ArrayList;

public class defination<Person> implements linkedListADT<Person> {
    private ArrayList<String> Name = new ArrayList<>();
    private ArrayList<String> FirstName = new ArrayList<>();
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

    private void addAfter(Node node, Person details) {
        Node<Person> temp = node;
        if (node != null) {
            temp.next = new Node(node.next, details);
            size++;
        }

    }

    private void add(int index, Person details) {
        if (index == 0) {
            addFirst(details);
        }
        if (index < 0 && index > size) {
            throw new IndexOutOfBoundsException("the index is invalid");
        } else {
            Node node = getNode(index - 1);
            addAfter(node.next, details);

        }


    }
    public boolean add(Person details) {
        add(size, details);
        return true;
    }

    @Override
    public Person delete(int index) {
        return null;
    }

    private Person removeFirst() {
        Person temp = null;
        Node<Person> node = head;
        if (head != null) {
            head = head.getNext();
        }
        if (node != null) {
            size--;
            temp = node.getData();
        }
        return temp;
    }

    public ArrayList<String> getName() {
        return Name;
    }

    public void setName(String firstName, String Lastname) {
        FirstName.add(FirstName + Lastname);
    }

    public ArrayList<String> getFirstName() {
        return FirstName;
    }

    public void setFirstName(String firstName) {
        Name.add(firstName);
    }

    public Node<Person> getHead() {
        return head;
    }

    public void setHead(Node<Person> head) {
        this.head = head;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    private Person removeAfter(Node<Person> node) {
        Person temp = null;
        Node<Person> response = node.getNext();
        if (response != null) {
            node.next = response.getNext();
            size--;
            temp = response.getData();
        }
        if (temp == null) {
            node = null;
            size--;
        }
        return temp;
    }


    int counter = 0;
    public void search(String person) {

        for (int i = 0; i < FirstName.size(); i++) {
            if (person.compareTo(FirstName.get(i).toString()) == 0) {
                counter++;
            }
        }
        if (counter != 0) {
            System.out.println(counter + " match found!");
            for (int i = 0; i < FirstName.size(); i++) {
                if (person.compareTo(FirstName.get(i).toString()) == 0) {
                    Node<Person> personNode = getNode(i);
                    System.out.println(personNode.getData().toString());
                }
            }
        } else {
            System.out.println("NO MATCH FOUND!");
        }




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
package ru.itsjava.collections.lists.linkedlist;


public class MyLinkedList {
    private Node head;

    public int size() {
        int count = 0;
        Node resNode = null;
        if (head != null) {
            count++;
            Node curNode = head;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
                count++;
            }
            curNode.setNext(resNode);
        }
        return count;
    }

    public boolean isEmpty() {
        if (head != null) {
            return false;
        }
        return true;
    }


    public boolean contains(Object o) {
        if (head == o) {
        }
        return true;
    }

    public boolean add(Object o) {
        Node resNode = new Node(o, null);
        if (head == null) {
            head = resNode;
        } else {
            Node curNode = head;
            while (curNode.getNext() != null) {
                curNode = curNode.getNext();
            }
            curNode.setNext(resNode);
        }
        return true;
    }

    public boolean remove(Object o) {
        return false;
    }

    public void clear() {

    }

    public Object get(int index) {
        return null;
    }

    public Object set(int index, Object element) {
        return null;
    }

    public void add(int index, Object element) {

    }

    public Object remove(int index) {
        return null;
    }

    public int indexOf(Object o) {
        return 0;
    }

    public int lastIndexOf(Object o) {
        return 0;
    }

    @Override
    public String toString() {
        return "MyLinkedList{" +
                "head=" + head +
                '}';
    }
}

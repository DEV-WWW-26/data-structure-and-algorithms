package org.example.algo.study.trees;

public class Tree {

    private Node root;

    public Node find(int key) {
        Node current = root;
        while (current != null && current.getfData() != key) {
            if (current.getfData() < key) {
                // to the left
                current = current.getLeftChild();
            } else if (current.getfData() > key) {
                // to the right
                current = current.getRightChild();
            }
        }

        return current;
    }

    public void insert(int id, double dd) {

    }

    public void delete(int id) {

    }
}

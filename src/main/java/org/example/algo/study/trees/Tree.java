package org.example.algo.study.trees;

public class Tree {

    private Node root;

    public Node find(int key) {
        Node current = root;
        while (current != null && current.getData() != key) {
            if (current.getData() < key) {
                // to the left
                current = current.getLeftChild();
            } else if (current.getData() > key) {
                // to the right
                current = current.getRightChild();
            }
        }

        return current;
    }

    public void insert(Integer id, Double val) {
        Node newNode = new Node();
        newNode.setData(val);
        newNode.setId(id);
    }

    public void delete(int id) {

    }

    public void displayTree() {

    }
}

package org.example.algo.study.trees;

public class Node {

    private Integer id;
    private Double data;
    private Node leftChild;
    private Node rightChild;

    public void displayNode() {
        System.out.printf("{id=%d, data=%.2f}%n", id, data);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Double getData() {
        return data;
    }

    public void setData(Double data) {
        this.data = data;
    }

    public Node getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(Node leftChild) {
        this.leftChild = leftChild;
    }

    public Node getRightChild() {
        return rightChild;
    }

    public void setRightChild(Node rightChild) {
        this.rightChild = rightChild;
    }
}

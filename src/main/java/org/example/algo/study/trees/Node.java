package org.example.algo.study.trees;

public class Node {
    private int iData;
    private double fData;
    private Node leftChild;
    private Node rightChild;

    public void displayNode() {

    }

    public int getiData() {
        return iData;
    }

    public void setiData(int iData) {
        this.iData = iData;
    }

    public double getfData() {
        return fData;
    }

    public void setfData(double fData) {
        this.fData = fData;
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

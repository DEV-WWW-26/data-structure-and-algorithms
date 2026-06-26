package org.example.algo.study.trees;

import java.util.Random;
import java.util.logging.Logger;

/**
 * Binary Tree
 */
public class Tree {
    private static final Logger LOG = Logger.getLogger(Tree.class.getName());

    private Node root;

    public Node findData(int val) {
        Node current = root;
        while (current != null && current.getData() != val) {
            if (current.getData() < val) {
                // to the left
                current = current.getLeftChild();
            } else if (current.getData() > val) {
                // to the right
                current = current.getRightChild();
            }
        }

        return current;
    }

    public void insertNode(Integer id, Double val) {
        Node newNode = new Node();
        newNode.setData(val);
        newNode.setId(id);

        if (root == null) {
            root = newNode;
            return;
        }

        Node current = root;
        Node parent;

        while (true) {
            parent = current;
            if (id < current.getId()) {
                // to left node
                current = current.getLeftChild();
                // end of node, set node to our insert node
                if (current == null) {
                    parent.setLeftChild(newNode);
                    break;
                }
            } else {
                // to right node
                current = current.getRightChild();
                // end of node, set node to our insert node
                if (current == null) {
                    parent.setRightChild(newNode);
                    break;
                }
            }
        }
    }

    public boolean deleteNode(int id) {
        Node current = root;
        Node parent = root;
        boolean isLeftChild = true;
        // search
        while (current.getId() != id) {
            parent = current;
            if (id < current.getId()) {
                isLeftChild = true;
                current = current.getLeftChild();
            } else {
                isLeftChild = false;
                current = current.getRightChild();
            }
            if (current == null) {
                return false;
            }
        }
        // node is found
        if (current.getLeftChild() == null && current.getRightChild() == null) {
            // if node is root clearing tree
            if (current == root) {
                root = null;
            } else if (isLeftChild) {
                // if node for delete is left node of parent we disconnect parent
                parent.setLeftChild(null);
            } else {
                // otherwise
                parent.setRightChild(null);
            }
        } else if (current.getLeftChild() == null) {
            if (current == root) {
                root = current.getRightChild();
            } else if (isLeftChild) {
                parent.setLeftChild(current.getRightChild());
            } else {
                parent.setRightChild(current.getRightChild());
            }
        } else if (current.getRightChild() == null) {
            if (current == root) {
                root = current.getLeftChild();
            } else if (isLeftChild) {
                parent.setLeftChild(current.getLeftChild());
            } else {
                parent.setRightChild(current.getLeftChild());
            }
        }
        return true;
    }

    public Node getMinKey() {
        Node last = null;
        Node current = root;
        while (current != null) {
            last = current;
            current = current.getLeftChild();
        }
        return last;
    }

    public Node getMaxKey() {
        Node last = null;
        Node current = root;
        while (current != null) {
            last = current;
            current = current.getRightChild();
        }
        return last;
    }

    public void generateTree(int count) {
        Random random = new Random();
        for (int i = 0; i < count; i++) {
            insertNode(random.nextInt(1000), random.nextDouble() * 1000);
        }
    }

    public void displayTree() {
        if (root == null) {
            System.out.println("(empty tree)");
            return;
        }
        System.out.println(nodeToString(root));
        printSubTree(root, "");
    }

    private void printSubTree(Node node, String prefix) {
        boolean hasRight = node.getRightChild() != null;
        boolean hasLeft = node.getLeftChild() != null;

        if (hasRight) {
            String connector = hasLeft ? "├── R: " : "└── R: ";
            System.out.println(prefix + connector + nodeToString(node.getRightChild()));
            printSubTree(node.getRightChild(), prefix + (hasLeft ? "│   " : "    "));
        }
        if (hasLeft) {
            System.out.println(prefix + "└── L: " + nodeToString(node.getLeftChild()));
            printSubTree(node.getLeftChild(), prefix + "    ");
        }
    }

    private String nodeToString(Node node) {
        return String.format("{id=%d, data=%.2f}", node.getId(), node.getData());
    }
}

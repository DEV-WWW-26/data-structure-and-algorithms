package org.example.algo.study.trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TreeTest {

    @Test
    void testGenerateTree() {
        Tree tree = new Tree();
        tree.generateTree(15);
        tree.displayTree();
    }
}
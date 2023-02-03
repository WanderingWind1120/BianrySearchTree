package org.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        BinarySearchTree2 tree = new BinarySearchTree2();
        tree.insertNode(new Node (43));
        tree.insertNode(new Node (45));
        tree.insertNode(new Node (14));
        tree.insertNode(new Node (85));
        tree.insertNode(new Node (97));
        tree.insertNode(new Node (54));
        tree.insertNode(new Node (64));

        tree.displayNode();
    }
}
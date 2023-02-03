package org.example;

public class BinarySearchTree2 {
    Node root;
    public void insertNode(Node node){
        root = insertHelper(root, node);
    }
    public Node insertHelper(Node root, Node node){
        if (root == null){
            root = node;
            return root;
        }
        else if (node.data > root.data){
            return insertHelper(root.right,node);
        }
        else {
            return insertHelper(root.left,node);
        }
    }
    public void displayNode(){
        displayHelper(root);
    }
    public void displayHelper (Node root){
        if (root != null){
            displayHelper(root.left);
            System.out.println(root.data);
            displayHelper(root.right);
        }
    }
    public boolean searchNode (int data){
        return searchHelper(root, data);
    }
    public boolean searchHelper (Node root, int data){
        if (root == null){
            return false;
        }
        else if (data == root.data){
            return true;
        }
        else if (data > root.data){
            return searchHelper(root.right, data);
        }
        else {
            return searchHelper(root.left, data);
        }
    }
    public void removeNode (int data){
        if (searchNode(data)){
           removeHelper(root,data);
        }
        else System.out.println("Node is not founded");
    }
    public Node removeHelper (Node root, int data){
        if (root == null){
            return root;
        }
        else if (data < root.data){
            return removeHelper(root.left, data);
        }
        else if (data > root.data){
            return removeHelper(root.right, data);
        }
        else if (data == root.data){
            if (root.left == null && root.right == null){
                root = null;
            }
            else if (root.right != null) {
                root.data = successor(root);
                root.right = removeHelper (root.right, root.data);
            }
            else if (root.left != null){
                root.data = predecessor(root);
                root.left = removeHelper(root.left, root.data);
            }
        }
        return root;
    }
    public int successor (Node root){
        root = root.right;
        while (root.left != null){
            root = root.left;
        }
        return root.data;
    }
    public int predecessor (Node root){
        root = root.left;
        while (root.right != null){
            root = root.right;
        }
        return root.data;
    }
}

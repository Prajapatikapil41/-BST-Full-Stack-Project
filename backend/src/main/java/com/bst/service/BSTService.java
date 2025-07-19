package com.bst.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bst.model.TreeNode;

@Service
public class BSTService {
    private TreeNode root;

    public BSTService() {
        root = null;
    }

    // Insert node
    public String insert(int key) {
        root = insertRec(root, key);
        return "Inserted: " + key;
    }

    private TreeNode insertRec(TreeNode root, int key) {
        if (root == null) return new TreeNode(key);
        if (key < root.key) root.left = insertRec(root.left, key);
        else if (key > root.key) root.right = insertRec(root.right, key);
        return root;
    }

    // Search
    public boolean search(int key) {
        return searchRec(root, key);
    }

    private boolean searchRec(TreeNode root, int key) {
        if (root == null) return false;
        if (root.key == key) return true;
        return key < root.key ? searchRec(root.left, key) : searchRec(root.right, key);
    }

    // Delete
    public String delete(int key) {
        root = deleteRec(root, key);
        return "Deleted: " + key;
    }

    private TreeNode deleteRec(TreeNode root, int key) {
        if (root == null) return null;

        if (key < root.key) root.left = deleteRec(root.left, key);
        else if (key > root.key) root.right = deleteRec(root.right, key);
        else {
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;
            root.key = minValue(root.right);
            root.right = deleteRec(root.right, root.key);
        }
        return root;
    }

    private int minValue(TreeNode root) {
        int minVal = root.key;
        while (root.left != null) {
            root = root.left;
            minVal = root.key;
        }
        return minVal;
    }

    // Traversals
    public List<Integer> inorder() {
        List<Integer> result = new ArrayList<>();
        inorderRec(root, result);
        return result;
    }

    private void inorderRec(TreeNode root, List<Integer> res) {
        if (root != null) {
            inorderRec(root.left, res);
            res.add(root.key);
            inorderRec(root.right, res);
        }
    }

    public List<Integer> preorder() {
        List<Integer> result = new ArrayList<>();
        preorderRec(root, result);
        return result;
    }

    private void preorderRec(TreeNode root, List<Integer> res) {
        if (root != null) {
            res.add(root.key);
            preorderRec(root.left, res);
            preorderRec(root.right, res);
        }
    }

    public List<Integer> postorder() {
        List<Integer> result = new ArrayList<>();
        postorderRec(root, result);
        return result;
    }

    private void postorderRec(TreeNode root, List<Integer> res) {
        if (root != null) {
            postorderRec(root.left, res);
            postorderRec(root.right, res);
            res.add(root.key);
        }
    }
}

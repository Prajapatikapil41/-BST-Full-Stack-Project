package com.bst.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bst.service.BSTService;

@RestController
@RequestMapping("/bst")
@CrossOrigin(origins = "*")
public class BSTController {

    @Autowired
    private BSTService bstService;

    @PostMapping("/insert/{key}")
    public String insert(@PathVariable int key) {
        return bstService.insert(key);
    }

    @DeleteMapping("/delete/{key}")
    public String delete(@PathVariable int key) {
        return bstService.delete(key);
    }

    @GetMapping("/search/{key}")
    public String search(@PathVariable int key) {
        boolean found = bstService.search(key);
        return found ? "✅ Found: " + key : "❌ Not Found: " + key;
    }

    @GetMapping("/inorder")
    public List<Integer> inorder() {
        return bstService.inorder();
    }

    @GetMapping("/preorder")
    public List<Integer> preorder() {
        return bstService.preorder();
    }

    @GetMapping("/postorder")
    public List<Integer> postorder() {
        return bstService.postorder();
    }
}

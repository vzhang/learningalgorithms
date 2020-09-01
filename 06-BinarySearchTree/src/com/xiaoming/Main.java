package com.xiaoming;

import com.xiaoming.printer.BinaryTreeInfo;
import com.xiaoming.printer.BinaryTrees;

public class Main {
    public static void main(String[] args) {
        Integer data[] = new Integer[] {
                7, 4, 9, 2, 5, 8, 11, 3, 12, 1
        };
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        for (int i = 0; i < data.length; i++) {
            bst.add(data[i]);
        }

        BinaryTrees.println(bst);
    }

}

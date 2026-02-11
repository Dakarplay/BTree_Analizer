# 🌳 Binary Tree Analyzer in Java

## 📌 Description

This project implements a **Binary Search Tree (BST)** in Java and
performs structural analysis over it.

The program:

-   Calculates:
    - Number of nodes
    - Number of edges
    - Height of the tree
-   Prints tree traversals:
    - Inorder
    - Preorder
    - Postorder
    - Level-order (Breadth-First Search)
-   Builds a balanced version of the tree
-   Analyzes whether the tree is full or complete

------------------------------------------------------------------------

## 📂 Project Structure

```bash
BTREE_ANALIZER
│
├── src
│   ├── app
│   │   └── App.java
│   │
│   └── tree
│       ├── BinaryNode.java
│       ├── BinaryTree.java
│       └── TreeUtils.java
│
├── .gitignore
└── README.md
```

------------------------------------------------------------------------

## 🧠 Implemented Classes

### 🔹 BinaryNode.java

Represents a node of the binary tree.

Attributes: - int data - BinaryNode left - BinaryNode right

------------------------------------------------------------------------

### 🔹 BinaryTree.java

Implements a Binary Search Tree (BST).

Main method: - insert(int data) → inserts nodes recursively following
BST rules.

------------------------------------------------------------------------

### 🔹 TreeUtils.java

Utility class that provides:

-   countNodes() → total number of nodes\
-   countEdges() → total number of edges\
-   height() → tree height\
-   inorder()\
-   preorder()\
-   postorder()\
-   levelOrder() (BFS traversal)\
-   buildBalanced() → builds a balanced tree from a sorted list

------------------------------------------------------------------------

### 🔹 App.java

Main execution class.

Steps performed:

1.  Inserts the following values:

50, 17, 76, 9, 23, 54, 14, 19, 72, 12, 67

2.  Prints:
    -   Number of nodes
    -   Number of edges
    -   Height
3.  Prints traversals:
    -   Inorder
    -   Preorder
    -   Postorder
    -   Level-order
4.  Builds a balanced tree and prints its metrics again.

------------------------------------------------------------------------

## 🌲 Tree Properties

### Original Tree

-   Not full → some nodes have only one child.
-   Not complete → last level is not fully filled from left to right.
-   Height is not minimal.

### Balanced Tree

-   Has minimal possible height.
-   Improves search efficiency.
-   Built using divide-and-conquer from the sorted inorder list.

------------------------------------------------------------------------

## ▶️ How to Run in terminal

### Compile

javac -d out src/app/App.java src/tree/\*.java

### Run

java -cp out app.App

------------------------------------------------------------------------

## 📘 Concepts Used

-   Binary Search Trees (BST)
-   Tree Traversals
-   Recursion
-   Breadth-First Search (BFS)
-   Divide and Conquer
-   Tree Height and Structural Properties

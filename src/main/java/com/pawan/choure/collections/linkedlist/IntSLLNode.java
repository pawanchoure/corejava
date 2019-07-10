package com.pawan.choure.collections.linkedlist;

//************************ IntSLLNode.java **************************
//a node in an integer singly linked list class
public class IntSLLNode {
public int info;
public IntSLLNode next;
public IntSLLNode(int i) {
this(i,null);
}
public IntSLLNode(int i, IntSLLNode n) {
info = i; next = n;
}
}

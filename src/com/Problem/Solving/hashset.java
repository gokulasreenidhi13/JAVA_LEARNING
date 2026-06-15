package com.Problem.Solving;

import java.util.LinkedList;

public class hashset {
	 private LinkedList<Integer>[] buckets;
	    private int size = 769;

	    public void MyHashSet() {
	        buckets = new LinkedList[size];
	        for (int i = 0; i < size; i++) {
	            buckets[i] = new LinkedList<>();
	        }
	    }

	    private int hash(int key) {
	        return key % size;
	    }

	    public void add(int key) {
	        int idx = hash(key);
	        if (!buckets[idx].contains(key)) {
	            buckets[idx].add(key);
	        }
	    }

	    public void remove(int key) {
	        buckets[hash(key)].remove(Integer.valueOf(key));
	    }

	    public boolean contains(int key) {
	        return buckets[hash(key)].contains(key);
	    }
}

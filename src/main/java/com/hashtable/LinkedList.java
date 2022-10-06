package com.hashtable;

public class LinkedList<K, V> {
	MyMapNode<K, V> head;

	/**
	 * Method to add Entry. create new node
	 **/
	public void addEntry(K key, V value) {
		MyMapNode<K, V> newNode = new MyMapNode<K, V>(key, value);
		// Checks if the list is empty if empty then head pointing to newNode
		if (head == null) {
			head = newNode;
		} else {
			MyMapNode<K, V> temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}

	/**
	 * replace previous value with new one(i.e word's frequency)
	 **/
	public void replace(K key, V value) {
		MyMapNode<K, V> temp = head;
		while (temp != null) {
			if (temp.key.equals(key)) {
				temp.value = value;
			}
			temp = temp.next;
		}
	}

	/**
	 * to check key already exist or not if exist return true otherwise return false
	 ***/
	public boolean keyIsPresent(String key) {
		MyMapNode<K, V> temp = head;
		while (temp != null) {
			if (temp.key.equals(key)) {
				return true;
			}
			temp = temp.next;
		}
		return false;

	}

	/**
	 * To check word previously present in hash table if present then return count
	 **/
	public int get(String word) {
		MyMapNode<K, V> temp = head;
		int count = 0;
		while (temp != null) {
			if (temp.key.equals(word)) {
				count++;
			}
			temp = temp.next;
		}
		return count;
	}

	public MyMapNode<K, V> search(K searchData) {
		MyMapNode<K, V> temp = head;
		while (temp != null) {
			if (temp.key.equals(searchData))
				return temp;
			temp = temp.next;
		}
		return null;
	}

	public void append(MyMapNode<K, V> node) {
		MyMapNode<K, V> temp = head;
		if (head == null) {
			head = node;
			temp = node;
		} else {
			temp.next = node;
			temp = node;
		}
	}

	/**
	 * Method to delete 
	 **/
	public void delete(K key) {
		MyMapNode<K, V> temp = head;
		MyMapNode<K, V> searchKey = search(key);
		while (temp.next != searchKey) {
			temp = temp.next;
		}
		temp.next = searchKey.next;
	}

	/**
	 * Method to print all the key value pair present in the hash table
	 **/
	public void print() {
		MyMapNode<K, V> temp = head;
		if (head == null) {
			System.out.println("HashTable is empty");
			return;
		}
		while (temp != null) {
			System.out.println(temp);
			temp = temp.next;
		}
	}
}

package com.hashtable;

public class HashTable<K, V> {
	LinkedList<K, V> linkedList;

	public HashTable() {
		this.linkedList = new LinkedList<>();
	}

	/**
	 * check key present or not to find that use linked list's keyIsPresent method  
	 **/
	public boolean keyIsPresent(String key) {
		return linkedList.keyIsPresent(key);
	}
	  
	/**
	 * add enty in hash table for that use linked list's addEntry method  
	 **/
	public void put(K word, V count) {
		linkedList.addEntry(word, count);
	}
	
	/**
	 * display entry's in hash table using print method of linked list
	 **/
	public void display() {
		linkedList.print();
	}

	/**
	 * to find count of words
	 **/
	public int getWord(String word) {
		return linkedList.get(word);
	}

	/**
	 * replace previous key value with new one
	 **/
	public void replaceWord(K key, V value) {
		linkedList.replace(key, value);
	}
}

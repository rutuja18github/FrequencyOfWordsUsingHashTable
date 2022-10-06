package com.hashtable;

import java.util.ArrayList;

public class HashTable<K, V> {
	LinkedList<K, V> linkedList;
	int bucketSize;
	ArrayList<LinkedList<K, V>> bucketList;

	public HashTable() {
		this.bucketSize = 10;
		this.bucketList = new ArrayList<>(bucketSize);
		for (int i = 0; i < bucketSize; i++) {
			bucketList.add(null);
		}
	}

	public Integer getIndex(K key) {
		int hashCode = Math.abs(key.hashCode());
		int index = hashCode % bucketSize;
		return index;
	}

	public V get(K key) {
		int index = getIndex(key);
		LinkedList<K, V> linkedList = bucketList.get(index);
		if (linkedList == null) {
			return null;
		}
		MyMapNode<K, V> myMapNode = linkedList.search(key);
		return (myMapNode == null) ? null : myMapNode.value;
	}

	public void add(K key, V value) {
		int index = getIndex(key);
		LinkedList<K, V> linkedList = bucketList.get(index);
		if (linkedList == null) {
			linkedList = new LinkedList<>();
			bucketList.set(index, linkedList);
		}
		MyMapNode<K, V> myMapNode = linkedList.search(key);
		if (myMapNode == null) {
			myMapNode = new MyMapNode<>(key, value);
			linkedList.append(myMapNode);
		} else {
			myMapNode.value = value;
		}
	}

	public void remove(K key) {
		int index = getIndex(key);
		LinkedList<K, V> list = bucketList.get(index);
		list.delete(key);
	}

	void print() {
		for (LinkedList<K, V> linkedList : bucketList) {
			if (linkedList == null) {
				continue;
			}
			linkedList.print();

		}
	}

}

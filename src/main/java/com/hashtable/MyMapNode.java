package com.hashtable;

public class MyMapNode<K, V> {
	K key;
	V value;
	MyMapNode<K, V> next;

	public MyMapNode(K key, V value) {
		this.key = key;
		this.value = value;
	}

	@Override
	public String toString() {
		return "[Key = " + key + ", Value=" + value + "]\n";
	}
}

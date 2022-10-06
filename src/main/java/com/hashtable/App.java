package com.hashtable;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Find Frequency Of Words using Hash Table in ");
		String paragraph = "paranoids are not paranoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";
		String[] arrayOfSplitedWords = paragraph.split(" ");

		HashTable<String, Integer> hashTable = new HashTable<>();

		for (String word : arrayOfSplitedWords) {
			Integer value = hashTable.get(word);
			if (value == null) {
				value = 1;
			} else {
				value = value + 1;
			}
			hashTable.add(word, value);
		}
		hashTable.print();
		hashTable.remove("avoidable");
		System.out.println("\n\n");
		hashTable.print();
	}
}

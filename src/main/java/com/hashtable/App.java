package com.hashtable;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		System.out.println("Find Frequency Of Words using Hash Table in ");
		String sentence = "to be or not to be ";
		// Split Words present in sentence and store into array
		String[] splitArray = sentence.split(" ");

		HashTable<String, Integer> hashTable = new HashTable<>();
		for (String word : splitArray) {
			//check that word is present in hash table or not
			if (hashTable.keyIsPresent(word)) {
				int value = hashTable.getWord(word);
				hashTable.replaceWord(word, value + 1);//replace word and count it's frequency
			} else {
				hashTable.put(word, 1);//if word not exist then store in hash table
			}
		}
		hashTable.display();
	}

}

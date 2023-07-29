// Java program for the above approach
class HashNode {
	int key;
	int value;
	public HashNode(int key, int value) {
		this.key = key;
		this.value = value;
	}
}

public class Main {
	static int capacity = 20;
	static int size = 0;
	static HashNode[] arr = new HashNode[capacity];
	static HashNode dummy = new HashNode(-1, -1);

	static void insert(int key, int value) {
		HashNode temp = new HashNode(key, value);
		int hashIndex = key % capacity;
		while (arr[hashIndex] != null && arr[hashIndex].key != key && arr[hashIndex].key != -1) {
			hashIndex++;
			hashIndex %= capacity;
		}
		if (arr[hashIndex] == null || arr[hashIndex].key == -1) {
			size++;
		}
		arr[hashIndex] = temp;
	}

	static int deleteKey(int key) {
		int hashIndex = key % capacity;
		while (arr[hashIndex] != null) {
			if (arr[hashIndex].key == key) {
				arr[hashIndex] = dummy;
				size--;
				return 1;
			}
			hashIndex++;
			hashIndex %= capacity;
		}
		return 0;
	}

	static int find(int key) {
		int hashIndex = key % capacity;
		int counter = 0;
		while (arr[hashIndex] != null) {
			if (counter > capacity) {
				break;
			}
			if (arr[hashIndex].key == key) {
				return arr[hashIndex].value;
			}
			hashIndex++;
			hashIndex %= capacity;
			counter++;
		}
		return -1;
	}

	public static void main(String[] args) {
		insert(1, 5);
		insert(2, 15);
		insert(3, 20);
		insert(4, 7);
		if (find(4) != -1) {
			System.out.println("Value of Key 4 = " + find(4));
		} else {
			System.out.println("Key 4 does not exists");
		}
		if (deleteKey(4) == 1) {
			System.out.println("Node value of key 4 is deleted successfully");
		} else {
			System.out.println("Key does not exists");
		}
		if (find(4) != -1) {
			System.out.println("Value of Key 4 = " + find(4));
		} else {
			System.out.println("Key 4 does not exists");
		}
	}
}

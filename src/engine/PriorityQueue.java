package engine;

public class PriorityQueue {

	private Comparable[] elements;
	private int nItems;
	private int maxSize;

	public PriorityQueue(int size) {
		maxSize = size;
		elements = new Comparable[maxSize];
		nItems = 0;
	}

	public void insert(Comparable item) {

		int i;
		for (i = nItems - 1; i >= 0 && item.compareTo(elements[i]) > 0; i--)
			elements[i + 1] = elements[i];

		elements[i + 1] = item;
		nItems++;
	}

	public Comparable remove() {
		nItems--;
		return elements[nItems];
	}

	public boolean isEmpty() {
		return (nItems == 0);
	}

	public boolean isFull() {
		return (nItems == maxSize);
	}

	public Comparable peekMin() {
		return elements[nItems - 1];
	}

	public int size() {
		return nItems;
	}
	
	public Comparable next() {
		return elements[nItems-2];
	}
	public Comparable next1() {
		return elements[nItems-3];
	}
	public Comparable next2() {
		return elements[nItems-4];
	}
	public Comparable next3() {
		return elements[nItems-5];
	}
	public Comparable next4() {
		return elements[nItems-6];
	}
	
	public int getNItems() {
		return nItems;
	}
	
}

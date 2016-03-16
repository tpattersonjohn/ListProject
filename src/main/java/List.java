import java.util.Arrays;

public class List<T extends Comparable<T>> {

	private Object[] elementData;
	private int size;

	public List() {
		this(32);
	}

	public List(int initialCapacity) {

		this.size = 0;

		// capacity will always be at least 1
		int capacity = Math.max(1, initialCapacity);
		this.elementData = new Object[Math.max(1, capacity)];
	}

	// returns the new capacity of the array
	public int ensureCapacity(int minCapacity) {

		int currentCapacity = elementData.length;
		if (minCapacity > currentCapacity) {

			// Keep doubling the array until it has an acceptable minimum
			// capacity
			int newCapacity = currentCapacity;
			while (newCapacity < minCapacity) {
				newCapacity = newCapacity * 2;
			}

			elementData = Arrays.copyOf(elementData, newCapacity);

		}

		return elementData.length;

	}

	public int capacity() {
		return elementData.length;
	}

	public boolean add(T t) {

		ensureCapacity(size + 1);
		elementData[size++] = t;
		return true;

	}

	@SuppressWarnings("unchecked")
	public T get(int index) {
		rangeCheck(index);

		return (T) elementData[index];
	}

	public int size() {
		return size;
	}

	public boolean isEmpty() {
		return size() == 0;
	}

	private void rangeCheck(int index) {
		if (index >= size)
			throw new IndexOutOfBoundsException();
	}

	public void sort() {

		this.quickSort(0, size - 1);

	}

	public void slowsort() {

		this.bubbleSort();

	}

	@SuppressWarnings("unchecked")
	public boolean isSorted() {

		if (size < 2) {
			return true;
		}

		for (int i = 0; i < size - 1; i++) {
			T e1 = (T) this.elementData[i];
			T e2 = (T) this.elementData[i + 1];
			if (e1.compareTo(e2) > 0) {
				return false;
			}
		}

		return true;
	}

	@SuppressWarnings("unchecked")
	private void bubbleSort() {

		for (int i = 0; i < size; i++) {

			int minI = i;
			T minE = (T) this.elementData[minI];

			for (int j = i; j < size; j++) {

				T curE = (T) this.elementData[j];

				if (curE.compareTo(minE) < 0) {
					minE = curE;
					minI = j;
				}

			}

			T temp = (T) this.elementData[minI];
			this.elementData[minI] = this.elementData[i];
			this.elementData[i] = temp;

		}

	}

	@SuppressWarnings("unchecked")
	private void quickSort(int low, int high) {

		int i = low;
		int j = high;

		T pivot = (T) this.elementData[low + (high - low) / 2];

		while (i <= j) {

			T iNum = (T) this.elementData[i];
			T jNum = (T) this.elementData[j];

			while (iNum.compareTo(pivot) < 0) {
				i++;
				iNum = (T) this.elementData[i];
			}

			while (jNum.compareTo(pivot) > 0) {
				j--;
				jNum = (T) this.elementData[j];
			}

			if (i <= j) {
				T temp = (T) this.elementData[i];
				this.elementData[i] = this.elementData[j];
				this.elementData[j] = temp;
				i++;
				j--;
			}
		}

		if (low < j) {
			quickSort(low, j);
		}
		if (i < high) {
			quickSort(i, high);
		}

	}

	@Override
	public String toString() {

		StringBuilder result = new StringBuilder();
		String NEW_LINE = System.getProperty("line.separator");

		for (int i = 0; i < size(); i++) {
			result.append(elementData[i].toString());
			if (i < size - 1) {
				result.append(NEW_LINE);
			}
		}

		return result.toString();
	}

}

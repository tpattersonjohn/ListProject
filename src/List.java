import java.util.Arrays;

public class List<T> {

	private Object[] elementData;
	private int size;
	
	public List(){
		this(32);
	}
	
	public List(int initialCapacity){
		this.size = 0;
		this.elementData = new Object[initialCapacity];
	}
	
	
	
	//returns the new capacity of the array
	public int ensureCapacity(int minCapacity){
		
		int currentCapacity = elementData.length;
		if(minCapacity > currentCapacity){
			
			//Keep doubling the array until it has an acceptable minimum capacity
			int newCapacity = currentCapacity;
			while(newCapacity < minCapacity){
				newCapacity = newCapacity * 2;
			}
			
			elementData = Arrays.copyOf(elementData, newCapacity);
			
			
		}
		
		return elementData.length;
				
	}
	
	public boolean add(T t){
		
		ensureCapacity(size+1);
		elementData[size++] = t;
		return true;
		
	}
	
	@SuppressWarnings("unchecked")
	public T get(int index){
		rangeCheck(index);
		
		return (T) elementData[index];
	}
	
	public int size(){
		return size;
	}
	
	public boolean isEmpty(){
		return size()==0;
	}
	
	private void rangeCheck(int index){
		if (index >= size)
			throw new IndexOutOfBoundsException();
	}
	
	
}

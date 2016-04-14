import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListSet<E> implements Set<E> {
	
	// PECS stands for producer-extends, consumer-super.
	
	private ArrayList<E> elements;
	
	public ArrayListSet() {
		elements = new ArrayList<E>();
	}

	@Override
	public boolean add(E e) {
		if (!elements.contains(e)) {
			elements.add(e);
			return true;
		}

		return false;
	}
	
	@Override
	public boolean remove(E e) {
		if (elements.contains(e)) {
			elements.remove(e);
			return true;
		}

		return false;
	}

	@Override
	public boolean contains(Object o) {
		return elements.contains(o);
	}

	@Override
	public Set<E> intersection(Set<E> other) {
		Set<E> newSet = new ArrayListSet<E>();
		
		for (E e : elements) {
			if (other.contains(e)) {
				newSet.add(e);
			}
		}
		
		return newSet;
	}
	
	@Override
	public Set<E> union(Set<E> other) {
		
		Set<E> newSet = new ArrayListSet<E>();
		
		for (E e : elements) {
			newSet.add(e);
		}
		
		for (E e : other) {
			newSet.add(e);
		}
		
		return null;
	}

	@Override
	public boolean subset(Set<E> other) {
		
		for (E e : other) {
			if (!elements.contains(e)) {
				return false;
			}
		}
		
		return true;
	}

	@Override
	public Iterator<E> iterator() {
		return elements.iterator();
	}
}

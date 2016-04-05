package week05;

public interface Set<E> extends Iterable<E> {

	public boolean add(E e);
	public boolean remove(E e);
	public boolean contains(Object o);
	public Set<E> intersection(Set<E> other);
	public Set<E> union(Set<E> other);
	public boolean subset(Set<E> other);
	public boolean equals(Object o);
}

// Java Iterator interface reference:
// https://docs.oracle.com/javase/8/docs/api/java/util/Iterator.html

class PeekingIterator implements Iterator<Integer> {
    Queue<Integer> list=new LinkedList<>();
	public PeekingIterator(Iterator<Integer> iterator) {
	    // initialize any member here.
        while(iterator.hasNext()){
            list.offer(iterator.next());
        }
	    
	}
	
    // Returns the next element in the iteration without advancing the iterator.
	public Integer peek() {
        return list.peek();
	}
	
	// hasNext() and next() should behave the same as in the Iterator interface.
	// Override them if needed.
	@Override
	public Integer next() {
        Integer num=list.poll();
	    return num;
	}
	
	@Override
	public boolean hasNext() {
	    return !list.isEmpty();
	}
}
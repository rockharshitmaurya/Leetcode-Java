/**
 * // This is the interface that allows for creating nested lists.
 * // You should not implement it, or speculate about its implementation
 * public interface NestedInteger {
 *
 *     // @return true if this NestedInteger holds a single integer, rather than a nested list.
 *     public boolean isInteger();
 *
 *     // @return the single integer that this NestedInteger holds, if it holds a single integer
 *     // Return null if this NestedInteger holds a nested list
 *     public Integer getInteger();
 *
 *     // @return the nested list that this NestedInteger holds, if it holds a nested list
 *     // Return empty list if this NestedInteger holds a single integer
 *     public List<NestedInteger> getList();
 * }
 */
public class NestedIterator implements Iterator<Integer> {
    ArrayList<Integer> arr=new ArrayList<>();
    public NestedIterator(List<NestedInteger> nl) {
       listItem(nl);
    }
    @Override
    public Integer next() {
        return arr.remove(0);
    }
    @Override
    public boolean hasNext() {
     return arr.size()>0;   
    }
    void listItem(List<NestedInteger> list){
        for(var v:list){
           if(v.isInteger()) arr.add(v.getInteger());
            else listItem(v.getList());
        }
    }
}

/**
 * Your NestedIterator object will be instantiated and called as such:
 * NestedIterator i = new NestedIterator(nestedList);
 * while (i.hasNext()) v[f()] = i.next();
 */
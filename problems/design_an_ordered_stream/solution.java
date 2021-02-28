class OrderedStream {
    int ptr;
    String values[];
    public OrderedStream(int n) {
        values=new String[n];
        ptr=0;
    }
    
    public List<String> insert(int id, String value) {
        values[id-1]=value;
         List<String> result = new ArrayList();
        while(ptr<values.length && values[ptr]!=null){
            result.add(values[ptr++]);
        }
        return result;
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n);
 * List<String> param_1 = obj.insert(idKey,value);
 */
class Solution {
    int n;
    boolean visited[];
    List<Integer>[] adj;
    private void DFS(String s, int vertex, List<Character> characters, List<Integer> indices) {
        // Add the character and index to the list
        characters.add(s.charAt(vertex));
        indices.add(vertex);
        
        visited[vertex] = true;
        
        // Traverse the adjacents
        for (int adjacent : adj[vertex]) {
            if (!visited[adjacent]) {
                DFS(s, adjacent, characters, indices);
            }
        }
    }
    public String smallestStringWithSwaps(String s, List<List<Integer>> pairs) {
        int len=s.length();
        n=len;
        visited=new boolean[len];
        adj=new ArrayList[len];
        for(int i=0; i<len; i++){
            adj[i]=new ArrayList<Integer>();
        }
        for(List<Integer> edge:pairs){
            int source=edge.get(0);
            int dest=edge.get(1);
            adj[source].add(dest);
            adj[dest].add(source);
        }
        char ans[]=new char[len];
        for(int v=0; v<len; v++){
            if(!visited[v]){
                List<Character> characters = new ArrayList<>();
                List<Integer> indices = new ArrayList<>();
                DFS(s, v, characters, indices);
                Collections.sort(characters);
                Collections.sort(indices);
                    for (int index = 0; index < characters.size(); index++) {
                    ans[indices.get(index)] = characters.get(index);
                }
            }
        }
        return new String(ans);
    }
}
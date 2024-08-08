import java.sql.Array;
import java.util.*;

//class SynchronizedMapExample {
//    public static void main(String[] args) {
//        Map<String, Integer> map = Collections.synchronizedMap(new ConcurrentHashMap<>());
//
//        // Thread-safe operations
//        map.put("A", 1);
//        map.put("B", 2);
//
//        // Thread-safe access
//        System.out.println(map.get("A"));
//
//        // Iterating requires additional synchronization
//        synchronized (map) {
//            for (Map.Entry<String, Integer> entry : map.entrySet()) {
//                System.out.println(entry.getKey() + ": " + entry.getValue());
//            }
//        }
//    }
//}


//memoization
//public class Test {
//    private static int[] arr;
//    private static int fib(int n){
//        arr = new int[n+1];
//        return Fib(n);
//    }
//    private static int Fib(int n){
//        if(n<=1){
//            return n;
//        }
//        if(arr[n]!=0){
//            return arr[n];
//        }
//        arr[n] = Fib(n-1) + Fib(n-2);
//        return arr[n];
//    }
//   public static void main(String[] args){
//       int n=11;
//       System.out.print(fib(n));
//   }
//}


class Test{
    private int v;
    private List<List<Integer>> adj;
    Test(int v){
        this.v = v;
        adj = new ArrayList<>(v);
        for(int i=0;i<v;i++){
            adj.add(new ArrayList<>()); // v rows of arraylist
        }
    }
    public void addEdge(int v, int w){
        adj.get(v).add(w);
    }

    public void dfs(int s){
        boolean[] visited = new boolean[v];
        dfsUtil(s, visited); //2
    }
    public void dfsUtil(int vertex, boolean[] visited){
        visited[vertex] = true;//2
        System.out.print(vertex + " ");
        for(int n: adj.get(vertex)){
            if(!visited[n]){
                dfsUtil(n, visited);
            }
        }
    }
    public void bfs(int s){
        boolean[] visited = new boolean[v];
        Queue<Integer> q = new LinkedList<>();
        visited[s] = true;

        q.offer(s);
        if(!q.isEmpty()){
            s = q.poll();
            System.out.print(s + " ");
            for(int vertex: adj.get(s)){
                if(!visited[vertex]){
                    visited[vertex] = true;
                    q.offer(vertex);
                }
            }
        }
    }
    public static void main(String[] args){
        Test g = new Test(4);
        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        g.bfs(3);
    }
}
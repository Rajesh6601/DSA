import java.util.ArrayList;

public class Graph1 {
    public static void addEdge(ArrayList<ArrayList<Integer>> al, int u, int v)
    {
        al.get(u).add(v);
        al.get(v).add(u);
    }
    public static void main(String[] args) {
        int v =4;
      ArrayList<ArrayList<Integer>> al = new ArrayList<>(v);
      for(int i =0; i<v; i++)
      {
          al.add(new ArrayList<>());
      }

      addEdge(al, 0, 1);
      addEdge(al, 0, 2);
      addEdge(al, 1, 3);
      addEdge(al, 2, 3);

      System.out.println("Graph ArrayList: "+ al);
    }
}

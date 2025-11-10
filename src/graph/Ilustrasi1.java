package graph;

public class Ilustrasi1 {

    public static void main(String[] args) {
        // Membuat obyek Graph
        Graph graph = new Graph();
        
        // Menambahkan vertex dengan labelnya
        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('E');

        /*
        * Menambahkan adjacency
        * Dari label pertama ke label ke dua dan dengan bobotnya
        */
        graph.addUndirectedEdge('A', 'B', 1);
        graph.addUndirectedEdge('A', 'D', 1);
        graph.addUndirectedEdge('A', 'C', 1);
        graph.addUndirectedEdge('A', 'E', 1);
        graph.addUndirectedEdge('B', 'C', 1);
        graph.addUndirectedEdge('C', 'D', 1);
        graph.addUndirectedEdge('C', 'E', 1);

        // Menampilkan Graph dalam bentuk tabel matriks 
        graph.printAdjacencyMatrix();
        
        System.out.println("DFS Traversal :");
        graph.dfs();
    }
}

package graph;

public class main {

    public static void main(String[] args) {
        // Membuat obyek Graph
        Graph graph = new Graph();
        
        // Menambahkan vertex dengan labelnya
        graph.addVertex('A');
        graph.addVertex('H');
        graph.addVertex('W');
        graph.addVertex('C');
        graph.addVertex('D');

        /*
        * Menambahkan adjacency
        * Dari label pertama ke label ke dua dan dengan bobotnya
        */
        graph.addEdge('A', 'H', 12);
        graph.addEdge('A', 'W', 12);
        graph.addEdge('H', 'W', 12);
        graph.addEdge('W', 'C', 12);
        graph.addEdge('D', 'C', 1);

        // Menampilkan Graph dalam bentuk tabel matriks 
        graph.printAdjacencyMatrix();
        
        System.out.println("DFS Traversal :");
        graph.dfs();
    }
}

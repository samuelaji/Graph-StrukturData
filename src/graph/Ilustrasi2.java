package graph;

public class Ilustrasi2 {

    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addVertex('a');
        graph.addVertex('b');
        graph.addVertex('c');
        graph.addVertex('d');
        graph.addVertex('e');
        graph.addVertex('f');
        graph.addVertex('g');
        graph.addVertex('h');
        graph.addVertex('i');

        graph.addUndirectedEdge('a', 'b', 1);
        graph.addUndirectedEdge('a', 'i', 1);
        graph.addUndirectedEdge('a', 'f', 1);
        graph.addUndirectedEdge('b', 'c', 1);
        graph.addUndirectedEdge('b', 'e', 1);
        graph.addUndirectedEdge('c', 'e', 1);
        graph.addUndirectedEdge('f', 'g', 1);
        graph.addUndirectedEdge('e', 'g', 1);
        graph.addUndirectedEdge('g', 'd', 1);
        graph.addUndirectedEdge('c', 'd', 1);
        graph.addUndirectedEdge('d', 'h', 1);

        // Menampilkan Graph dalam bentuk tabel matriks 
        graph.printAdjacencyMatrix();

        System.out.println("DFS Traversal :");
        graph.dfs();
    }

}

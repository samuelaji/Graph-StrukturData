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
        Menambahkan adjacency
        dari label pertama ke label ke dua dan dengan bobotnya
        */
        graph.addEdge('A', 'H', 100);
        graph.addEdge('A', 'W', 800);
        graph.addEdge('H', 'W', 750);
        graph.addEdge('W', 'C', 400);
        graph.addEdge('D', 'C', 370);

        // Menampilkan Graph dalam bentuk tabel matriks 
        graph.printAdjacencyMatrix();
    }
}

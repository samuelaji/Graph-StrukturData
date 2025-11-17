package graph;

public class BFS1 {

    public static void main(String[] args) {
        Graph graph = new Graph();

        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('E');
        graph.addVertex('F');

        graph.addUndirectedEdge('A', 'B', 1);
        graph.addUndirectedEdge('A', 'C', 1);
        graph.addUndirectedEdge('A', 'D', 1);
        graph.addUndirectedEdge('B', 'C', 1);
        graph.addUndirectedEdge('C', 'D', 1);
        graph.addUndirectedEdge('B', 'E', 1);
        graph.addUndirectedEdge('C', 'E', 1);
        graph.addUndirectedEdge('C', 'F', 1);
        graph.addUndirectedEdge('D', 'F', 1);

        graph.printAdjacencyMatrix();
        
        System.out.print("BFS Traversal : ");
        graph.bfs();
    }

}

package graph;

public class BFS2 {

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
        graph.addUndirectedEdge('c', 'd', 1);
        graph.addUndirectedEdge('c', 'e', 1);
        graph.addUndirectedEdge('e', 'g', 1);
        graph.addUndirectedEdge('g', 'd', 1);
        graph.addUndirectedEdge('g', 'f', 1);
        graph.addUndirectedEdge('d', 'h', 1);

        graph.printAdjacencyMatrix();
        
        System.out.print("BFS Traversal : ");
        graph.bfs();
    }
}
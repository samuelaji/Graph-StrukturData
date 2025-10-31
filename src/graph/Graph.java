package graph;

public class Graph {

    public final int maxVertex = 10;
    private final Vertex[] vertexList;
    private final int[][] adjacencyMatrix;
    private int countVertex;

    public Graph() {
        this.vertexList = new Vertex[maxVertex];
        this.adjacencyMatrix = new int[maxVertex][maxVertex];
        this.countVertex = 0;

        for (int i = 0; i < maxVertex; i++) {
            for (int j = 0; j < maxVertex; j++) {
                if (i == j) {
                    this.adjacencyMatrix[i][j] = 0;
                } else {
                    this.adjacencyMatrix[i][j] = -1;
                }
            }
        }
    }

    public void addVertex(char node) {
        if (this.countVertex < this.maxVertex) {
            this.vertexList[countVertex++] = new Vertex(node);
        }
    }

    public void addEdge(int a, int b, int c) {
        this.adjacencyMatrix[a][b] = c;
        this.adjacencyMatrix[b][a] = c;
    }

    public int indexVertex(char label) {
        for (int i = 0; i < vertexList.length; i++) {
            if (this.vertexList[i] != null) {
                if (this.vertexList[i].getLabel() == label) {
                    return i;
                }
            }
        }
        return -1;
    }

    public void addEdge(char a, char b, int c) {
        addEdge(indexVertex(a), indexVertex(b), c);
    }

    public void printAdjacencyMatrix() {
        for (int z = 0; z < countVertex; z++) {
            System.out.print("\t" + vertexList[z].getLabel());
        }
        System.out.println();
        System.out.println();

        for (int i = 0; i < countVertex; i++) {
            System.out.print(vertexList[i].getLabel() + "\t");

            for (int j = 0; j < countVertex; j++) {
                System.out.print(this.adjacencyMatrix[i][j] + "\t");
            }
            System.out.println();
            System.out.println();
        }
    }
}

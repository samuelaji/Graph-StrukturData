package graph;

import java.util.Stack;

// Membangun graph
public class Graph {

    // Inisialisasi
    //Jumlah maksimal vertex(Kelemahan : tidak fleksible dikarenakan menggunakan array 1 dimensi)
    public final int maxVertex = 10;
    // Menyimpan kumpulan vertex dalam array
    private final Vertex[] vertexList;
    // Menghubungkan antar node (adjacency)
    private final int[][] adjacencyMatrix;
    // Penghitung vertex
    private int countVertex;

    // Constructor
    public Graph() {
        // Membuat dan menyimpan objek vertex (simpul) 
        this.vertexList = new Vertex[maxVertex];
        // Menyimpan adjacency (edge) dari 2 obyek vertex (node)
        this.adjacencyMatrix = new int[maxVertex][maxVertex];
        // Inisialisasi penghitung vertex dimulai dari 0
        this.countVertex = 0;

        /*
        * Nested loop untuk memberikan nilai default pada adjacency (edge)
        * Nilai 0 untuk adjacency vertex yang terhubung dengan diri sendiri dalam martriks
        * Nilai -1 untuk adjacency vertex yang tidak terhubung dengan vertex lain
         */
        // Pindah antar baris
        for (int i = 0; i < maxVertex; i++) {
            // Pindah antar kolom
            for (int j = 0; j < maxVertex; j++) {
                // Perbandingan
                if (i == j) {
                    this.adjacencyMatrix[i][j] = 0;
                } else {
                    this.adjacencyMatrix[i][j] = -1;
                }
            }
        }
    }

    // Menyimpan vertex (node) ke dalam vertexList dengan value indeks dari countVertex increment
    public void addVertex(char node) {
        // Mengecek apakah penghitung vertexnya masih kurang dari jumlah maxVertex (Mencegah terjadi error NullPointer)
        if (this.countVertex < this.maxVertex) {
            this.vertexList[countVertex++] = new Vertex(node);
        }
    }

    /*
    * Menambahkan adjacency (edge), menghubungkan antara 2 simpul dan memberikan bobot pada adjacency vertex
    * Menggunakan indeks dalam parameternya 
    * Menentukan bobot adjacency (int c)
     */
    public void addEdge(int a, int b, int c) {
        // vertex undirected
        this.adjacencyMatrix[a][b] = c;
        this.adjacencyMatrix[b][a] = c;
    }

    // Menentukan indeks vertex dari labelnya
    public int indexVertex(char label) {
        // Menelusur array dalam vertexList
        for (int i = 0; i < vertexList.length; i++) {
            // Jika vertexList pada indeks i tidak kosong
            if (this.vertexList[i] != null) {
                // Jika ditemukan label pada vertexList indeks i  sama dengan label dalam parameter
                if (this.vertexList[i].getLabel() == label) {
                    // Mengembalikan nilai indeks yang ditemukan
                    return i;
                }
            }
        }
        // Mengembalikan nilai -1 untuk tidak ditemukan
        return -1;
    }

    /*
    * Menambahkan adjacency (edge), menghubungkan antara 2 simpul dan memberikan bobot pada adjacency vertex
    * Menggunakan nilai label vertex dalam parameternya (lebih mudah dimengerti)
    * Menggunakan method indexVertex untuk menentukan indeks dari label pada parameter yang ditentukan 
    * Menentukan bobot adjacency (int c)
     */
    public void addEdge(char a, char b, int c) {
        addEdge(indexVertex(a), indexVertex(b), c);
    }

    //Mencetak / menampilkan graph dalam bentuk tabel matriks
    public void printAdjacencyMatrix() {
        // Menampilkan label horizontal
        for (int z = 0; z < countVertex; z++) {
            System.out.print("\t" + vertexList[z].getLabel());
        }
        System.out.println();
        System.out.println();

        // Menampilkan label di awal (vertikal) sebelum nilai adjacency
        for (int i = 0; i < countVertex; i++) {
            System.out.print(vertexList[i].getLabel() + "\t");

            // Menampilkan bobot adjacency 
            for (int j = 0; j < countVertex; j++) {
                System.out.print(this.adjacencyMatrix[i][j] + "\t");
            }
            System.out.println();
            System.out.println();
        }
    }

    // Inisialisasi titik awal 
    public void dfs() {
        int seed = 0;
        dfs(seed);
    }

    // Telusur
    public void dfs(int seed) {
        // Inisialisasi Stack
        Stack<Integer> stack = new Stack();
        // Memasukkan vertex awal ke dalam stack
        stack.push(seed);

        // Dilakukan selama stacknya tidak kosong
        while (!stack.isEmpty()) {
            // Menghapus stack x
            int x = stack.pop();
            if (vertexList[x].flagVisited == false) {
                System.out.print(vertexList[x].getLabel() + " ");
                vertexList[x].flagVisited = true;
                for (int i = vertexList.length - 1; i >= 0; i--) {
                    if (adjacencyMatrix[x][i] >= 1 && vertexList[i].flagVisited == false) {
                        stack.push(i);
                    }
                } 
            }
        }
        System.out.println();
    }
}

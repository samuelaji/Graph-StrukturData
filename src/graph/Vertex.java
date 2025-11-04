package graph;
// Membuat obyek vertex(node)

public class Vertex {

    // Inisialisasi variable label untuk memberikan nama vertex
    private char label;
    boolean flagVisited;

    public Vertex(char label) {
        this.label = label;
        //inisialisasi awal belum dikunjungi
        this.flagVisited = false;
    }

    public char getLabel() {
        return label;
    }

    public void setLabel(char label) {
        this.label = label;
    }
}

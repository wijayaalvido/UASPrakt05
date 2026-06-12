public class BinarySearchTree05 {
    NodeFilm05 root;

public BinarySearchTree05() {
        this.root = null;
    }

    boolean isEmpty() {
        return root == null;
    }
    
    void add(Film05 data) {
        NodeFilm05 newNode = new NodeFilm05(data);
        if (isEmpty()) {
            root = newNode;
        return;
    }
        NodeFilm05 current = root;
        while (true) {
            if (data.kodeFilm.compareTo(current.data.kodeFilm) < 0) {
                if (current.left == null) {
                    current.left = newNode;
                    return;
                }
                current = current.left;
            } else {
                if (current.right == null) {
                    current.right = newNode;
                    return;
                }
                current = current.right;
            }
        }
    }


    boolean find (String kodeFilm) {
        NodeFilm05 current = root;
        while (current != null) {
            if (kodeFilm.equals(current.data.kodeFilm)) {
                return true;
            } else if (kodeFilm.compareTo(current.data.kodeFilm) < 0) {
                current = current.left;
            } else {
                current = current.right;
            }
        }
        return false;
    }


    void traverseInOrder(NodeFilm05 node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.println(
                node.data.kodeFilm + " - "
                + node.data.judul + " - "
                + node.data.genre + " - "
                + node.data.rating);

            traverseInOrder(node.right);
        }
    }


    void traversePreOrder(NodeFilm05 node) {
        if (node != null) {

            System.out.println(
                node.data.kodeFilm + " - "
                + node.data.judul + " - "
                + node.data.genre + " - "
                + node.data.rating);

            traversePreOrder(node.left);
            traversePreOrder(node.right);
        }
    }
    

    int hitungJumlahFilm(NodeFilm05 node) {
        if (node == null) {
            return 0;
        }

        return 1
            + hitungJumlahFilm(node.left)
            + hitungJumlahFilm(node.right);
    }
    
    
    Film05 cariFilmTertinggi(NodeFilm05 node) {
        if (node == null) {
            return null;
        }

        Film05 filmTertinggi = node.data;
        Film05 leftMax = cariFilmTertinggi(node.left);
        Film05 rightMax = cariFilmTertinggi(node.right);

        if (leftMax != null && leftMax.rating > filmTertinggi.rating) {
            filmTertinggi = leftMax;
        }

        if (rightMax != null && rightMax.rating > filmTertinggi.rating) {
            filmTertinggi = rightMax;
        }

        return filmTertinggi;
    }
}
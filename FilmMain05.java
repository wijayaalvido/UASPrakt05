public class FilmMain05 {
    public static void main(String[] args) {
        BinarySearchTree05 bst = new BinarySearchTree05();

        bst.add(new Film05("FL105", "Interstellar", "Sci-Fi", 8.6));
        bst.add(new Film05("FL102", "Coco", "Animation", 8.4));
        bst.add(new Film05("FL108", "Inception", "Sci-Fi", 8.8));
        bst.add(new Film05("FL101", "Up", "Animation", 8.3));
        bst.add(new Film05("FL104", "Parasite", "Thriller", 8.5));
        bst.add(new Film05("FL107", "Spirited Away", "Fantasy", 8.6));

        System.out.println("In-order Traversal:");
        bst.traverseInOrder(bst.root);

        System.out.println("\nPre-order Traversal:");
        bst.traversePreOrder(bst.root);

        System.out.println();

       if (bst.find("FL104")) {
            System.out.println("Pencarian FL104 : ditemukan.");
        } else {
            System.out.println("Pencarian FL104 : tidak ditemukan.");
        }

        if (bst.find("FL110")) {
            System.out.println("Pencarian FL110 : ditemukan.");
        } else {
            System.out.println("Pencarian FL110 : tidak ditemukan.");
        }

        System.out.println("\nJumlah film : "
        + bst.hitungJumlahFilm(bst.root));

        Film05 tertinggi =
        bst.cariFilmTertinggi(bst.root);

        System.out.println("\nFilm dengan rating tertinggi : ");
        System.out.println("Kode Film : " + tertinggi.kodeFilm);
        System.out.println("Judul     : " + tertinggi.judul);
        System.out.println("Genre     : " + tertinggi.genre);
        System.out.println("Rating    : " + tertinggi.rating);
       }
    }
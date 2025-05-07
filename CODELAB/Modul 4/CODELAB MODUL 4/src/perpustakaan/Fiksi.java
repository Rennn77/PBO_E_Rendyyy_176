package perpustakaan;

public class Fiksi extends Buku {

    public Fiksi(String judul, String penulis, String genre){
        super(judul, penulis, genre);

    }

    @Override
    public void displayInfo(){
        System.out.println("perpustakaan.Buku perpustakaan.Fiksi: " + judul + " oleh " + penulis + "(Genre: " + genre + ")");

    }
}

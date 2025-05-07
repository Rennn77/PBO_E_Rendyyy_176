package perpustakaan;

public class NonFiksi extends Buku {

    public NonFiksi(String judul, String penulis, String genre){
        super(judul, penulis, genre);
    }

    @Override
    public void displayInfo(){
        System.out.println("perpustakaan.Buku Non-perpustakaan.Fiksi: " + judul + " oleh " + penulis + " (Bidang: " + genre + ")");
    }
}

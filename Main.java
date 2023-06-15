public class Main {
    public static void main(String[] args) {
       Screening screening = new Screening();

        Pendaftar[] pendaftarArr = {
        new KetuaPelaksana("Joko", "1111111111111", 5, true, true),
        new KetuaPelaksana("Anisa", "2222222222222", 5, true, true),
        new KetuaPelaksana("Wati", "3333333333333", 5, true, false),
        new KetuaPelaksana("Bowo", "4444444444444", 2, true, true),
        new DDM("Siti", "5555555555555", 3, true, true),
        new DDM("Jordi", "6666666666666", 4, true, true),
        new DDM("Wiwik", "7777777777777", 2, true, true),
        new DDM("Agus", "8888888888888", 4, false, true),
        new Staff("Putri", "9999999999999", 4, true),
        new Staff("Ayu", "1010101010101", 2, false),
        };

        for (Pendaftar pendaftar : pendaftarArr) {
            screening.tambahPendaftar(pendaftar, pendaftar.seleksi());
        }

        screening.tampilkanDaftarLolosDanTidakLolos();
    }
}

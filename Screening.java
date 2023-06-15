import java.util.ArrayList;

public class Screening {
    private ArrayList<Pendaftar> lolosList;
    private ArrayList<Pendaftar> tidakLolosList;
    static int tanggalMulai = 23;

    public Screening() {
        lolosList = new ArrayList<>();
        tidakLolosList = new ArrayList<>();
    }

    public void tambahPendaftar(Pendaftar pendaftar, boolean lolos) {
            if (lolos) {
                lolosList.add(pendaftar);
            } else {
                tidakLolosList.add(pendaftar);
            }
        }

    public void info(ArrayList<Pendaftar> lolos, int tanggal) {
    System.out.println("Tanggal Wawancara: " + tanggal + " Agustus 2023");
    System.out.println("================================");
    int count = 0;
    for (Pendaftar pendaftar : lolos) {
        System.out.println("Nama: " + pendaftar.getNama());
        System.out.println("NIM: " + pendaftar.getNIM());
        
        if (pendaftar instanceof KetuaPelaksana) {
            System.out.println("Pilihan: Ketua Pelaksana");
        } else if (pendaftar instanceof DDM) {
            System.out.println("Pilihan: DDM");
        } else if (pendaftar instanceof Staff) {
            System.out.println("Pilihan: Staff");
        }
        
        System.out.println();
        
        count++;
        if (count == 3) {
            count = 0;
            tanggal++;
            System.out.println("================================");
            System.out.println("Tanggal Wawancara: " + tanggal + " Agustus 2023");
            System.out.println("================================");
        }
    }
    System.out.println();
}


    public void info(ArrayList<Pendaftar> tidakLolos) {
        for (Pendaftar pendaftar : tidakLolos) {
            System.out.println("Nama: " + pendaftar.getNama());
            System.out.println("NIM: " + pendaftar.getNIM());
            System.out.println();
        }
    }

    

    public void tampilkanDaftarLolosDanTidakLolos() {
        System.out.println("Daftar Peserta Lolos:");
        info(lolosList,tanggalMulai);
        System.out.println("Daftar Peserta Tidak Lolos:");
        info(tidakLolosList);
    }
}



public class KetuaPelaksana extends Pendaftar implements Portofolio {
    private boolean portofolio;

    public KetuaPelaksana(String nama, String NIM, int semester, boolean berkas, boolean portofolio) {
        super(nama, NIM, semester, berkas);
        this.portofolio = portofolio;
    }

    public boolean isPortofolioLengkap() {
        return portofolio;
    }

    public boolean seleksi() {
        return (getSemester() == 5 && isBerkasLengkap() && isPortofolioLengkap());
    }
}


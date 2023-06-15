public class DDM extends Pendaftar implements Portofolio {
    private boolean portofolio;

    public DDM(String nama, String NIM, int semester, boolean berkas, boolean portofolio) {
        super(nama, NIM, semester, berkas);
        this.portofolio = portofolio;
    }

    public boolean isPortofolioLengkap() {
        return portofolio;
    }

    public boolean seleksi() {
        return (getSemester() >= 3 && isBerkasLengkap() && isPortofolioLengkap());
    }
}


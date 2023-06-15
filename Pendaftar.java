public abstract class Pendaftar {
    private String nama;
    private String NIM;
    private int semester;
    private boolean berkas;

    public Pendaftar(String nama, String NIM, int semester, boolean berkas) {
        this.nama = nama;
        this.NIM = NIM;
        this.semester = semester;
        this.berkas = berkas;
    }

    public String getNama() {
        return nama;
    }

    public String getNIM() {
        return NIM;
    }

    public int getSemester() {
        return semester;
    }

    public boolean isBerkasLengkap() {
        return berkas;
    }

    public abstract boolean seleksi();
}


public class Staff extends Pendaftar {
    public Staff(String nama, String NIM, int semester, boolean berkas) {
        super(nama, NIM, semester, berkas);
    }

    public boolean seleksi() {
        return (getSemester() >= 3 && isBerkasLengkap());
    }
}


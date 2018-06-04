package co.mamat.smsgatewaypjar;

public class Pesan {

    private String nomor;
    private String message;


    public String getNomor() {
        return nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Pesan() {}

    public Pesan(String nomor, String message) {
        this.message = message;
        this.nomor = nomor;
    }

}

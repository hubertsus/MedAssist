public class Arzt {
    // Attribute
    private int arztID;
    private String name;
    private String fachgebiet;
    private String sprechstundenzeiten; // z.B. "Mo-Fr 08:00-16:00"
    private String telefonnummer;
    private String email;

    // Konstruktor
    public Arzt(int arztID, String name, String fachgebiet, String sprechstundenzeiten, String telefonnummer, String email) {
        this.arztID = arztID;
        this.name = name;
        this.fachgebiet = fachgebiet;
        this.sprechstundenzeiten = sprechstundenzeiten;
        this.telefonnummer = telefonnummer;
        this.email = email;
    }

    // Getter-Methoden
    public int getArztID() {
        return arztID;
    }

    public String getName() {
        return name;
    }

    public String getFachgebiet() {
        return fachgebiet;
    }

    public String getSprechstundenzeiten() {
        return sprechstundenzeiten;
    }

    public String getTelefonnummer() {
        return telefonnummer;
    }

    public String getEmail() {
        return email;
    }

    // Setter-Methoden
    public void setSprechstundenzeiten(String sprechstundenzeiten) {
        this.sprechstundenzeiten = sprechstundenzeiten;
    }

    public void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Weitere Methoden können bei Bedarf hinzugefügt werden
}

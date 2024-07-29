public class Patient {
    // Attribute
    private int patientenID;
    private String name;
    private String geburtsdatum; // im Format "YYYY-MM-DD"
    private String adresse;
    private String telefonnummer;
    private String email;

    // Konstruktor
    public Patient(int patientenID, String name, String geburtsdatum, String adresse, String telefonnummer, String email) {
        this.patientenID = patientenID;
        this.name = name;
        this.geburtsdatum = geburtsdatum;
        this.adresse = adresse;
        this.telefonnummer = telefonnummer;
        this.email = email;
    }

    // Getter-Methoden
    public int getPatientenID() {
        return patientenID;
    }

    public String getName() {
        return name;
    }

    public String getGeburtsdatum() {
        return geburtsdatum;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getTelefonnummer() {
        return telefonnummer;
    }

    public String getEmail() {
        return email;
    }

    // Setter-Methoden
    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
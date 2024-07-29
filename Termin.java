import java.time.LocalDateTime;

public class Termin {
    // Attribute
    private int terminID;
    private int patientenID;
    private int arztID;
    private LocalDateTime datumUhrzeit; // Kombination aus Datum und Uhrzeit
    private String behandlungsgrund;

    // Konstruktor
    public Termin(int terminID, int patientenID, int arztID, LocalDateTime datumUhrzeit, String behandlungsgrund) {
        this.terminID = terminID;
        this.patientenID = patientenID;
        this.arztID = arztID;
        this.datumUhrzeit = datumUhrzeit;
        this.behandlungsgrund = behandlungsgrund;
    }

    // Getter-Methoden
    public int getTerminID() {
        return terminID;
    }

    public int getPatientenID() {
        return patientenID;
    }

    public int getArztID() {
        return arztID;
    }

    public LocalDateTime getDatumUhrzeit() {
        return datumUhrzeit;
    }

    public String getBehandlungsgrund() {
        return behandlungsgrund;
    }

    // Setter-Methoden
    public void setDatumUhrzeit(LocalDateTime datumUhrzeit) {
        this.datumUhrzeit = datumUhrzeit;
    }

    public void setBehandlungsgrund(String behandlungsgrund) {
        this.behandlungsgrund = behandlungsgrund;
    }

    // Weitere Methoden können bei Bedarf hinzugefügt werden
}

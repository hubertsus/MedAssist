import java.time.LocalDateTime;

public class main {
    public static void main(String[] args) {
        // Erstellen eines Patienten
        Patient patient1 = new Patient(1, "Max Mustermann", "1990-05-14", "Musterstraße 1, 12345 Musterstadt", "01234/567890", "max@mustermann.de");

        // Erstellen eines Arztes
        Arzt arzt1 = new Arzt(1, "Dr. Hans Müller", "Allgemeinmedizin", "Mo-Fr 08:00-16:00", "01234/987654", "dr.mueller@arztpraxis.de");

        // Erstellen eines Termins
        LocalDateTime terminDatumUhrzeit = LocalDateTime.of(2024, 8, 15, 10, 30); // 15. August 2024 um 10:30 Uhr
        Termin termin1 = new Termin(1, patient1.getPatientenID(), arzt1.getArztID(), terminDatumUhrzeit, "Routineuntersuchung");

        // Ausgabe der Patientendaten
        System.out.println("PatientenID: " + patient1.getPatientenID());
        System.out.println("Name: " + patient1.getName());
        System.out.println("Geburtsdatum: " + patient1.getGeburtsdatum());
        System.out.println("Adresse: " + patient1.getAdresse());
        System.out.println("Telefonnummer: " + patient1.getTelefonnummer());
        System.out.println("Email: " + patient1.getEmail());

        // Ausgabe der Arztdaten
        System.out.println("\nArztID: " + arzt1.getArztID());
        System.out.println("Name: " + arzt1.getName());
        System.out.println("Fachgebiet: " + arzt1.getFachgebiet());
        System.out.println("Sprechstundenzeiten: " + arzt1.getSprechstundenzeiten());
        System.out.println("Telefonnummer: " + arzt1.getTelefonnummer());
        System.out.println("Email: " + arzt1.getEmail());

        // Ausgabe der Termindaten
        System.out.println("\nTerminID: " + termin1.getTerminID());
        System.out.println("PatientenID: " + termin1.getPatientenID());
        System.out.println("ArztID: " + termin1.getArztID());
        System.out.println("Datum und Uhrzeit: " + termin1.getDatumUhrzeit());
        System.out.println("Behandlungsgrund: " + termin1.getBehandlungsgrund());
    }
}

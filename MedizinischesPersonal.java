package apa;

public class MedizinischesPersonal extends Nutzer {
	
	private String role;
	private List<Appointment>appointments;
	
	public MedizinischesPersonal(String id, String name, String email, String password, String role, List<Appointment>appointments) {
		super(id, name, email, password);
		this.role = role;
		this.appointments = appointments;
		// TODO fix constructor
	}
	
}

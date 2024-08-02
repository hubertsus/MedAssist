package apa;

class Nutzer {

	private String id;
	private String name;
	private String email;
	private String password;
	//TODO verschlüsselung für Passwort
	
	public Nutzer (String id, String name, String email, String password) {
		this.setId(id);
		this.setName(name);
		this.setEmail(email);
		this.setPassword(password);
	}

	
	//getter setter block
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	//TODO login Methode
	public void login(String email, String password) {
	
	}
	
	//TODO logout Methode
	public void logout() {
		
	}
}

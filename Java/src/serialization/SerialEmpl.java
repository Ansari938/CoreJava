package serialization;

import java.io.Serializable;

public class SerialEmpl implements Serializable {
	private int id;
	private String firstname;
	private String lastname;

	public SerialEmpl(int id, String lastname, String firstname) {
		this.id = id;
		this.firstname = firstname;
		this.lastname = lastname;

	}

	private void SerialEmpl() {
		// TODO Auto-generated method stub

	}

	public int getId() {
		return id;
	}

	public String getFirstname() {
		return firstname;
	}

	public String getLastname() {
		return lastname;
	}

}

package ma.zaari.car.app.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "clients")
public class Client {
	@Id
	@GeneratedValue
	private int id;
	private String firstName;
	private String lastName;
	private String gmail;
	private String password;
	public Client() {
		// TODO Auto-generated constructor stub
	}
	public Client( String firstName, String lastName, String gmail, String password) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.gmail = gmail;
		this.password = password;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getGmail() {
		return gmail;
	}
	public void setGmail(String gmail) {
		this.gmail = gmail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	@Override
	public String toString() {
		return "Client [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", gmail=" + gmail
				+ ", password=" + password + "]";
	}
	
		
	
	
}

package comm.example.springdemo;

import java.util.LinkedHashMap;

public class Student {

	// @NotNull(message = "field can't be null")
	// @Size(min = 1,message = "first name required")
	private int id;
	private String firstName;
	private String lastName;
	private String country;
	private String favoriteLanguage;
	private String[] operatingSystems;
	private String operating;
	private LinkedHashMap<String, String> countries = new LinkedHashMap<String, String>();

	public Student() {
		super();
		countries.put("BR", "Brazil");
		countries.put("IN", "India");
		countries.put("US", "United States");
		countries.put("FR", "France");

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

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public LinkedHashMap<String, String> getCountries() {
		return countries;
	}

	public String getFavoriteLanguage() {
		return favoriteLanguage;
	}

	public void setFavoriteLanguage(String favoriteLanguage) {
		this.favoriteLanguage = favoriteLanguage;
	}

	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	public String getOperating() {
		return operating;
	}

	public void setOperating(String operating) {
		this.operating = operating;
	}
	
	

}

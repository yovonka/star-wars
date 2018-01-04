package eaasyPackage;

import java.util.LinkedHashMap;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class User {
	
	@NotNull(message="is required")
	@Size(min=1, message="is required")
	private String lastName;
	
	@NotNull(message="is required")
	@Min(value=0, message="must be greater than or equal to zero")
	@Max(value=8, message="must be less than or equal to eight")
	private Integer favoritePart;
	
	@Pattern(regexp="^[a-zA-z0-9]{5}", message="only 5 char/digits")
	private String postalCode;
	
	private String firstName;
	private String country;
	private String favoriteJedi;
	
	private LinkedHashMap<String,String> countryOptions;
	private LinkedHashMap<String, String> favoriteJediOptions;
	private String[] operatingSystems;
	
	
	public User() {
		countryOptions = new LinkedHashMap<>();
		countryOptions.put("BR", "Brazil");
		countryOptions.put("DE", "Germany");
		countryOptions.put("IN", "India");
		countryOptions.put("PL", "Poland");
		
		favoriteJediOptions = new LinkedHashMap<>();
	    favoriteJediOptions.put("AS","Anakin Skywalker");
	    favoriteJediOptions.put("LS","Luke Skywalker");
	    favoriteJediOptions.put( "Yoda","Yoda");
	    favoriteJediOptions.put("OWK","Obi-Wan Kenobi"); 
	}
	public Integer getFavoritePart() {
		return favoritePart;
	}

	public void setFavoritePart(Integer favoritePart) {
		this.favoritePart = favoritePart;
	}
	public String[] getOperatingSystems() {
		return operatingSystems;
	}

	public void setOperatingSystems(String[] operatingSystems) {
		this.operatingSystems = operatingSystems;
	}

	public String getFavoriteJedi() {
		return favoriteJedi;
	}

	public void setFavoriteJedi(String favoriteJedi) {
		this.favoriteJedi = favoriteJedi;
	}
    public LinkedHashMap<String, String> getFavoriteJediOptions() {
        return favoriteJediOptions;
    }
	
	public LinkedHashMap<String, String> getCountryOptions() {
		return countryOptions;
	}

	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
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
	public String getPostalCode() {
		return postalCode;
	}
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	

}

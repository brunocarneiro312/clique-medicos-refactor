package main.java.com.hepta.cliquemedicos.dto.pagseguro;

import com.fasterxml.jackson.xml.annotate.JacksonXmlRootElement;

@JacksonXmlRootElement(localName = "billingAddress")
public class BillingAddressDTO {
	private String number;
	private String district;
	private String city;
	private String state;
	private String country;
	private String postalCode;
	private String complement;
	private String street;

	public BillingAddressDTO() {
		super();
	}
	
	public boolean validarCampos() {
		if (this.getPostalCode() != null
				&& this.getStreet() != null
				&& !this.getPostalCode().isEmpty()
				&& !this.getStreet().isEmpty())
			return true;
		return false;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getDistrict() {
		return district;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getComplement() {
		return complement;
	}

	public void setComplement(String complement) {
		this.complement = complement;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}
	
}

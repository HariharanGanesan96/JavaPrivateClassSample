package customer;

import java.util.Objects;

public class CustomerClass {
        
	 private long customerId;
	 private String firstName,lastName,gender,email,phoneNumber,address;
	public long getCustomerId() {
		return customerId;
	}
	public void setCustomerId(long customerId) {
		this.customerId = customerId;
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
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public CustomerClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	public CustomerClass(long customerId, String firstName, String lastName, String gender, String email,
			String phoneNumber, String address) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.gender = gender;
		this.email = email;
		this.phoneNumber = phoneNumber;
		this.address = address;
	}
	@Override
	public String toString() {
		return "customerId:" + customerId +
				"\nfirstName=" + firstName +
				"\nlastName=" + lastName+
				"\ngender=" + gender +
				"\nemail=" + email +
				"\nphoneNumber=" + phoneNumber +
				"\naddress=" + address;
	}
	@Override
	public int hashCode() {
		return Objects.hash(address, customerId, email, firstName, gender, lastName, phoneNumber);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CustomerClass other = (CustomerClass) obj;
		return Objects.equals(address, other.address) && customerId == other.customerId
				&& Objects.equals(email, other.email) && Objects.equals(firstName, other.firstName)
				&& Objects.equals(gender, other.gender) && Objects.equals(lastName, other.lastName)
				&& Objects.equals(phoneNumber, other.phoneNumber);
	}
	 





}
